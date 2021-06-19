public class Story{
  private Narasi[] narasi = new Narasi[20];
  private Npc[] musuh = new Npc[20];
  private Tempat[] tempat = new Tempat[20];
  private Jurus[] newJurus = new Jurus[20];
  private Armor[] newArmor = new Armor[20];
  private String[] newElement = new String[4];
  private int[] plusHP = new int[20];
  private int[] levelPoint = new int[20];
  private int[] maxLevelPoint = new int[20];
  private int[] plusDefense = new int[20];
  private int[] plusCoins = new int[20];
  private int[] musuhHP = new int[20];
  private int[] musuhArmor = new int[20];
  
    
  public void setNarasi(Narasi vNarasi, int level){
    this.narasi[level] = vNarasi;
  }

  public void setMusuh(Npc vMusuh, int level){
    this.musuh[level] = vMusuh;
  }

  public void setTempat(Tempat vTempat, int level){
    this.tempat[level] = vTempat;
  }

  public void setNewJurus(Jurus vNewJurus, int level){
    this.newJurus[level] = vNewJurus;
  }

  public void setNewArmor(Armor vNewArmor, int level){
    this.newArmor[level] = vNewArmor;
  }

  public void setNewElement(String vNewElement, int level){
    this.newElement[(level/3)-1] = vNewElement;
  }

  public void setPlusHP(int vPlusHP, int level){
    this.plusHP[level] = vPlusHP;
  }

  public void setLevelPoint(int vLevelPoint, int level){
    this.levelPoint[level] = vLevelPoint;
  }

  public void setMaxLevelPoint(int vMaxLevelPoint, int level){
    this.maxLevelPoint[level] = vMaxLevelPoint;
  }

  public void setPlusDefense(int vPlusDefense, int level){
    this.plusDefense[level] = vPlusDefense;
  }

  public void setMusuhHP(int vHP, int level){
    this.musuhHP[level] = vHP;
  }

  public void setMusuhArmor (int vArm, int level){
    this.musuhArmor[level] = vArm;
  }

  public void setPlusCoins(int vPlusCoins, int level){
    this.plusCoins[level] = vPlusCoins;
  }
    
  public Narasi getNarasi(int level){
    return narasi[level];
  }

  public Npc getMusuh(int level){
    return musuh[level];
  }

  public Tempat getTempat(int level){
    return tempat[level];
  }

  public Jurus getNewJurus(int level){
    return newJurus[level];
  }

  public Armor getNewArmor(int level){
    return newArmor[level];
  }

  public String getNewElement(int level){
    return newElement[(level/3)-1];
  }

  public int getPlusHP(int level){
    return plusHP[level];
  }

  public int getLevelPoint(int level){
    return levelPoint[level];
  }

  public int getMaxLevelPoint(int level){
    return maxLevelPoint[level];
  }

  // public int getPlusDefense(int level, Player p){
  //   int plus = 0;
  //   if(p.getIsWearArmor()){
  //     plus = p.getArmor().getDefense()+plusDefense[level];
  //     if(plus > p.getArmor().defenseLevel[p.getArmor()    .getLevel()-1]){
  //       plus = p.getArmor().defenseLevel[p.getArmor().getLevel()-1] - p.getArmor().getDefense();
  //     }else{
  //       plus = plusDefense[level];
  //     }  
  //   }
  //   return plus;
  // }

  public int getPlusCoins(int level){
    return plusCoins[level];
  }

  public int getMusuhHP(int level){
    return musuhHP[level];
  }

  public int getMusuhArmor(int level){
    return musuhArmor[level];
  }
}