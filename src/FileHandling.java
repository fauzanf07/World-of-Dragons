import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class FileHandling {
    public Objek O;
    public GameEngine E;
    
    public void setObjek(Objek O){
      this.O = O;
    }

    public void setGameEngine(GameEngine E){
      this.E = E;
    }

    public FileHandling(Objek O, GameEngine E){
      setObjek(O);
      setGameEngine(E);
    }

    public String serialize(){
      String content = "";
        content+= E.level+"|";
        content += E.currLevel +"|";
        content = content + O.player.getNamaNaga()+"|";
        content = content + O.player.getHealthPoint()+"|";
        for(int i=0;i<O.player.getJmlJurus();i++){
          content+= O.player.jurus[i].getName()+",";
          content+= O.player.jurus[i].level[0]+",";
          content+= O.player.jurus[i].level[1]+";";
          if(i==O.player.getJmlJurus()-1){
              content+="|";
          }
        }

        for(int i=0;i<O.player.getJmlCurrJurus();i++){
          content+= O.player.currJurus[i].getName()+",";
          content+= O.player.currJurus[i].level[0]+",";
          content+= O.player.currJurus[i].level[1]+";";
          if(i==O.player.getJmlCurrJurus()-1){
              content+="|";
            }
        }

        String elements[] = new String[4];
        elements = O.player.getElement();
        for(int i=0;i<elements.length;i++){
            content+= elements[i]+";";
            if(i==elements.length-1){
              content+="|";
            }
        }

        content+= O.player.jmlJurus+"|";
        content+= O.player.jmlCurrJurus+"|";
        content+= O.player.jmlElement+"|";

        for(int i=0;i<O.player.getJmlArmor();i++){
            content+= O.player.listArmor[i].getName()+",";
            content+= O.player.listArmor[i].level[0]+",";
            content+= O.player.listArmor[i].level[1]+";";
            if(i==O.player.getJmlArmor()-1){
              content+="|";
            }
        }

        for(Potion item:O.player.item){
          content+=item.getNama()+",";
          content+= item.getRemainders()+";";
        }
        content+="|";
        for(int jmlItem:O.player.jmlItem){
          content+=jmlItem+";";
        }
        content+="|";
        for(Potion potion:O.player.potion){
          content+=potion.getNama()+",";
          content+= potion.getRemainders()+";";
        }
        content+="|";
        for(int jmlPotion:O.player.jmlPotion){
          content+=jmlPotion+";";
        }
        content+="|";
        if(O.player.getArmor()!=null){
          content+= O.player.getArmor().getName()+",";
          content+= O.player.getArmor().level[0]+",";
          content+= O.player.getArmor().level[1]+";";
          
        }
        content+="|";
        content+=O.player.getJmlArmor()+"|";
        content+=O.player.getLevelCharacter()+"|";
        content+=O.player.getLevelPoint()+"|";
        content+=O.player.getIsWearArmor()+"|";
        content+=O.player.getCoins()+"|";
        content+=O.player.getDefense()+"|";

        return content;
    }

    public void unserialized(String serial){
      String[] serials = serial.split("\\|");
      E.level = Integer.parseInt(serials[0]);
        E.currLevel = Integer.parseInt(serials[1]);
        O.player.setNamaNaga(serials[2]);
        O.player.setHealthPoint(Integer.parseInt(serials[3]));
        String[] jurus = serials[4].split(";");
        int i=0;
        for(String j :jurus){
          String[] elm = j.split(",");
          for(Jurus jur:O.jurus){
            if(jur.getName().equals(elm[0])){
              jur.level[0] = Integer.parseInt(elm[1]);
              jur.level[1] = Integer.parseInt(elm[2]);
              O.player.setJurus(jur,i);
            }
          }
          i++;
        }
        String[] currJurus = serials[5].split(";");
        i=0;
        for(String j :currJurus){
          String[] elm = j.split(",");
          for(Jurus jur:O.jurus){
            if(jur.getName().equals(elm[0])){
              jur.level[0] = Integer.parseInt(elm[1]);
              jur.level[1] = Integer.parseInt(elm[2]);
              O.player.setCurrJurus(jur,i);
            }
          }
          i++;
        }
        String[] elements = serials[6].split(";");
        for(i=0;i<elements.length;i++){
          if(!elements[i].equals("null")){
            O.player.setElement(elements[i],i);
          }
        }
        O.player.jmlJurus = Integer.parseInt(serials[7]);
        O.player.jmlCurrJurus = Integer.parseInt(serials[8]);
        O.player.jmlElement = Integer.parseInt(serials[9]);

        String[] armors = serials[10].split(";");
        i=0;
        for(String a :armors){
          String[] elm = a.split(",");
          for(Armor armor:O.armor){
            if(armor.getName().equals(elm[0])){
              armor.level[0] = Integer.parseInt(elm[1]);
              armor.level[1] = Integer.parseInt(elm[2]);
              O.player.listArmor[i]  = armor;
            }
          }
          i++;
        }
          String[] item = serials[11].split(";");
          for(String itm :item){
            String[] elm = itm.split(",");
            for(Potion ptn:O.potion){
              if(ptn.getNama().equals(elm[0])){
                ptn.setRemainders(Integer.parseInt(elm[1]));
                O.player.item.add(ptn);
              }
            }
          }
          String[] jmlItem = serials[12].split(";");
          for(String jml:jmlItem){
            if(!jml.isEmpty()){
              O.player.jmlItem.add(Integer.parseInt(jml));
            }
          }
          String[] potion = serials[13].split(";");
          for(String ptn :potion){
            String[] elm = ptn.split(",");
            for(Potion ptns:O.potion){
              if(ptns.getNama().equals(elm[0])){
                ptns.setRemainders(Integer.parseInt(elm[1]));
                O.player.potion.add(ptns);
              }
            }
          }
          String[] jmlPotion = serials[14].split(";");
          for(String jml:jmlPotion){
            if(!jml.equals("")){
              O.player.jmlPotion.add(Integer.parseInt(jml));
            }
            
          }
          String[] armor = serials[15].split(";");
          for(String a :armor){
            String[] elm = a.split(",");
            for(Armor armr:O.armor){
              if(armr.getName().equals(elm[0])){
                armr.level[0] = Integer.parseInt(elm[1]);
                armr.level[1] = Integer.parseInt(elm[2]);
                O.player.setArmor(armr);
              }
            }
          }
        O.player.jmlArmor = Integer.parseInt(serials[16]);
        O.player.setLevelCharacter(Integer.parseInt(serials[17]));
        O.player.setLevelPoint(Integer.parseInt(serials[18]));
        O.player.setIsWearArmor(Boolean.parseBoolean(serials[19]));
        O.player.setCoins(Integer.parseInt(serials[20]));
        O.player.setDefense(Integer.parseInt(serials[21]));
    }
 
    public void createFile() {
        String content = serialize();
        try {
            Files.write(Paths.get("../save/Player.txt"), content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean readFile(){
      boolean success = false;
      try{
        File file = new File("../save/Player.txt");
        Scanner sc = new Scanner(file);
        String serial = "";
        while (sc.hasNextLine())
          serial+=sc.nextLine();
        unserialized(serial);
        success = true;

      }catch(FileNotFoundException e){
        System.out.println("Tidak ada load game");
        E.systemPause();
      }
      return success;
    }
}