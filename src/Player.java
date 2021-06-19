import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Naga{
  public Armor[] listArmor = new Armor[20];
  public ArrayList<Potion> item = new ArrayList<>();
  public ArrayList<Integer> jmlItem = new ArrayList<>();
  public ArrayList<Potion> potion = new ArrayList<>();
  public ArrayList<Integer> jmlPotion = new ArrayList<>();
  private Armor armor;
  public int jmlArmor;
  private int levelCharacter;
  private int levelPoint;
  private boolean isWearArmor;
  private int coins;
  private int defense;

  public Player(String vElement, int vHP, Jurus vJurus, Armor vArmor,DragonCenter dc,int coins){
    this.jmlElement = 0;
    this.jmlJurus = 0;
    this.jmlArmor = 0;
    this.jmlCurrJurus =0;
    this.setElement(vElement,this.getJmlElement());
    this.setHealthPoint(vHP);
    this.setJurus(vJurus, this.getJmlJurus());
    this.setCurrJurus(vJurus, this.getJmlCurrJurus());
    this.setListArmor(vArmor,0);
    this.setLevelCharacter(1);
    this.setLevelPoint(0);
    this.setIsWearArmor(false);
    this.setCoins(coins);
  }

  public void setArmor(Armor vArmor){
    this.armor = vArmor;
    this.setDefense(vArmor.defenseLevel[vArmor.level[0]-1]);
  }

  public void setListArmor(Armor vArmor, int i){
    this.listArmor[i] = vArmor;
    this.jmlArmor++;
  }

  public void setLevelCharacter(int vLevelCharacter){
    this.levelCharacter = vLevelCharacter;
  }

  public void setLevelPoint(int vLevelPoint){
    this.levelPoint =vLevelPoint;
  }

  public void setIsWearArmor(boolean vIsWearArmor){
    this.isWearArmor = vIsWearArmor;
  }

  public void setCoins(int vCoins){
    this.coins = vCoins;
  }

  public void setDefense(int vDefense){
    this.defense = vDefense;
  }

  public Armor getArmor(){
    return armor;
  }

  public int getLevelCharacter(){
    return levelCharacter;
  }

  public int getLevelPoint(){
    return levelPoint;
  }

  public boolean getIsWearArmor(){
    return isWearArmor;
  }

  public int getJmlArmor(){
    return jmlArmor;
  }

  public int getCoins(){
    return this.coins;
  }

  public int getDefense(){
    return this.defense;
  }

  public void levelUpCharacter(){
    this.levelCharacter++;
  }

  public void wearArmor(Player p, int i){
    p.setArmor(p.listArmor[i]);
    p.setIsWearArmor(true);
  }

  @Override
  public boolean isAvailable(Senjata a){
    boolean out = false;
    for(int i=0;i<this.getJmlArmor();i++){
      if(a.getName().equals(this.listArmor[i].getName())){
        out = true;
      }
    }
    return out;
  }

  public boolean isAvailable(Jurus j){
    return super.isAvailable(j);
  }

  public boolean isAvailable(Potion ptn){
    boolean out = false;
    for(int i=0;i<this.potion.size();i++){
      if(ptn.getNama().equals(this.potion.get(i).getNama())){
        out = true;
      }
    }
    return out;
  }

  public void print(){
    System.out.println();
    for(int i=0;i<this.getJmlArmor();i++){
      System.out.println((i+1)+". "+this.listArmor[i].getName());
    }
  }

  public boolean isJurusAlreadyUsed(Player p, int index){
    boolean out = false;
    for(int i=0;i<p.getJmlCurrJurus();i++){
      if(p.jurus[index].getName().equals(p.currJurus[i].getName())){
        out = true;
      }
    }
    return out;
  }
  
  public boolean isCurrJurusFull(Player p){
    if(p.jmlCurrJurus <4){
      return false;
    }
    else{
      return true;
    }
  }

  public void lepasJurus(Player p, int pil){
    GameEngine E = new GameEngine();
    if(pil < p.getJmlCurrJurus() && pil>=0){
      if(p.getJmlCurrJurus() == 1){
        System.out.println("\nAnda tidak dapat melepaskan Jurus, minimal 1 jurus yang digunakan!");
        E.systemPause();
      }else{
        String jurus = p.jurus[pil].getName();
        p.currJurus[pil] = null;
        p.jmlCurrJurus--;
        for(int i=pil;i<p.getJmlCurrJurus();i++){
          p.currJurus[i] = p.currJurus[i+1];
        }
        System.out.println("\nBerhasil melepaskan jurus "+jurus);
        E.systemPause();
      }
    }else if(pil!=-1){
      System.out.println("\nTidak ada pilihan no "+(pil+1));
      E.systemPause();
    }
  }

  public void attack(Player p, Npc n,int iJurus, int isUsingPotion, Potion buff){
    System.out.printf("\nAnda menyerang dengan jurus %s\n",p.currJurus[iJurus].getName());
    if(n.getDefense() >0){
      int defense;
      if(isUsingPotion==0){
        defense = n.getDefense() - p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1];
      }else{
        defense = n.getDefense() - (p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]+buff.getEffect());
      }

      if(defense < 0){
        System.out.printf("Enemy's Defense : -%d",n.getDefense());
        n.setDefense(0);
        System.out.printf("\nEnemy's HP : %d",defense);
        n.setHealthPoint(n.getHealthPoint()+defense);
      }else{
        n.setDefense(defense);
        if(isUsingPotion==0){
          System.out.printf("Enemy's Defense : -%d",p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]);
        }else{
          System.out.printf("Enemy's Defense : -%d",(p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]+buff.getEffect()));
        }
      }
    }
    else{
      int HP;
      if(isUsingPotion==0){
        HP = n.getHealthPoint() - p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1];
      }else{
        HP = n.getHealthPoint() - (p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]+buff.getEffect());
      }
      if(HP<0){
        n.setHealthPoint(0);
        if(isUsingPotion==0){
          System.out.printf("Enemy's HP : -%d",p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]);
        }else{
          System.out.printf("Enemy's HP : -%d",p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]+buff.getEffect());
        }
      }else {
        n.setHealthPoint(HP);
        if(isUsingPotion==0){
          System.out.printf("Enemy's HP : -%d",p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]);
        }else{
           System.out.printf("Enemy's HP : -%d",p.currJurus[iJurus].attackPoint[p.currJurus[iJurus].level[0]-1]+buff.getEffect());
        }
       
      }
    }
  }


  public void useItem(int pil){
    GameEngine E = new GameEngine();
    int index = this.item.indexOf(this.item.get(pil-1));
    int indexPotion;
    int jml = 0;
    for(int i=0;i<this.potion.size();i++){
      jml+=this.jmlPotion.get(i);
    }
    if(jml<3){
      if(!isAvailable(this.item.get(index))){
        if(this.jmlItem.get(index)>1){
          this.potion.add(this.item.get(index));
          this.jmlPotion.add(1);
          this.jmlItem.set(index, (this.jmlItem.get(index)-1));
          indexPotion = this.potion.indexOf(this.item.get(pil-1));
        }else{
          this.potion.add(this.item.get(index));
          this.jmlPotion.add(1);
          this.jmlItem.set(index, (this.jmlItem.get(index)-1));
          indexPotion = this.potion.indexOf(this.item.get(pil-1));
          this.item.remove(index);
          this.jmlItem.remove(index);
        }
        System.out.println("Item "+this.potion.get(indexPotion).getNama()+" berhasil digunakan");
      }else{
        indexPotion = this.potion.indexOf(this.item.get(pil-1));
        if(this.jmlItem.get(index)>1){
          this.jmlPotion.set(indexPotion, (this.jmlPotion.get(indexPotion)+1));
        }else{
          this.jmlPotion.set(indexPotion, (this.jmlPotion.get(indexPotion)+1));
          this.item.remove(index);
          this.jmlItem.remove(index);
        }
        System.out.println("Item "+this.potion.get(indexPotion).getNama()+" berhasil digunakan");
      }
    }else{
      System.out.println("Jumlah item yang bisa digunakan hanya 3");
    }
    E.systemPause();
  }

  public void mulaiGame(Objek O,GameEngine gameEngine){
    int pilLevel,pilJurus;
    int isUsingPotion = 0, remainders=0;
    Potion buff = new Potion();
    boolean isNarasiAwal=false;
    Scanner in = new Scanner(System.in);
            level:
            do{
              gameEngine.clearScreen();
              gameEngine.wodDisplay();
              System.out.println("Level Game: \n");
              for(int i=0; i<15; i++){
                if((i+1)<=gameEngine.currLevel){
                  System.out.println((i+1)+". Level "+(i+1));
                }
                else{
                  System.out.println((i+1)+". Level "+(i+1)+" (LOCKED)");
                }
              }
              System.out.println("\n0. Keluar\n");
              System.out.print("Pilih Level diatas: ");
              pilLevel = in.nextInt();
              gameEngine.level = pilLevel;
              if(pilLevel>0 && pilLevel<=gameEngine.currLevel){
                battle:
                do{
                  gameEngine.clearScreen();
                  if (isNarasiAwal==false){
                    System.out.println(O.story.getNarasi(gameEngine.level).getAwalNarasi());
                    isNarasiAwal = true;
                    gameEngine.systemPause();
                    gameEngine.clearScreen();
                  } 
                  gameEngine.battleDisplay();
                  System.out.printf("\t\t\t\t    LEVEL %d \n", gameEngine.level);
                  System.out.printf("\nTempat : %s\n",O.story.getTempat(gameEngine.level).getNamaTempat());
                  System.out.printf("\n%s",this.getNamaNaga());
                  System.out.print("\nYour Element : ");
                  this.print(this, this.getJmlElement());
                  System.out.printf("\nYour HP : %d",this.getHealthPoint());
                  System.out.printf("\nYour Armor : %s",this.getIsWearArmor() == true ? this.getArmor().getName():"-");
                  System.out.printf("\nDefense : %d",this.getIsWearArmor() ==  true ? this.getDefense(): 0);
                  System.out.print("\nPotion : ");
                  if(this.potion.size()>0){
                    for(int i=0;i<this.potion.size();i++){
                      System.out.print(this.potion.get(i).getJenis()+" ("+this.jmlPotion.get(i)+"x),");
                    }
                  }else{
                    System.out.print("-");
                  }
                  System.out.println("\n+===========================================+");
                  System.out.printf("\n%s (%s)",O.story.getMusuh(gameEngine.level).getNamaNaga(),O.story.getMusuh(gameEngine.level).getStatusNPC());
                  System.out.print("\nEnemy's Element : ");
                  O.story.getMusuh(gameEngine.level).print(O.story.getMusuh(gameEngine.level), O.story.getMusuh(gameEngine.level).getJmlElement());
                  System.out.printf("\nEnemy's HP : %d",O.story.getMusuh(gameEngine.level).getHealthPoint());
                  System.out.printf("\nEnemy's Armor : %s", O.story.getMusuh(gameEngine.level).getArmor().getName());
                  System.out.printf("\nDefense : %d", O.story.getMusuh(gameEngine.level).getDefense());
                  System.out.println("\n+===========================================+");
                  if(isUsingPotion ==1){
                    System.out.println(buff.getNama()+"("+remainders+"x)");
                  }
                  System.out.print("\nGiliran kamu untuk menyerang!\n");
                  this.print(this,this.getJmlCurrJurus(),"newLine");
                  if(this.potion.size()>0){
                    System.out.printf("\n+-------------------------------------------+");
                    System.out.println("\n"+(this.getJmlCurrJurus()+1)+". Gunakan Potion");
                  }
                  System.out.print("\n\n0. Keluar ");
                  System.out.print("\n\nPilih jurus diatas : ");
                  pilJurus = in.nextInt();
                  int jmlMenu = this.potion.size()>0? this.getJmlCurrJurus()+1 : this.getJmlCurrJurus(); //menentukan jumlah menu
                  if(pilJurus!=0  && pilJurus>0 && pilJurus<=jmlMenu){
                    if(pilJurus!=this.getJmlCurrJurus()+1){
                      this.attack(this,O.story.getMusuh(gameEngine.level),pilJurus-1,isUsingPotion,buff);
                      if(isUsingPotion==1){
                        remainders--;
                        if(remainders==0){
                          buff = null;
                          isUsingPotion = 0;
                        }
                      }
                    }else if(pilJurus==this.getJmlCurrJurus()+1&& this.potion.size()>0){
                      System.out.printf("\n+-------------------------------------------+\n");
                      for(int i=0;i<this.potion.size();i++){
                        System.out.println((i+1)+". "+this.potion.get(i).getNama()+" ("+this.jmlPotion.get(i)+"x)");
                      }
                      System.out.print("\n0. Keluar ");
                      System.out.print("\n\nPilih potion diatas : ");
                      int pilPotion = in.nextInt();
                      if(pilPotion == 0){
                        continue battle;
                      }
                      else{
                        if(this.potion.get(pilPotion-1).getJenis().equals("Buff")){
                          if(this.jmlPotion.get(pilPotion-1)>0){
                            if(isUsingPotion==0){
                              remainders = this.potion.get(pilPotion-1).getRemainders();
                              isUsingPotion = 1;
                              buff = this.potion.get(pilPotion-1);
                              this.jmlPotion.set(pilPotion-1, this.jmlPotion.get(pilPotion-1)-1);
                              System.out.print("\nPotion berhasil digunakan");
                            }else{
                              System.out.print("\nPotion sedang digunakan");
                              gameEngine.systemPause();
                              continue battle;
                            }
                            
                          }else{
                            System.out.print("\nPotion sudah digunakan semua");
                            gameEngine.systemPause();
                            continue battle;
                          }
                        }else if(this.potion.get(pilPotion-1).getJenis().equals("HP")){ //Player ketika menggunakan Potion HP
                          int HP = this.getHealthPoint() + this.potion.get(pilPotion-1).getEffect();
                          if(this.jmlPotion.get(pilPotion-1)>0){
                            if(HP > O.story.getPlusHP(this.getLevelCharacter())){
                              this.setHealthPoint(O.story.getPlusHP(this.getLevelCharacter()));
                            }else{
                              this.setHealthPoint(HP);
                            }
                            this.jmlPotion.set(pilPotion-1, this.jmlPotion.get(pilPotion-1)-1);
                            System.out.printf("\nPotion berhasil digunakan!\nYour HP : +%d\n",this.potion.get(pilPotion-1).getEffect());
                            gameEngine.systemPause();
                            continue battle;
                          }else{
                            System.out.println("Potion sudah digunakan semuanya");
                            gameEngine.systemPause();
                            continue battle;
                          }
                        }
                      }
                      
                    }
                    gameEngine.systemPause();
                    if(O.story.getMusuh(gameEngine.level).getHealthPoint() > 0){
                      O.story.getMusuh(gameEngine.level).attack(O.story.getMusuh(gameEngine.level), this);
                      gameEngine.systemPause();
                    }
                  } 
                  if(this.getHealthPoint()==0){
                    System.out.print("\n Anda kalah dalam pertarungan");
                    this.setHealthPoint(O.story.getPlusHP(this.getLevelCharacter()));
                    if(this.getIsWearArmor()){
                      this.setDefense(this.getArmor().defenseLevel[this.getArmor().level[0]-1]);
                    }
                    O.story.getMusuh(gameEngine.level).setHealthPoint(O.story.getMusuhHP(gameEngine.level)); //Musuh merecover HelthPoint ketika player kalah dalam game
                    O.story.getMusuh(gameEngine.level).setDefense(O.story.getMusuh(gameEngine.level).getArmor().defenseLevel[O.story.getMusuh(gameEngine.level).getArmor().level[1]-1]); //Musuh mendapatkan defense armor kembali ketika player kalah dalam game
                    gameEngine.systemPause();
                    break;
                  }
                  if (O.story.getMusuh(gameEngine.level).getHealthPoint()==0){
                    for(int i=0;i<this.potion.size();i++){ //untuk meremove potion yang sudah tidak dapat dipakai
                      if(this.jmlPotion.get(i)==0){
                        this.potion.remove(i);
                        this.jmlPotion.remove(i);
                      }
                    }
                    if(gameEngine.level%3!=0){
                      System.out.printf(O.story.getNarasi(gameEngine.level).getAkhirNarasi(),O.story.getMusuh(gameEngine.level).getNamaNaga(),O.story.getMusuh(gameEngine.level).getNamaNaga(),O.story.getNewJurus(gameEngine.level).getName(),O.story.getLevelPoint(this.getLevelCharacter()),O.story.getPlusCoins(gameEngine.level)); //Menampilkan narasi ketika mengalahkan Musuh pada saat melawan raja
                    }else if(gameEngine.level == 15){
                      System.out.printf(O.story.getNarasi(gameEngine.level).getAkhirNarasi(), O.story.getMusuh(gameEngine.level).getNamaNaga()); //Menampilkan narasi ketika mengalahkan Musuh pada level 15
                    }
                    else{
                      System.out.printf(O.story.getNarasi(gameEngine.level).getAkhirNarasi(),O.story.getMusuh(gameEngine.level).getNamaNaga(),O.story.getMusuh(gameEngine.level).getNamaNaga(),O.story.getNewJurus(gameEngine.level).getName(),O.story.getMusuh(gameEngine.level).getArmor().getName(),O.story.getLevelPoint(this.getLevelCharacter()),O.story.getPlusCoins(gameEngine.level)); //Menampilkan narasi ketika mengalahkan Musuh
                    }
                    O.story.getMusuh(gameEngine.level).setHealthPoint(O.story.getMusuh(gameEngine.level).getHealthPoint()+O.story.getMusuhHP(gameEngine.level)); //Musuh merecover HelthPoint
                    O.story.getMusuh(gameEngine.level).setDefense(O.story.getMusuh(gameEngine.level).getArmor().defenseLevel[O.story.getMusuh(gameEngine.level).getArmor().level[1]-1]); //Musuh mendapatkan defense armor kembali
                    
                    gameEngine.systemPause();
                    isNarasiAwal=false;
                    
                    if(!this.isAvailable(O.story.getNewJurus(gameEngine.level))){  
                        this.setJurus(O.story.getNewJurus(gameEngine.level),this.getJmlJurus());// Player dapat jurus baru
                    }
                    if(gameEngine.level!=15){
                      if(gameEngine.level%3==0 && !this.isAvailable(O.story.getNewArmor(gameEngine.level)) && !super.isAvailable(O.story.getNewElement(gameEngine.level))){
                        this.setListArmor(O.story.getNewArmor(gameEngine.level), this.getJmlArmor());// Player dapat armor baru
                        this.setElement(O.story.getNewElement(gameEngine.level), this.getJmlElement()); // Player dapat elemen baru

                      }
                    }
                    this.setHealthPoint(O.story.getPlusHP(this.getLevelCharacter()));//Player merecover HP dan menambah maksimum HP  
                    if(this.getIsWearArmor()){
                      this.setDefense(this.getArmor().defenseLevel[this.getArmor().level[0]-1]); // Player mercover defense armor
                    }
                    this.setLevelPoint(this.getLevelPoint()+O.story.getLevelPoint(this.getLevelCharacter())); //LevelPoint Player menambah
                    this.setCoins(this.getCoins()+O.story.getPlusCoins(gameEngine.level));//coins Player menambah
                    if(this.getLevelPoint()>=O.story.getMaxLevelPoint(this.getLevelCharacter())){
                      //Lever Character Player naik
                      int levelPoint = this.getLevelPoint() - O.story.getMaxLevelPoint(this.getLevelCharacter());
                      this.levelUpCharacter();
                      this.setLevelPoint(0);
                      this.setLevelPoint(this.getLevelPoint()+levelPoint);
                      System.out.print("Level Up Character : +1");
                      this.setHealthPoint(O.story.getPlusHP(this.getLevelCharacter()));
                    }
                    if(gameEngine.level==gameEngine.currLevel && gameEngine.currLevel!=15){
                      gameEngine.currLevel++; //Level Player menambah
                    }
                    gameEngine.level++; 
                    if(gameEngine.level<=15){
                      System.out.print("\n\nApakah anda ingin memakai jurus baru (Y/N)? ");
                      Scanner inChar = new Scanner(System.in);
                      String pakai = inChar.nextLine();
                      if(pakai.charAt(0)=='Y' || pakai.charAt(0)=='y'){
                        break level;
                      }
                    }else{
                      break level;
                    }
                    
                  }
                }while(pilJurus!=0 || gameEngine.level==15);
                isNarasiAwal=false;
                this.setHealthPoint(O.story.getPlusHP(this.getLevelCharacter()));
                O.story.getMusuh(gameEngine.level).setHealthPoint(O.story.getMusuhHP(gameEngine.level));
                O.story.getMusuh(gameEngine.level).setDefense(O.story.getMusuh(gameEngine.level).getArmor().defenseLevel[O.story.getMusuh(gameEngine.level).getArmor().level[1]-1]);
                if(this.getIsWearArmor()){
                  this.setDefense(this.getArmor().defenseLevel[this.getArmor().level[0]-1]);
                }
                for(int i=0;i<this.potion.size();i++){
                  if(this.jmlPotion.get(i)==0){
                    this.potion.remove(i);
                    this.jmlPotion.remove(i);
                  }
                }
              }else{
                if(pilLevel !=0 && pilLevel>0){
                  System.out.println("\nMaaf anda harus menyelesaikan level "+gameEngine.currLevel+" terlebih dahulu");
                  gameEngine.systemPause();
                }
                
              }
            }while(pilLevel!=0);
  }

  public void saveGame(Objek O, GameEngine E){
    FileHandling file = new FileHandling(O,E);
    file.createFile();
  }
}