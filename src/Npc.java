public class Npc extends Naga {
  private Armor armor;
  private String statusNPC; 
  private int defense;

  public Npc(String vStatusNPC, String vNamaNaga, int vHP, Armor vArmor){
    this.setStatusNPC(vStatusNPC);
    this.setNamaNaga(vNamaNaga);
    this.setHealthPoint(vHP);
    this.setArmor(vArmor);
  }

  public void setArmor(Armor vArmor){
    this.armor = vArmor;
  }

  public void setStatusNPC(String vstatusNPC){
    this.statusNPC = vstatusNPC;
  }

  public void setDefense(int vDefense){
    this.defense = vDefense;
  }

  public Armor getArmor(){
    return armor;
  }

  public String getStatusNPC(){
    return statusNPC;
  }

  public int getDefense(){
    return defense;
  }

  public void attack(Npc n, Player p){
    int min =0;
    int max = n.getJmlCurrJurus()-1;
    int defense;
    int acakJurus = (int)(Math.random() * (max - min + 1) + min);

    System.out.printf("\nMusuh menyerang anda!\n\nMusuh menyerang dengan jurus %s\n",n.currJurus[acakJurus].getName());
    if(p.getIsWearArmor()){
      if(p.getDefense()>0){
        defense = p.getDefense() - n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1];
        if(defense < 0){
          System.out.printf("Your Defense : -%d",p.getDefense());
          p.setDefense(0);
          System.out.printf("\nEnemy's HP : %d",defense);
          p.setHealthPoint(p.getHealthPoint()+defense);
        }
        else{
          p.setDefense(defense);
          System.out.printf("Your Defense : -%d",n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1]);
        }
      }else{
        int HP = p.getHealthPoint() - n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1];
        if(HP < 0){
          p.setHealthPoint(0);
          System.out.printf("Your HP : -%d",n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1]);
        }else {
          p.setHealthPoint(HP);
          System.out.printf("Your HP : -%d",n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1]);
        }
      } 
    }else{
      int HP = p.getHealthPoint() - n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1];
      if(HP < 0){
        p.setHealthPoint(0);
        System.out.printf("Your HP : -%d",n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1]);
      }else {
      p.setHealthPoint(HP);
      System.out.printf("Your HP : -%d",n.currJurus[acakJurus].attackPoint[n.currJurus[acakJurus].level[1]-1]);
      }
    }
  }
}

