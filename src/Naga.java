public class Naga{
  private String namaNaga;
  private int healthPoint;
  public Jurus[] jurus = new Jurus[30];
  public Jurus[] currJurus = new Jurus[4];
  private String[] element = new String[4];
  public int jmlJurus;
  public int jmlCurrJurus;
  public int jmlElement;

  public void setNamaNaga(String vnamaNaga){
    this.namaNaga = vnamaNaga;
  }

  public void setHealthPoint(int vhealthPoint){
    this.healthPoint = vhealthPoint;
  }

  public void setJurus(Jurus vJurus, int i){
    this.jurus[i] = vJurus;
    this.jmlJurus++;

  }

  public void setCurrJurus(Jurus vJurus, int i){
    this.currJurus[i] = vJurus;
    this.jmlCurrJurus++;
  }

  public void setElement(String vElement, int i){
    this.element[i] =vElement;
    this.jmlElement++;
  }

  public int getHealthPoint(){
    return healthPoint;
  }

  public String getNamaNaga(){
    return namaNaga;
  }

  public String[] getElement(){
    return element;
  }

  public  Jurus[] getJurus(){
    return jurus;
  }
  public int getJmlJurus(){
    return jmlJurus;
  }

  public int getJmlCurrJurus(){
    return jmlCurrJurus;
  }

  public int getJmlElement(){
    return jmlElement;
  }

  public boolean isAvailable(Senjata j){
    boolean out = false;
    for(int i=0;i<jmlJurus;i++){
      if(j.getName().equals(jurus[i].getName())){
        out = true;
      }
    }
    return out;
  }
  public boolean isAvailable(String e){
    boolean out = false;
    for(int i=0;i<jmlElement;i++){
      if(e.equals(element[i])){
        out = true;
      }
    }
    return out;
  }

  public void print(Naga n, int jumlah){
    String[] elements = new String[4];
    elements = n.getElement();
    for(int i=0;i<jumlah;i++){
      System.out.print(elements[i]+", ");
    }
  }

  public void print(Player p,int jumlah, String sep){
    for(int i=0;i<jumlah;i++){
      if(sep.equals("comma")){
        System.out.print(p.currJurus[i].getName()+", ");
      }else{
        System.out.print("\n"+(i+1) +". "+p.currJurus[i].getName());
      }
      
    }
  }
  
}
