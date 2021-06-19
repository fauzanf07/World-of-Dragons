import java.util.ArrayList;
import java.util.Scanner;

public class Market{
  public ArrayList<Armor> armor = new ArrayList<>();
  public ArrayList<Jurus> jurus = new ArrayList<>();
  public ArrayList<Potion> potion = new ArrayList<>();
  public ArrayList<Integer> priceArmor = new ArrayList<>();
  public ArrayList<Integer> priceJurus = new ArrayList<>();
  public ArrayList<Integer> pricePotion = new ArrayList<>();

  public void setArmor(Armor vArmor, int price){
    armor.add(vArmor);
    priceArmor.add(price);
  }

  public void setJurus(Jurus vJurus, int price){
    jurus.add(vJurus);
    priceJurus.add(price);
  }

  public void setPotion(Potion vPotion, int price){
    potion.add(vPotion);
    pricePotion.add(price);
  }

  public boolean isAvailable(Player p, Armor a){
    boolean out = false;
    for(int i=0;i<p.getJmlArmor();i++){
      if(a.getName().equals(p.listArmor[i].getName())){
        out = true;
      }
    }
    return out;
  }

  public boolean isAvailable(Player p, Jurus j){
    boolean out = false;
    for(int i=0;i<p.getJmlJurus();i++){
      if(j.getName().equals(p.jurus[i].getName())){
        out = true;
      }
    }
    return out;
  }

  public boolean isAvailable(Player p, Potion ptn){
    boolean out = false;
    for(int i=0;i<p.item.size();i++){
      if(ptn.getNama().equals(p.item.get(i).getNama())){
        out = true;
      }
    }
    return out;
  }

  public void buyArmor(Player p, int pil){
    GameEngine E = new GameEngine();
    if(this.armor.get(pil-1).levelUnlock <= p.getLevelCharacter()){
      if(!(isAvailable(p, this.armor.get(pil-1)))){
        if(p.getCoins()>=this.priceArmor.get(pil-1)){
          p.setListArmor(this.armor.get(pil-1),p.getJmlArmor());
          p.setCoins(p.getCoins()-this.priceArmor.get(pil-1));
          System.out.println("Armor berhasil dibeli!");
          E.systemPause();
        }else{
          System.out.println("Coin anda belum mencukupi untuk membeli armor tersebut");
          E.systemPause();
        }
      }else{
        System.out.println("Anda sudah mempunyai armor tersebut");
        E.systemPause();
      }
    }else{
      System.out.println("Armor ini dibuka ketika level character anda level "+this.armor.get(pil-1).levelUnlock);
      E.systemPause();
    }
  }

  public void buyJurus(Player p, int pil){
    GameEngine E = new GameEngine();
    if(this.jurus.get(pil-1).levelUnlock <= p.getLevelCharacter()){
      if(!(isAvailable(p, this.jurus.get(pil-1)))){ 
        if(p.getCoins()>=this.priceJurus.get(pil-1)){
          p.setJurus(this.jurus.get(pil-1),p.getJmlJurus());
          p.setCoins(p.getCoins()-this.priceJurus.get(pil-1));
          System.out.println("Jurus berhasil dibeli!");
          E.systemPause();
        }else{
          System.out.println("Coin anda belum mencukupi untuk membeli jurus tersebut");
          E.systemPause();
        }
      } else{
        System.out.println("Anda sudah mempunyai jurus tersebut");
        E.systemPause();
      }
    }else{
      System.out.println("Jurus ini dibuka ketika level character anda level "+this.jurus.get(pil-1).levelUnlock);
      E.systemPause();
    }
  }

  public void buyPotion(Player p, int pil){
    GameEngine E = new GameEngine();
    if(!(isAvailable(p, this.potion.get(pil-1)))){
      if(p.getCoins()>=this.pricePotion.get(pil-1)){
        p.item.add(this.potion.get(pil-1));
        p.jmlItem.add(1);
        p.setCoins(p.getCoins()-this.pricePotion.get(pil-1));
        System.out.println("Potion berhasil dibeli! ");
        E.systemPause();
      }else{
        System.out.println("Coin anda belum mencukupi untuk membeli potion tersebut");
        E.systemPause();
      }
    }else{
      int index = p.item.indexOf(this.potion.get(pil-1));
      if(p.getCoins()>=this.pricePotion.get(pil-1)){
        p.jmlItem.set(index, (p.jmlItem.get(index)+1));
        p.setCoins(p.getCoins()-this.pricePotion.get(pil-1));
        System.out.println("Potion berhasil dibeli!");
        E.systemPause();
      }else{
        System.out.println("Coin anda belum mencukupi untuk membeli potion tersebut");
        E.systemPause();
      }
    }
  }

  public void mainMarket(Objek O, GameEngine gameEngine){
    int pil;
    Scanner in = new Scanner(System.in);
    do{
      gameEngine.clearScreen();
      gameEngine.marketDisplay();
      System.out.println("Pilih Item yang akan dibeli : ");
      System.out.println("\n1. Armor");
      System.out.println("2. Jurus");
      System.out.println("3. Potion");
      System.out.println("\n0. Keluar");
      System.out.print("\nPilih menu : ");
      pil = in.nextInt();
      switch(pil){
        case 1:
          marketArmor(O,gameEngine);
        break;
        case 2:
          marketJurus(O,gameEngine);
        break;
        case 3:
          marketItem(O,gameEngine);
        break;
      }
    }while(pil!=0);
  }

  public void marketArmor(Objek O, GameEngine gameEngine){
    int pil;
    Scanner in = new Scanner(System.in);
    do{
      gameEngine.clearScreen();
      gameEngine.marketDisplay();

      System.out.println("Your coins : "+O.player.getCoins()+" DC\n");
      System.out.println("Menu :\n");
      for(int i=0;i<this.armor.size();i++){
        if(this.armor.get(i).levelUnlock <= O.player.getLevelCharacter()){
          System.out.println((i+1)+". "+ this.armor.get(i).getName()+" (Prc : "+this.priceArmor.get(i)+" DC | Def : "+this.armor.get(i).defenseLevel[0]+")");
        }else{
          System.out.println((i+1)+". "+ this.armor.get(i).getName()+" (Prc : "+this.priceArmor.get(i)+" DC | Def : "+this.armor.get(i).defenseLevel[0]+")(LOCKED)");
        }
                    
      }
      System.out.println("\n0. Keluar");
      System.out.print("\nPilih armor yang akan dibeli : ");
      pil = in.nextInt();
      if(pil!=0 && pil>0 && pil<=this.armor.size()){
        this.buyArmor(O.player,pil);
      }
    }while(pil!=0);
  }

  public void marketJurus(Objek O, GameEngine gameEngine){
    int pil;
    Scanner in = new Scanner(System.in);
    do{
      gameEngine.clearScreen();
      gameEngine.marketDisplay();
      System.out.println("Your coins : "+O.player.getCoins()+
                " DC\n");
      System.out.println("Menu :\n");
      for(int i=0;i<this.jurus.size();i++){
        if(this.jurus.get(i).levelUnlock <= O.player.getLevelCharacter()){
          System.out.println((i+1)+". "+ this.jurus.get(i).getName()+" (Prc : "+this.priceJurus.get(i)+" DC | Att : "+this.jurus.get(i).attackPoint[0]+")");
        }else{
          System.out.println((i+1)+". "+ this.jurus.get(i).getName()+" (Prc : "+this.priceJurus.get(i)+" DC | Att : "+this.jurus.get(i).attackPoint[0]+")(LOCKED)");
        }
      }
      System.out.println("\n0. Keluar");
      System.out.print("\nPilih jurus yang akan dibeli : ");
      pil = in.nextInt();
      if(pil !=0 && pil>0 && pil<=this.jurus.size()){
        this.buyJurus(O.player,pil);
      }
    }while(pil!=0);
  }

  public void marketItem(Objek O, GameEngine gameEngine){
    int pil;
    Scanner in = new Scanner(System.in);
    do{
      gameEngine.clearScreen();
      gameEngine.marketDisplay();
      System.out.println("Your coins : "+O.player.getCoins()+" DC \n");
      System.out.println("Menu :\n");
      for(int i=0;i<this.potion.size();i++){
        System.out.println((i+1)+". "+ this.potion.get(i).getNama()+" (Prc : "+this.pricePotion.get(i)+" DC | Effect : "+this.potion.get(i).getEffect()+")");
      }
      System.out.println("\n0. Keluar");
      System.out.print("\nPilih menu : ");
      pil = in.nextInt();
      if(pil !=0 && pil>0 && pil<=this.potion.size()){
        this.buyPotion(O.player,pil);
      }
    }while(pil!=0);
  }
}