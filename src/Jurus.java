public class Jurus extends Senjata{
  private String elemen;
  public int[] attackPoint = new int[5];

  public Jurus(String vNamaJurus, String vElemen, int vAttackPoint, int vLevelUnlock){
    super.setName(vNamaJurus);
    this.setElemen(vElemen);
    this.level[0] = 1; //player
    this.level[1] = 1; //musuh
    this.levelUnlock = vLevelUnlock;
  }

  public void setAttackPoint(int lvl1, int lvl2,int lvl3,int lvl4,int lvl5){
    this.attackPoint[0] = lvl1;
    this.attackPoint[1] = lvl2;
    this.attackPoint[2] = lvl3;
    this.attackPoint[3] = lvl4;
    this.attackPoint[4] = lvl5;
  }

  public void setElemen(String vElemen){
    this.elemen = vElemen;
  }
  

  public String getElemen(){
    return elemen;
  }


  // public void levelUp(){
  //   this.level++;
  // }

}