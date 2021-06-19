public class Armor extends Senjata{
  public int[] defenseLevel = new int[5];

  public Armor(String vArmorName, int vLevelUnlock){
    super.setName(vArmorName);
    this.level[0] = 1; //player
    this.level[1] = 1; //musuh
    this.levelUnlock = vLevelUnlock;
  }

  public void setDefenseLevel(int lvl1,int lvl2,int lvl3,int lvl4,int lvl5){
    this.defenseLevel[0] = lvl1;
    this.defenseLevel[1] = lvl2;
    this.defenseLevel[2] = lvl3;
    this.defenseLevel[3] = lvl4;
    this.defenseLevel[4] = lvl5;
  }
}