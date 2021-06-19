public class Potion{
  private String nama;
  private String jenis;
  private int effect;
  private int remainders;

  public Potion(){

  }

  public Potion(String vNama, String vJenis, int vEffect, int vRemainders){
    setNama(vNama);
    setJenis(vJenis);
    setEffect(vEffect);
    setRemainders(vRemainders);
  }
  
  public void setNama(String vNama){
    this.nama = vNama;
  }

  public void setJenis(String vJenis){
    this.jenis = vJenis;
  }
  
  public void setEffect(int vEffect){
    this.effect = vEffect;
  }

  public void setRemainders(int vRemainders){
    this.remainders = vRemainders;
  }
  
  public String getNama(){
    return nama;
  }
  public String getJenis(){
    return jenis;
  }
  public int getEffect(){
    return effect;
  }

  public int getRemainders(){
    return remainders;
  }
}