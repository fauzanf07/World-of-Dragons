public class Tempat{
  private String namaTempat;
  private String element;

  public Tempat(String vNamaTempat, String vElement){
    this.setNamaTempat(vNamaTempat);
    this.setElement(vElement);
  }
  public void setNamaTempat(String vNamaTempat){
    this.namaTempat = vNamaTempat;
  }

  public void setElement(String vElement){
    this.element = vElement;
  }

  public String getNamaTempat(){
    return namaTempat;
  }

  public String getElement(){
    return element;
  }
}
