import java.util.Scanner;

public class GameEngine {
  public int level =0; //level yang dipilih pada menu
  public int currLevel =0; //level player yang sebenarnya

  public void wodDisplay(){
    System.out.println("               _/|    _   |\\_");
    System.out.println("             _/_ |   _|\\ | _ \\");
    System.out.println("           _/_/| /  /   \\|\\ |\\_\\_");
    System.out.println("         _/_/  |/  /  _  \\/\\|  \\_\\_");
    System.out.println("       _/_/    ||  | | \\o/ ||    \\_\\_");
    System.out.println("      /_/  | | |\\  | \\_ V  /| | |  \\_\\");
    System.out.println("     //    |||| | \\_/   \\__/ | |||    \\\\");
    System.out.println("    // __| ||\\  \\          /  /|| |__ \\\\");
    System.out.println("   //_/ \\|||| \\/\\\\        //\\/ ||||/ \\_\\\\");
    System.out.println("  ///    \\\\\\\\/   /        \\   \\////    \\\\\\");
    System.out.println("  |/      \\/    |    |    |     \\/      \\|");
    System.out.println("                /_|  | |_  \\");
    System.out.println("               ///_| |_||\\_ \\");
    System.out.println("               |//||/||\\/||\\|  ");
    System.out.println("                / \\/|||/||/\\/ ");
    System.out.println("                  /|/\\| \\/");
    System.out.println("                  \\/  | ");
    System.out.println("+===========================================+");
    System.out.println("+       WW      WW      OO      DD DD       +");
    System.out.println("+       WW  WW  WW   OO    OO   DD   DD     +");
    System.out.println("+       WW  WW  WW   OO    OO   DD   DD     +");
    System.out.println("+        WW    WW       OO      DD DD       +");
    System.out.println("+                                           +");
    System.out.println("+               WORLD OF DRAGONS            +");
    System.out.println("+===========================================+");
    
  }

  public void battleDisplay(){
    System.out.println("  ,>   )\\ `a_              _a' /(");
    System.out.println("  (  _  )/ /{_ ~~        ~~ _}\\ \\(  -");
    System.out.println("   `(,)_,)/                    \\(,_(,\\\\");
    System.out.println("    ,<_ ,<_.                   ._>, _>,``==>");
    System.out.println("+===========================================+");
    
  }

  public void marketDisplay(){
    System.out.println("             _                 _");
    System.out.println("         ___/|\\_______________/|\\___");
    System.out.println("        /~^/|||\\ ~~ ~~~  ~~ ^/|||\\~^\\");
    System.out.println("       /^~/|||||\\~~  ^^~  ^~/|||||\\~~\\");
    System.out.println(" ()   /~~/|||||||\\ ~^~_~^~ /|||||||\\~~\\");
    System.out.println("(()) /~^/| / | \\ |\\^~/|\\~^/| / | \\ |\\~~\\");
    System.out.println("((()/~~/||_)_|_(_||\\/|||\\/||_)_|_(_||\\~~\\");
    System.out.println("(()/~~ ~~^ ^~^~ ~~ /|||||\\ ~~ ~^~^ ^~~ ~~\\ ()");
    System.out.println("()()||||||||||||||/|||||||\\|||||||||||||| (())");
    System.out.println("()))|||||||||||||/|||||||||\\||||||||||||| ()()");
    System.out.println("(())|| / | | \\ |||| |+|+| |||| / | | \\ || ()))");
    System.out.println("())(||_)_|_|_(_|||| |+|+| ||||_)_|_|_(_|| (())");
    System.out.println("(())|||||||||||||||_|+|+|_||||||||||||||| ())(");
    System.out.println("    @@ @@@ @@@ @@@|-------|@@@ @@@ @@@ @@");
    System.out.println("\n+===========================================+");
    System.out.println("+                MARKET PLACE               +");
    System.out.println("+===========================================+");
  }

  public void dragonCenterDisplay(){
    System.out.println("                      .");
    System.out.println("                      |");
    System.out.println("                 .   ]#[   .");
    System.out.println("                  \\_______/");
    System.out.println("               .    ]###[    .");
    System.out.println("                \\___________/");
    System.out.println("             .     ]#####[     .");
    System.out.println("              \\_______________/");
    System.out.println("           .      ]#######[      .");
    System.out.println("            \\___________________/");
    System.out.println("         .       ]#########[       .");
    System.out.println("          \\_____]##.-----.##[_____/");
    System.out.println("           |__|__|_|     |_|__|__|");
    System.out.println("           |__|__|_|_____|_|__|__|");
    System.out.println("           ########/_____\\########");
    System.out.println("                  |_______|");
    System.out.println("                 /_________\\");
    System.out.println("\n+===========================================+");
    System.out.println("+                DRAGON CENTER              +");
    System.out.println("+===========================================+");
  }

  public void clearScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  
  public void systemPause(){
    new java.util.Scanner(System.in).nextLine();
  }

  public void mulai(Objek O,GameEngine E){
      String name;
      char start = '0';
      Scanner in = new Scanner(System.in);
      do {
        wodDisplay();
        System.out.println("     Masukkan angka 1 untuk start game");
         System.out.println("     Masukkan angka 2 untuk load game");
        start = in.nextLine().charAt(0);
        clearScreen();
      }while(start!='1'&& start!='2');
      
      if(start=='1'){
        System.out.print("Set player name : ");
        name = in.nextLine();
        O.player.setNamaNaga(name);
        System.out.printf(O.story.getNarasi(0).getAwalNarasi(),O.player.getNamaNaga());
        level++;
        currLevel++;
        systemPause();
        menuUtama(O,E);
      }else{
        FileHandling file = new FileHandling(O,E);
        if(file.readFile()){
          menuUtama(O,E);
        }else{
          mulai(O,E);
        }
        systemPause();
      }
  }

  public void menuUtama(Objek O,GameEngine E){
      int menu;
      Scanner in = new Scanner(System.in);

      do{
        clearScreen();
        wodDisplay();
        System.out.print("\nElemen : ");
        O.player.print(O.player,O.player.getJmlElement());
        System.out.print("\nLevel Character : "+O.player.getLevelCharacter());
        System.out.print("\nLevel Point : "+O.player.getLevelPoint()+" / "+O.story.getMaxLevelPoint(O.player.getLevelCharacter()));
        System.out.print("\nPotion : ");
        if(O.player.potion.size()>0){
          for(int i=0;i<O.player.potion.size();i++){
            System.out.print(O.player.potion.get(i).getJenis()+" ("+O.player.jmlPotion.get(i)+"x),");
          }
        }else{
          System.out.print("-");
        }
        System.out.print("\nCoins : "+O.player.getCoins()+" DC");

        System.out.println("\n+===========================================+");
        System.out.println("1. Mulai/Continue Game");
        System.out.println("2. Dragon Center");
        System.out.println("3. Market Place");
        System.out.println("4. Save Game");
        System.out.println("\n0. Keluar");
        System.out.print("\nPilih Menu diatas : ");
        menu = in.nextInt();
        switch(menu){
          case 1:
            O.player.mulaiGame(O,E);
            break;
          case 2:
            O.dragonCenter.mainDragonCenter(O,E);
            break;
          case 3:
            O.market.mainMarket(O,E);
            break;
          case 4:
            O.player.saveGame(O,E);
            break;
        }
      }while(menu!=0);
  } 
  
  public static void main(String args[]) {
    Objek O = new Objek();
    GameEngine E = new GameEngine();
    
    E.mulai(O,E);
  }
}