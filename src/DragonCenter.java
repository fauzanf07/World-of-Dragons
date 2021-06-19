import java.util.Scanner;
public class DragonCenter{
  public Armor[] armor = new Armor[20];
  public Jurus[] jurus = new Jurus[30];
  public int[][] costUpgrade = new int[20][5];
  public int[][] costTraining = new int[30][5];
  public int jmlArmor;
  public int jmlJurus;

  public DragonCenter(){
    this.jmlArmor =0;
    this.jmlJurus =0;
  }
  public void setArmor(Armor a,int lvl1,int lvl2, int lvl3, int lvl4, int lvl5){

    this.armor[jmlArmor] = a;
    this.costUpgrade[jmlArmor][0] = lvl1;
    this.costUpgrade[jmlArmor][1] = lvl2;
    this.costUpgrade[jmlArmor][2] = lvl3;
    this.costUpgrade[jmlArmor][3] = lvl4;
    this.costUpgrade[jmlArmor][4] = lvl5;
    this.jmlArmor++;
  }

  public void setJurus(Jurus j,int lvl1,int lvl2, int lvl3, int lvl4, int lvl5){
    this.jurus[jmlJurus] = j;
    this.costTraining[jmlJurus][0] = lvl1;
    this.costTraining[jmlJurus][1] = lvl2;
    this.costTraining[jmlJurus][2] = lvl3;
    this.costTraining[jmlJurus][3] = lvl4;
    this.costTraining[jmlJurus][4] = lvl5;
    this.jmlJurus++;
  }

  public void printList(Player p, String senjata){
   
    System.out.println();
    if(senjata.equals("armor")){
      for(int i=0;i<this.jmlArmor;i++){
        if(p.isAvailable(this.armor[i])){
          System.out.println((i+1)+". "+this.armor[i].getName());
        }else{
          System.out.println((i+1)+". "+this.armor[i].getName()+" (LOCKED)");
        }
      }
    }else{
      for(int i=0;i<this.jmlJurus;i++){
        if(p.isAvailable(this.jurus[i])){
          System.out.println((i+1)+". "+this.jurus [i].getName());
        }else{
          System.out.println((i+1)+". "+this.jurus[i].getName()+" (LOCKED)");
        }
      }
    }
  }

  public void printUpgrade(Armor a,int index){
    System.out.println();
    for(int i=2;i<6;i++){
      if(a.level[0]+1 == i || i <= a.level[0]){
        System.out.println((i-1)+". Level "+i+" (Cst : "+this.costUpgrade[index][i-1]+" DC | Def --> "+a.defenseLevel[i-1]+")");
      }else{
        System.out.println((i-1)+". Level "+i+" (Cst : "+this.costUpgrade[index][i-1]+" DC | Def --> "+a.defenseLevel[i-1]+" | LOCKED)");
      }
    }
  }

  public void printUpgrade(Jurus a,int index){
    System.out.println();
    for(int i=2;i<6;i++){
      if(a.level[0]+1 == i || i <= a.level[0]){
        System.out.println((i-1)+". Level "+i+" (Cst : "+this.costTraining[index][i-1]+" DC | Att --> "+a.attackPoint[i-1]+")");
      }else{
        System.out.println((i-1)+". Level "+i+" (Cst : "+this.costTraining[index][i-1]+" DC | Att --> "+a.attackPoint[i-1]+" | LOCKED)");
      }
    }
  }

  public void upgrade(Player p, Armor a, int index, int menu){
    int level = menu+1;
    GameEngine E = new GameEngine();
    if(level == a.level[0]+1){
      if(p.getCoins() >= this.costUpgrade[index][menu]){
        a.level[0]++;
        p.setDefense(a.defenseLevel[a.level[0]-1]);
        p.setCoins(p.getCoins()-this.costUpgrade[index][menu]);
        System.out.println("\nBerhasil upgrade armor..");
        E.systemPause();
      }
      else{
        System.out.println("\nMaaf coin anda tidak mencukupi upgrade armor ke level ini..");
        E.systemPause();
      }
    }
    else if (level <= a.level[0]){
      System.out.println("Armor sudah dibeli.");
      E.systemPause();
    }
    else{
      System.out.printf("\nAnda harus upgrade armor ke level %d terlebih dahulu..",(a.level[0]+1));
      E.systemPause();
    }
  } 

  

  public void upgrade(Player p, Jurus j, int index, int menu){
    int level = menu+1;
    GameEngine E = new GameEngine();
    if(level == j.level[0]+1){
      if(p.getCoins() >= this.costTraining[index][menu]){
        j.level[0]++;
        p.setCoins(p.getCoins()-this.costTraining[index][menu]);
        System.out.println("\nBerhasil Training Jurus..");
        E.systemPause();
      }
      else{
        System.out.println("\nMaaf coin anda tidak mencukupi upgrade armor ke level ini..");
        E.systemPause();
      }
    }
    else if (level <= j.level[0]){
      System.out.println("Jurus sudah berhasil dilatih.");
      E.systemPause();
    }
    else{
      System.out.printf("\nAnda harus training jurus ke level %d terlebih dahulu..",(j.level[0]+1));
      E.systemPause();
    }
  } 

  public void mainDragonCenter(Objek O, GameEngine gameEngine){
    int menu;
    Scanner in = new Scanner(System.in);
    do{
      gameEngine.clearScreen();
      gameEngine.dragonCenterDisplay();
      System.out.println("\n1. Armor Center");
      System.out.println("2. Jurus Center");
      System.out.println("3. Item Center");
      System.out.println("\n0. Keluar");
      System.out.print("\nPilih menu : ");
      menu = in.nextInt();
      switch(menu){
        case 1:
          armorCenter(O,gameEngine);    
          break;
        case 2:
          jurusCenter(O,gameEngine);
        break;
        case 3:
          itemCenter(O,gameEngine);
          break;
      }
    }while(menu!=0);

  }


  public void armorCenter(Objek O, GameEngine gameEngine){
    int menu[] = new int[2];
    int pilDC[] =new int[2];
    Scanner in = new Scanner(System.in);

    do{
      gameEngine.clearScreen();
      gameEngine.dragonCenterDisplay();
      System.out.println("\n1. Pakai/Ganti Armor");
      System.out.println("2. Upgrade Armor");
      System.out.println("\n0. Keluar");
      System.out.print("\nPilih menu : ");
      menu[0] = in.nextInt();
      switch(menu[0]){
      case 1:
        do{
          gameEngine.clearScreen();
          gameEngine.wodDisplay();
          System.out.print("\nArmor yang digunakan : ");
            if(O.player.getIsWearArmor()){
                System.out.print(O.player.getArmor().getName());
            }else{
                System.out.print("-");
            }
                System.out.println("\n+===========================================+");
                System.out.println("Armor yang anda punya : ");
                for(int i=0;i<O.player.getJmlArmor();i++){
                    System.out.println((i+1)+". "+O.player.listArmor[i].getName()+ " (Lvl : " +O.player.listArmor[i].level[0]+" | Def : "+O.player.listArmor[i].defenseLevel[O.player.listArmor[i].level[0]-1]+")");
                }
                System.out.println("\n0. Keluar");
                System.out.print("\nPakai Armor : ");
                menu[1] = in.nextInt();
                if(menu[1]!=0 && menu[1]>0 && menu[1]<=O.player.getJmlArmor()){
                  O.player.wearArmor(O.player, menu[1]-1);
                }
        }while(menu[1]!=0);
      break;
      case 2 :
        do{
          gameEngine.clearScreen();
          gameEngine.dragonCenterDisplay();
          O.player.print();
          System.out.println("\n0. Keluar");
          System.out.print("\nUpgrade yang mana : ");
          pilDC[0] = in.nextInt();
          if(pilDC[0]>0 && pilDC[0]<=this.jmlArmor){
            if(O.player.isAvailable(O.player.listArmor[(pilDC[0]-1)])){
              do{
                  gameEngine.clearScreen();
                  gameEngine.dragonCenterDisplay();
                  System.out.println("\nYour Coins : "+O.player.getCoins()+" DC");
                  System.out.println(O.player.listArmor[pilDC[0]-1].getName()+" (Lvl : "+O.player.listArmor[pilDC[0]-1].level[0]+")");
                  this.printUpgrade(O.player.listArmor[(pilDC[0]-1)],pilDC[0]-1);
                  System.out.println("\n0. Keluar");
                  System.out.print("\nUpgrade ke : ");
                  pilDC[1] = in.nextInt();
                  if(pilDC[1]>0 && pilDC[1]<5){
                      this.upgrade(O.player,O.player.listArmor[(pilDC[0]-1)],(pilDC[0]-1),pilDC[1]);
                  }
              }while(pilDC[1]!=0);
            }else{
              System.out.println("\nMaaf anda belum mempunyai armor tersebut..");
              gameEngine.systemPause();
            }
          }
        }while(pilDC[0]!=0);
      break;
      }
                  
    }while(menu[0]!=0);
  }

  public void jurusCenter(Objek O, GameEngine gameEngine){
    int[] menu = new int[3];
    int[] pilDC = new int[2];
    Scanner in = new Scanner(System.in);

    do{
        gameEngine.clearScreen();
        gameEngine.dragonCenterDisplay();
        System.out.println("\n1. Pakai Jurus");
        System.out.println("2. Lepas Jurus");
        System.out.println("3. Upgrade Jurus");
        System.out.println("\n0. Keluar");
        System.out.print("\nPilih menu : ");
        menu[0] = in.nextInt();
        switch(menu[0]){
          case 1:
            do{
              gameEngine.clearScreen();
              gameEngine.wodDisplay();
              System.out.print("\nJurus yang digunakan : ");
              O.player.print(O.player,O.player.getJmlCurrJurus(),"comma");
              System.out.println("\n+===========================================+");
              System.out.println("Jurus yang anda punya : ");
              for(int i=0;i<O.player.getJmlJurus();i++){
                  System.out.println((i+1) + ". "+O.player.jurus[i].getName()+ " (Att : "+O.player.jurus[i].attackPoint[O.player.jurus[i].level[0]-1]+")");
              }
              System.out.println("\n0. Keluar");
              System.out.print("\nPakai Jurus : ");
              menu[1] = in.nextInt();
              if(menu[1]!=0 && menu[1]>0 && menu[1]<= O.player.getJmlJurus()){
                if(O.player.isJurusAlreadyUsed(O.player,menu[1]-1)){
                    System.out.println("Jurus sudah dipakai!");
                    in.nextLine();
                }else{
                    if(O.player.isCurrJurusFull(O.player)){
                        System.out.println("Jumlah maksimal jurus yang dapat digunakan sebanyak 4 jurus!");
                    }else{
                        O.player.setCurrJurus(O.player.jurus[menu[1]-1], O.player.getJmlCurrJurus());
                    }
                }
                    in.nextLine();
              }
            }while(menu[1]!=0);
          break;
          case 2:
            do{
              gameEngine.clearScreen();
              gameEngine.wodDisplay();
              System.out.print("\nJurus yang digunakan : ");
              O.player.print(O.player,O.player.getJmlCurrJurus(),"comma");
              System.out.println("\n+===========================================+");
              System.out.println("Jurus yang anda gunakan : ");
              O.player.print(O.player,O.player.getJmlCurrJurus(),"newLine");
              System.out.print("\n\n0. Keluar");
              System.out.print("\n\nPilih jurus yang akan dilepas : ");
              menu[2] = in.nextInt();
              O.player.lepasJurus(O.player,menu[2]-1);
            }while(menu[2]!=0);
          break;
          case 3:
            do{
              gameEngine.clearScreen();
              gameEngine.dragonCenterDisplay();
              this.printList(O.player,"jurus");
              System.out.println("\n0. Keluar");
              System.out.print("\nTraining yang mana : ");
              pilDC[0] = in.nextInt();
              if(pilDC[0]>0 && pilDC[0] <=this.jmlJurus){
                if(O.player.isAvailable(this.jurus[(pilDC[0]-1)])){
                  do{
                    gameEngine.clearScreen();
                    gameEngine.dragonCenterDisplay();
                    System.out.println("\nYour Coins : "+O.player.getCoins()+" DC");
                    System.out.println(this.jurus[pilDC[0]-1].getName()+" (Lvl : "+this.jurus[pilDC[0]-1].level[0]+")");
                    this.printUpgrade(this.jurus[(pilDC[0]-1)],pilDC[0]-1);
                    System.out.println("\n0. Keluar");
                    System.out.print("\nUpgrade ke : ");
                    pilDC[1] = in.nextInt();
                    if(pilDC[1]>0 && pilDC[1]<5){
                      this.upgrade(O.player,this.jurus[(pilDC[0]-1)],(pilDC[0]-1),pilDC[1]);
                    }
                  }while(pilDC[1]!=0);
                }else{
                  System.out.println("\nMaaf anda belum mempunyai jurus tersebut..");
                  gameEngine.systemPause();
                }
              }
            }while(pilDC[0]!=0);
          break;
        }
                
    }while(menu[0]!=0);
  }

  public void itemCenter(Objek O, GameEngine gameEngine){
    Scanner in = new Scanner(System.in);
    int pilItem;
    do{
      gameEngine.clearScreen();
      gameEngine.dragonCenterDisplay();
      System.out.println("Item anda : \n");
      for(int i=0;i<O.player.item.size();i++){
          System.out.println((i+1)+". "+O.player.item.get(i).getNama()+" ("+O.player.jmlItem.get(i)+"x)");
      }
      if(O.player.item.size() ==0){
        System.out.println("Anda belum punya item");
      }
      System.out.println("\n0. Keluar");
      System.out.print("\nGunakan item : ");
      pilItem = in.nextInt();
      if(pilItem>0 && pilItem<=O.player.item.size()){
        O.player.useItem(pilItem);
      }
    }while(pilItem != 0);
  }
}