import java.util.ArrayList;
public class Objek{
	public ArrayList<Armor> armor = new ArrayList<>();
  	public ArrayList<Jurus> jurus = new ArrayList<>();
  	public ArrayList<Potion> potion = new ArrayList<>();
  	public ArrayList<Npc> npc = new ArrayList<>();
  	public ArrayList<Tempat> tempat = new ArrayList<>();
  	public ArrayList<Narasi> narasi = new ArrayList<>();
  	public DragonCenter dragonCenter = new DragonCenter();
  	public Player player;
  	public Market market = new Market();
  	public Story story = new Story();
    

    public void armorInitialized(){
    	 Armor fireArmor = new Armor("Fire Armor",1);armor.add(fireArmor);
	     Armor skyGuardian = new Armor("Sky Guardian",1);armor.add(skyGuardian);
	     Armor lightShield = new Armor("Light Shield",1);armor.add(lightShield);
	     Armor guardianAngel = new Armor("Guardian Angel",2);armor.add(guardianAngel);
	     Armor powerCloak = new Armor("Power Cloak",2);armor.add(powerCloak);
	     Armor angelWings = new Armor("Angel Wings",2);armor.add(angelWings);
	     Armor goldArmor = new Armor("Gold Armor",3);armor.add(goldArmor);
	     Armor godCloak = new Armor("God Cloak",3);armor.add(godCloak);
	     Armor heavyShield = new Armor("Heavy Shield",3);armor.add(heavyShield);
	     Armor guardianWings = new Armor("Guardian Wings",4);armor.add(guardianWings);
	     Armor guardianSky = new Armor("Guardian Sky", 4); armor.add(guardianSky);
       Armor guardianShine = new Armor("Guardian Shine", 4); armor.add(guardianShine);
       Armor gurdianGod = new Armor("Gurdian God", 5); armor.add(gurdianGod);
       Armor athena = new Armor("Athena", 5); armor.add(athena);
       Armor gantz = new Armor("Gantz", 5); armor.add(gantz);
       Armor alfonse = new Armor("Alfonse", 5); armor.add(alfonse);
	     
	     fireArmor.setDefenseLevel(500, 1000, 1500, 2000, 2500);
	     skyGuardian.setDefenseLevel(1000, 1500, 2000, 2500, 3000);
	     lightShield.setDefenseLevel(1500, 2000, 2500, 3000, 3500);
	     guardianAngel.setDefenseLevel(2000, 2500, 3000, 3500, 4000);
	     powerCloak.setDefenseLevel(3000, 3500, 4000, 4500, 5000);
	     angelWings.setDefenseLevel(4500, 5000, 5500, 6000, 6500);
	     goldArmor.setDefenseLevel(6500, 7000, 7500, 8000, 8500);
	     godCloak.setDefenseLevel(9500, 100000, 10500, 11000, 11500);
	     heavyShield.setDefenseLevel(11000, 11500, 12000, 12500, 13000);
	     guardianWings.setDefenseLevel(13000, 13500, 14000, 14500, 15000);
       guardianSky.setDefenseLevel(15000, 15500, 16000, 16500, 17000);
       guardianShine.setDefenseLevel(17000, 17500, 18000, 18500, 19000);
       gurdianGod.setDefenseLevel(19000, 19500, 20000, 20500, 21000);
       athena.setDefenseLevel(19500, 20000, 20500, 21000,21500);
       gantz.setDefenseLevel(20000, 20500, 21000,21500,22000);
       alfonse.setDefenseLevel(20500, 21000,21500,22000,22500);

	      dragonCenter.setArmor(fireArmor,0, 200, 700, 1200, 1800);
	      dragonCenter.setArmor(skyGuardian,0, 500, 900, 1300, 2000);
	      dragonCenter.setArmor(lightShield,0, 800, 1200, 1600, 2300);
	      dragonCenter.setArmor(guardianAngel,0, 1100, 1500, 1900, 2600);
	      dragonCenter.setArmor(powerCloak,0, 1400, 1800, 2200, 2900);
	      dragonCenter.setArmor(angelWings,0, 1700, 2100, 2500, 3200);
	      dragonCenter.setArmor(goldArmor,0, 2000, 2400, 2800, 3500);
	      dragonCenter.setArmor(godCloak,0, 2300, 2700, 3100, 3800);
	      dragonCenter.setArmor(heavyShield,0, 2600, 3000, 3400, 4100);
	      dragonCenter.setArmor(guardianWings,0, 2900, 3300, 3700, 4400);
        dragonCenter.setArmor(guardianSky, 0, 3200, 3600, 4000, 4400);
        dragonCenter.setArmor(guardianShine, 0, 3500, 3900, 4200, 5000);
        dragonCenter.setArmor(gurdianGod, 0, 3800, 4200, 4500, 5500);
        dragonCenter.setArmor(athena, 0, 4100, 4500, 4800, 5800);
        dragonCenter.setArmor(gantz, 0, 4400, 4800, 5100, 6100);
        dragonCenter.setArmor(athena, 0, 4700, 5100, 6100, 6500);
    }

    public void jurusInitialized(){
    	 //jurus 
		  Jurus fireBall = new Jurus("Fire Ball","Api",100, 1); jurus.add(fireBall);
	     Jurus fireWind = new Jurus("Fire Wind","Api",150,1);jurus.add(fireWind);
	     Jurus dragonSword = new Jurus("Dragon Sword","Api",250,1);jurus.add(dragonSword);
	     Jurus hellStorm = new Jurus("Hell Storm","Api",350,1);jurus.add(hellStorm);
	     Jurus inferno = new Jurus("Inferno","Api",400,2);jurus.add(inferno);
	     Jurus giantHellStone = new Jurus("The Giant Hell Stone","Api",700,2);jurus.add(giantHellStone);
	     Jurus windArrow = new Jurus("Wind Arrow","Udara",100,2);jurus.add(windArrow);
	     Jurus windStorm = new Jurus("Wind Storm","Udara",200,2);jurus.add(windStorm);
	     Jurus windBlade = new Jurus("Wind Blade","Udara",300,3);jurus.add(windBlade);
	     Jurus angelWing = new Jurus("Angel Wing","Udara",750,3);jurus.add(angelWing);
	     Jurus skyJudgement = new Jurus("Sky Judgement","Udara",400,3);jurus.add(skyJudgement);
	     Jurus waterScythes = new Jurus("Water Scythes","Air",250,3);jurus.add(waterScythes);
	     Jurus waterSlash = new Jurus("Water Slash","Air",300,4);jurus.add(waterSlash);
	     Jurus frostEnergy = new Jurus("Frost Energy","Air",350,4);jurus.add(frostEnergy);
	     Jurus roughWaves = new Jurus("Rough Waves","Air",400,4);jurus.add(roughWaves);
	     Jurus oceanStorm = new Jurus("Ocean Storm","Air",500,4);jurus.add(oceanStorm);
	     Jurus earthMage = new Jurus("Eart Mage","Tanah",350,5);jurus.add(earthMage);
	     Jurus earthWall = new Jurus("Earth Wall","Tanah",400,5);jurus.add(earthWall);
	     Jurus ancestralGolem = new Jurus("Ancestral Golem","Tanah",450,5);jurus.add(ancestralGolem);
	     Jurus stoneRain = new Jurus("Stone Rain","Tanah",500,5);jurus.add(stoneRain);
	     Jurus geoControl = new Jurus("Geo Control","Tanah",600,5);jurus.add(geoControl);
	     fireBall.setAttackPoint(100, 150, 200, 250, 300);
	     fireWind.setAttackPoint(150, 200, 250, 300, 350);
	     dragonSword.setAttackPoint(250, 300, 350, 400, 450);
	     hellStorm.setAttackPoint(350, 400, 450, 500, 550);
	     inferno.setAttackPoint(400, 450, 500, 550, 600);
	     giantHellStone.setAttackPoint(700, 950, 1100, 1250, 1400);

	     waterScythes.setAttackPoint(250, 300, 350, 400, 450);
	     waterSlash.setAttackPoint(300, 350, 400, 450, 500);
	     frostEnergy.setAttackPoint(350, 400, 450, 500, 550);
	     roughWaves.setAttackPoint(400, 450, 500, 550, 600);
	     oceanStorm.setAttackPoint(500, 550, 600, 650, 700);

	     windArrow.setAttackPoint(100, 150, 200, 250, 300);
	     windStorm.setAttackPoint(150, 200, 250, 300, 350);
	     windBlade.setAttackPoint(250, 300, 350, 400, 450);
	     angelWing.setAttackPoint(350, 400, 450, 500, 550);
	     skyJudgement.setAttackPoint(400, 450, 500, 550, 600);

	     earthMage.setAttackPoint(350, 400, 450, 500, 550);
	     earthWall.setAttackPoint(400, 450, 500, 550, 600);
	     ancestralGolem.setAttackPoint(450, 500, 550, 600, 650);
	     stoneRain.setAttackPoint(500, 550, 600, 650, 700);
	     geoControl.setAttackPoint(600, 650, 700, 750, 800);

	     dragonCenter.setJurus(fireBall, 0, 200, 250, 300, 350);
	     dragonCenter.setJurus(fireWind, 0, 300, 350, 400, 450);
	     dragonCenter.setJurus(dragonSword, 0, 400, 450, 500, 550);
	     dragonCenter.setJurus(hellStorm, 0, 500, 550, 600, 650);
	     dragonCenter.setJurus(inferno, 0, 600, 650, 700, 750);
	     dragonCenter.setJurus(giantHellStone, 0, 900, 1200, 1500, 1800);

	     dragonCenter.setJurus(waterScythes, 0, 300, 350, 400, 450);
	     dragonCenter.setJurus(waterSlash, 0, 400, 450, 500, 550);
	     dragonCenter.setJurus(frostEnergy, 0, 500, 550, 600, 650);
	     dragonCenter.setJurus(roughWaves, 0, 600, 650, 700, 750);
	     dragonCenter.setJurus(oceanStorm, 0, 700, 750, 800, 850);

	     dragonCenter.setJurus(windArrow, 0, 200, 250, 300, 350);
	     dragonCenter.setJurus(windStorm, 0, 300, 350, 400, 450);
	     dragonCenter.setJurus(windBlade, 0, 400, 450, 500, 550);
	     dragonCenter.setJurus(angelWing, 0, 500, 550, 600, 650);
	     dragonCenter.setJurus(skyJudgement, 0, 600, 650, 700, 750);

	     dragonCenter.setJurus(earthMage, 0, 300, 350, 400, 450);
	     dragonCenter.setJurus(earthWall, 0, 400, 450, 500, 550);
	     dragonCenter.setJurus(ancestralGolem, 0, 500, 550, 600, 650);
	     dragonCenter.setJurus(stoneRain, 0, 600, 650, 700, 750);
	     dragonCenter.setJurus(geoControl, 0, 700, 750, 800, 850);
    }

    public void playerInitialized(){
    	player = new Player("Api",2000,jurus.get(0),armor.get(0),dragonCenter,0);
    }
    

    public void npcInitialized(){
      //NPC Elemen Api
    	Npc fireBird = new Npc("Anak Buah Raja Api","Fire Bird Dragon",500,armor.get(1)); npc.add(fireBird);	    
      Npc hydra = new Npc("Anak Buah Raja Api","Hydra Dragon",800,armor.get(0)); npc.add(hydra);
	    Npc kolkhis = new Npc("Raja Api","Kholkis Dragon",1000,armor.get(3)); npc.add(kolkhis);

      //NPC Elemen air
	    Npc Fafnir = new Npc("Anak Buah Naga Air","Fafnir Dragon",1100,armor.get(4));npc.add(Fafnir);
	    Npc stoor = new Npc("Anak Buah Naga Air","Stoor Dragon",1200,armor.get(5));npc.add(stoor);
	    Npc slot = new Npc("Raja Naga Air","Slot Dragon",1500,armor.get(6));npc.add(slot);
      
      //NPC Elemen udara
	    Npc araso = new Npc("Anak Buah Naga Udara","Araso Dragon",1700,armor.get(7));npc.add(araso);
	    Npc veldora = new Npc("Anak Buah Naga Udara","Veldora Dragon",1900,armor.get(7));npc.add(veldora);
	    Npc destroyer = new Npc("Raja Naga Udara","Destroyer Dragon",2100,armor.get(8));npc.add(destroyer);

      //NPC Elemen Tanah
	    Npc carillon = new Npc("Anak buah Naga Tanah","Carillon Dragon",2500,armor.get(9));npc.add(carillon);
      Npc claydragon = new Npc("Anak buah Naga Tanah", "claydragon", 2600,armor.get(10));npc.add(claydragon);
      Npc veldana = new Npc("Raja Naga Tanah", "veldana", 3000, armor.get(11)); npc.add(veldana);

      //NPC naga pure
      Npc shuna = new Npc("Anak buah Naga Pure", "Shuna Dragon", 3400, armor.get(12)); npc.add(shuna);
      Npc shion = new Npc ("Anak buah Naga Pure", "Shion dragon", 3900, armor.get(13)); npc.add(shion);
      Npc Diablo = new Npc("Raja Naga Pure", "Diablo Dragon", 4700, armor.get(14)); npc.add(Diablo);
      
        fireBird.setElement ("Udara", fireBird.getJmlElement());
	      fireBird.setElement("Api",fireBird.getJmlElement());
	      fireBird.setCurrJurus(jurus.get(0),fireBird.getJmlCurrJurus());
	      fireBird.setCurrJurus(jurus.get(1),fireBird.getJmlCurrJurus());
	      fireBird.setDefense(fireBird.getArmor().defenseLevel[fireBird.getArmor().level[1]-1]);

	      hydra.setElement("Air",hydra.getJmlElement());
	      hydra.setElement("Api", hydra.getJmlElement());
	      hydra.setCurrJurus(jurus.get(0),hydra.getJmlCurrJurus());
	      hydra.setCurrJurus(jurus.get(1),hydra.getJmlCurrJurus());
	      hydra.setCurrJurus(jurus.get(2),hydra.getJmlCurrJurus());
	      hydra.setDefense(hydra.getArmor().defenseLevel[hydra.getArmor().level[1]-1]);

	      kolkhis.setElement ("Api", kolkhis.getJmlElement());
	      kolkhis.setCurrJurus(jurus.get(2),kolkhis.getJmlCurrJurus());
	      kolkhis.setCurrJurus(jurus.get(3),kolkhis.getJmlCurrJurus());
	      kolkhis.setCurrJurus(jurus.get(4),kolkhis.getJmlCurrJurus());
        kolkhis.setCurrJurus(jurus.get(5),kolkhis.getJmlCurrJurus());
	      kolkhis.setDefense(kolkhis.getArmor().defenseLevel[kolkhis.getArmor().level[1]-1]);

	      Fafnir.setElement("Air", Fafnir.getJmlElement());
	      Fafnir.setElement("Api", Fafnir.getJmlElement());
	      Fafnir.setCurrJurus(jurus.get(11),Fafnir.getJmlCurrJurus());
	      Fafnir.setCurrJurus(jurus.get(1),Fafnir.getJmlCurrJurus());
	      Fafnir.setDefense(Fafnir.getArmor().defenseLevel[Fafnir.getArmor().level[1]-1]);

	      stoor.setElement ("Air", stoor.getJmlElement());
        stoor.setElement ("Tanah", stoor.getJmlElement());
	      stoor.setCurrJurus(jurus.get(11),stoor.getJmlCurrJurus());
	      stoor.setCurrJurus(jurus.get(12),stoor.getJmlCurrJurus());
	      stoor.setCurrJurus(jurus.get(16),stoor.getJmlCurrJurus());
	      stoor.setDefense(stoor.getArmor().defenseLevel[stoor.getArmor().level[1]-1]);

	      slot.setElement("Air",slot.getJmlElement());
	      slot.setCurrJurus(jurus.get(12),slot.getJmlCurrJurus());
	      slot.setCurrJurus(jurus.get(13), slot.getJmlCurrJurus());
        slot.setCurrJurus(jurus.get(14), slot.getJmlCurrJurus());
        slot.setCurrJurus(jurus.get(15), slot.getJmlCurrJurus());
	      slot.setDefense(slot.getArmor().defenseLevel[slot.getArmor().level[1]-1]);

	      araso.setElement("Air",araso.getJmlElement());
	      araso.setElement("Udara",araso.getJmlElement());
	      araso.setCurrJurus(jurus.get(11),araso.getJmlCurrJurus());
	      araso.setCurrJurus(jurus.get(6),araso.getJmlCurrJurus());
	      araso.setDefense(araso.getArmor().defenseLevel[araso.getArmor().level[1]-1]);

	      veldora.setElement("Udara",veldora.getJmlElement());
	      veldora.setElement("Tanah",veldora.getJmlElement());
	      veldora.setCurrJurus(jurus.get(7),veldora.getJmlCurrJurus());
	      veldora.setCurrJurus(jurus.get(16),veldora.getJmlCurrJurus());
	      veldora.setCurrJurus(jurus.get(6), veldora.getJmlCurrJurus());
	      veldora.setDefense(veldora.getArmor().defenseLevel[veldora.getArmor().level[1]-1]);
	      
	      destroyer.setElement("Udara",destroyer.getJmlElement()); 
	      destroyer.setCurrJurus(jurus.get(7),destroyer.getJmlCurrJurus());
	      destroyer.setCurrJurus(jurus.get(8),destroyer.getJmlCurrJurus());
	      destroyer.setCurrJurus(jurus.get(9), destroyer.getJmlCurrJurus());
        destroyer.setCurrJurus(jurus.get(10), destroyer.getJmlCurrJurus());
	      destroyer.setDefense(destroyer.getArmor().defenseLevel[destroyer.getArmor().level[1]-1]);

	      carillon.setElement("Tanah",carillon.getJmlElement());
	      carillon.setElement("Api",carillon.getJmlElement());
	      carillon.setCurrJurus(jurus.get(0),carillon.getJmlCurrJurus());
	      carillon.setCurrJurus(jurus.get(16),carillon.getJmlCurrJurus());
	      carillon.setDefense(carillon.getArmor().defenseLevel[carillon.getArmor().level[1]-1]);

        claydragon.setElement("Tanah",claydragon.getJmlElement());
	      claydragon.setElement("Udara",claydragon.getJmlElement());
	      claydragon.setCurrJurus(jurus.get(0),claydragon.getJmlCurrJurus());
	      claydragon.setCurrJurus(jurus.get(16),claydragon.getJmlCurrJurus());
	      claydragon.setCurrJurus(jurus.get(17), claydragon.getJmlCurrJurus());
	      claydragon.setDefense(claydragon.getArmor().defenseLevel[claydragon.getArmor().level[1]-1]);

        veldana.setElement("Tanah",veldana.getJmlElement());
	      veldana.setCurrJurus(jurus.get(17),veldana.getJmlCurrJurus());
	      veldana.setCurrJurus(jurus.get(18),veldana.getJmlCurrJurus());
	      veldana.setCurrJurus(jurus.get(19), veldana.getJmlCurrJurus());
        veldana.setCurrJurus(jurus.get(20), veldana.getJmlCurrJurus());
	      veldana.setDefense(veldana.getArmor().defenseLevel[veldana.getArmor().level[1]-1]);

        shuna.setElement("Api",shuna.getJmlElement());
	      shuna.setElement("Air",shuna.getJmlElement());
        shuna.setElement("Udara",shuna.getJmlElement());
        shuna.setElement("Tanah",shuna.getJmlElement());
	      shuna.setCurrJurus(jurus.get(5),shuna.getJmlCurrJurus());
	      shuna.setCurrJurus(jurus.get(10),shuna.getJmlCurrJurus());
	      shuna.setCurrJurus(jurus.get(15), shuna.getJmlCurrJurus());
        shuna.setCurrJurus(jurus.get(20), shuna.getJmlCurrJurus());
	      shuna.setDefense(shuna.getArmor().defenseLevel[shuna.getArmor().level[1]-1]);

        shion.setElement("Api",shion.getJmlElement());
	      shion.setElement("Air",shion.getJmlElement());
        shion.setElement("Udara",shion.getJmlElement());
        shion.setElement("Tanah",shion.getJmlElement());
	      shion.setCurrJurus(jurus.get(5),shion.getJmlCurrJurus());
	      shion.setCurrJurus(jurus.get(10),shion.getJmlCurrJurus());
	      shion.setCurrJurus(jurus.get(15), shion.getJmlCurrJurus());
        shion.setCurrJurus(jurus.get(20), shion.getJmlCurrJurus());
	      shion.setDefense(shion.getArmor().defenseLevel[shion.getArmor().level[1]-1]);

        Diablo.setElement("Api",Diablo.getJmlElement());
	      Diablo.setElement("Air",Diablo.getJmlElement());
        Diablo.setElement("Udara",Diablo.getJmlElement());
        Diablo.setElement("Tanah",Diablo.getJmlElement());
	      Diablo.setCurrJurus(jurus.get(5),Diablo.getJmlCurrJurus());
	      Diablo.setCurrJurus(jurus.get(10),Diablo.getJmlCurrJurus());
	      Diablo.setCurrJurus(jurus.get(15), Diablo.getJmlCurrJurus());
        Diablo.setCurrJurus(jurus.get(20), Diablo.getJmlCurrJurus());
	      Diablo.setDefense(Diablo.getArmor().defenseLevel[Diablo.getArmor().level[1]-1]);
    }

    public void narasiIntialized(){
    	Narasi narasiL0 = new Narasi(); narasi.add(narasiL0);
	    Narasi narasiL1 = new Narasi(); narasi.add(narasiL1);
	    Narasi narasiL2 = new Narasi(); narasi.add(narasiL2);
	    Narasi narasiL3 = new Narasi();narasi.add(narasiL3);
	    Narasi narasiL4 = new Narasi();narasi.add(narasiL4);
	    Narasi narasiL5 = new Narasi();narasi.add(narasiL5);
	    Narasi narasiL6 = new Narasi();narasi.add(narasiL6);
	    Narasi narasiL7 = new Narasi();narasi.add(narasiL7);
	    Narasi narasiL8 = new Narasi();narasi.add(narasiL8);
	    Narasi narasiL9 = new Narasi();narasi.add(narasiL9);
	    Narasi narasiL10 = new Narasi();narasi.add(narasiL10);
      Narasi narasiL11 = new Narasi();narasi.add(narasiL11);
      Narasi narasiL12 = new Narasi();narasi.add(narasiL12);
      Narasi narasiL13 = new Narasi();narasi.add(narasiL13);
      Narasi narasiL14 = new Narasi();narasi.add(narasiL14);
      Narasi narasiL15 = new Narasi();narasi.add(narasiL15);

	    narasiL0.setAwalNarasi("\nHalo %s! Selamat datang di dunia naga, Anda harus mengalahkan Raja Pure yang telah menjadikan Ibu Fire sebagai budak di kerajaanya karena keluarga Fire tidak mempunyai uang untuk membayar hutang yang telah dipinjamnya. Anda harus melawan musuh-musuh dan mendapatkan semua jurus dan elemen untuk melawan Raja Pure tersebut. Ayo kalahkan Raja Pure dan rebut kerajaanya! ");

	      narasiL1.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Api yakni Fire Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Fire Bird Dragon.");
	      narasiL1.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

	      narasiL2.setAwalNarasi("\nSelamat anda berhasil melewati level 1, sekarang anda berada di level 2 dan masih mengalahkan musuh dari anak buah Raja Api yakni Hydra Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Hydra.");
	      narasiL2.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

	      narasiL3.setAwalNarasi("\nSelamat anda berhasil melewati level 3. Pada level ini anda akan mengalahkan Raja Api atau Fire Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Kholkis dan anda juga akan mendapatkan armor. Selamat berjuang!!!. ");
	      narasiL3.setAkhirNarasi("\n\n.Selamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda dan %s menyerahkan armornya kepada Anda. Sekarang anda telah menguasai jurus dan  tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d\n");

	      narasiL4.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Air yakni Fafnir Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Fafnir Dragon.");
	      narasiL4.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

	      narasiL5.setAwalNarasi("\nSelamat anda berhasil melewati level 4. Ini adalah level terakhir yang akan anda hadapi. Anda akan mengalahkan Raja Air atau Stoor Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Stoor dan anda juga akan mendapatkan armor. Selamat berjuang!!!. ");
	      narasiL5.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");
	      
	      narasiL6.setAwalNarasi("\nSelamat anda berhasil melewati level 5. Pada level ini anda akan mengalahkan Raja Air atau Slot Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Slot dan anda juga akan mendapatkan armor. Selamat berjuang!!!. ");
	      narasiL6.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda dan %s menyerahkan armornya kepada Anda. Sekarang anda telah menguasai jurus dan  tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nAnda sekarang telah menguasai Element Air. Gunakan jurus-jurus pada element ini untuk membunuh naga pada level berikutnya!\n\nLevel Point : +%d\nCoins : +%d\n");

	      narasiL7.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Udara yakni Araso Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Araso Dragon.");
	      narasiL7.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

	      narasiL8.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Udara yakni Veldora Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Veldora Dragon.");
	      narasiL8.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

	      narasiL9.setAwalNarasi("\nSelamat anda berhasil melewati level 8. Pada level ini anda akan mengalahkan Raja Udara atau Destroyer Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Destroyer dan anda juga akan mendapatkan armor. Selamat berjuang!!!. ");
	      narasiL9.setAkhirNarasi("\n\n.Selamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda dan %s menyerahkan armornya kepada Anda. Sekarang anda telah menguasai jurus dan  tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nAnda sekarang telah menguasai jurus Udara. Gunakan jurus-jurus element ini untuk membunuh naga pada level berikutnya!\n\nLevel Point : +%d\nCoins : +%d\n");

	      narasiL10.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Tanah yakni Carillon Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Carillon Dragon.");
	      narasiL10.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

        narasiL11.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Tanah yakni Clay Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Clay Dragon.");
	      narasiL11.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

        narasiL12.setAwalNarasi("\nSelamat anda berhasil melewati level 11. Pada level ini anda akan mengalahkan Raja Tanah atau Veldana Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Veldana dan anda juga akan mendapatkan armor. Selamat berjuang!!!. ");
	      narasiL12.setAkhirNarasi("\n\n.Selamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda dan %s menyerahkan armornya kepada Anda. Sekarang anda telah menguasai jurus dan  tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nAnda sekarang telah menguasai element Tanah. dan Anda telah menguasai semua element yang terdapat di dunia naga, sekarang anda menjadi naga Pure. Kalahkan raja Pure !\n\nLevel Point : +%d\nCoins : +%d\n");

        narasiL13.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Pure yakni Shuna Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Shuna Dragon.");
	      narasiL13.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

        narasiL14.setAwalNarasi("\nMisi anda pada level ini adalah mengalahkan musuh dari anak buah Raja Pure yakni Shion Dragon. Jika anda mengalahkannya anda akan diajarkan jurus baru oleh Shion Dragon.");
	      narasiL14.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. %s mengajarkan jurus %s kepada Anda. Sekarang anda telah menguasai jurus tersebut dan dapat menggunakan jurus tersebut dalam pertarungan berikutnya.\n\nLevel Point : +%d\nCoins : +%d");

        narasiL15.setAwalNarasi("\nSelamat anda berhasil melewati level 14. Ini adalah level terakhir dari game ini. Pada level ini anda akan mengalahkan Raja Pure yakni Diablo Dragon. Jika anda mengalahkannya anda akan menjadi raja pure dan ibu anda akan dibebaskan dari budak. Selamat berjuang!!!. ");
	      narasiL15.setAkhirNarasi("\n\nSelamat anda telah mengalahkan %s. Sekarang anda telah menjadi Raja Pure dan ibu anda telah bebas dari perbudakan.\nTamat");
    }

    public void tempatInitialized(){
    	Tempat volcanoQuake = new Tempat("Volcano Quake","Api"); tempat.add(volcanoQuake);
	    Tempat fireFall = new Tempat("Fire Fall","Api"); tempat.add(fireFall);
	    Tempat hellDesert = new Tempat("Hell","Api"); tempat.add(hellDesert);
	    Tempat hotRocks= new Tempat("Hot Rocks","Api"); tempat.add(hotRocks);
	    Tempat deathValley= new Tempat("deathValley","Api"); tempat.add(deathValley);
	    Tempat seaTown = new Tempat("Sea Town","Air"); tempat.add(seaTown);
      Tempat bikiniBottom = new Tempat("Bikini Bottom","Air"); tempat.add(bikiniBottom);
      Tempat marianaTrench = new Tempat("Mariana Trench","Air"); tempat.add(marianaTrench);
	    Tempat greenLand = new Tempat("Green Land","Tanah"); tempat.add(greenLand);
	    Tempat oldTown = new Tempat("Old Town","Tanah"); tempat.add(oldTown);
	    Tempat rockingBridge = new Tempat ("Rocking Bridge","Tanah"); tempat.add(rockingBridge);
	    Tempat forest = new Tempat ("Forest","Tanah"); tempat.add(forest);
      Tempat skyHigh = new Tempat("Sky High","Udara"); tempat.add(skyHigh);
      Tempat clouds = new Tempat("Clouds","Udara"); tempat.add(clouds);
      Tempat windLand = new Tempat("Wind Land","Udara"); tempat.add(windLand);
      
    }

    public void potionInitialized(){
    	Potion potionHealth = new Potion("Potion Health", "HP",500,1); potion.add(potionHealth);
    	Potion potionBuff = new Potion("Potion Buff", "Buff",300,3); potion.add(potionBuff);
    }

    public void storyInitialized(){
      story.setNarasi(narasi.get(0),0); 

      story.setNarasi(narasi.get(1),1);
      story.setTempat(tempat.get(0),1);
      story.setMusuh(npc.get(0),1);
      story.setNewJurus(jurus.get(1),1);
      story.setPlusHP(2000,1);
      story.setLevelPoint(500,1);
      story.setMaxLevelPoint(500,1);
      story.setPlusCoins(2000,1);
      story.setMusuhHP(500,1);

      story.setNarasi(narasi.get(2),2);
      story.setTempat(tempat.get(1),2);
      story.setMusuh(npc.get(1),2);
      story.setNewJurus(jurus.get(2),2);
      story.setPlusHP(2500,2);
      story.setLevelPoint(500,2);
      story.setMaxLevelPoint(1000,2);
      story.setPlusCoins(2000,2);
      story.setMusuhHP(800,2);

      story.setNarasi(narasi.get(3),3);
      story.setTempat(tempat.get(2),3);
      story.setMusuh(npc.get(2),3);
      story.setPlusHP(3000,3);
      story.setNewJurus(jurus.get(5),3);
      story.setNewArmor(npc.get(2).getArmor(), 3);
      story.setNewElement("Api",3);
      story.setLevelPoint(750,3);
      story.setMaxLevelPoint(2000,3);
      story.setPlusCoins(2000,3);
      story.setMusuhHP(1000,3);

      story.setNarasi(narasi.get(4),4);
      story.setTempat(tempat.get(4),4);
      story.setMusuh(npc.get(3),4);
      story.setPlusHP(3500,4);
      story.setNewJurus(jurus.get(11),4);
      story.setLevelPoint(900,4);
      story.setMaxLevelPoint(3000,4);
      story.setPlusCoins(2000,4);
      story.setMusuhHP(1100,4);

      story.setNarasi(narasi.get(5),5);
      story.setTempat(tempat.get(5),5);
      story.setMusuh(npc.get(4),5);
      story.setPlusHP(5000,5);
      story.setNewJurus(jurus.get(12),5);
      story.setLevelPoint(1200,5);
      story.setMaxLevelPoint(5000,5);
      story.setPlusCoins(2000,5);
      story.setMusuhHP(1200,5);

      story.setNarasi(narasi.get(6),6);
      story.setTempat(tempat.get(6),6);
      story.setMusuh(npc.get(5),6);
      story.setPlusHP(6000,6);
      story.setNewJurus(jurus.get(14),6);
      story.setNewArmor(npc.get(5).getArmor(), 6);
      story.setNewElement("Air",6);
      story.setLevelPoint(1500,6);
      story.setMaxLevelPoint(7000,6);
      story.setPlusCoins(2000,6);
      story.setMusuhHP(1500,6);
      
      story.setNarasi(narasi.get(7),7);
      story.setTempat(tempat.get(12),7);
      story.setMusuh(npc.get(6),7);
      story.setPlusHP(7000,7);
      story.setNewJurus(jurus.get(6),7);
      story.setLevelPoint(1750,7);
      story.setMaxLevelPoint(9000,7);
      story.setPlusCoins(2000,7);
      story.setMusuhHP(1800,7);

      story.setNarasi(narasi.get(8),8);
      story.setTempat(tempat.get(13),8);
      story.setMusuh(npc.get(7),8);
      story.setPlusHP(8000,8);
      story.setNewJurus(jurus.get(7),8);
      story.setLevelPoint(2000,8);
      story.setMaxLevelPoint(10000,8);
      story.setPlusCoins(2000,8);
      story.setMusuhHP(2000,8);

      story.setNarasi(narasi.get(9),9);
      story.setTempat(tempat.get(14),9);
      story.setMusuh(npc.get(8),9);
      story.setPlusHP(9000,9);
      story.setNewJurus(jurus.get(9),9);
      story.setNewArmor(npc.get(8).getArmor(), 9);
      story.setNewElement("Udara",9);
      story.setLevelPoint(2250,9);
      story.setMaxLevelPoint(11000,9);
      story.setPlusCoins(2100,9);
      story.setMusuhHP(2100,9);

      story.setNarasi(narasi.get(10), 10);
      story.setTempat(tempat.get(8),10);
      story.setMusuh(npc.get(9), 10);
      story.setPlusHP(10000,10);
      story.setNewJurus(jurus.get(16),10);
      story.setNewArmor(npc.get(9).getArmor(),10);
      story.setLevelPoint(2500,10);
      story.setMaxLevelPoint(12000,10);
      story.setPlusCoins(2200,10);
      story.setMusuhHP(2200,10);

      story.setNarasi(narasi.get(11), 11);
      story.setTempat(tempat.get(9),11);
      story.setMusuh(npc.get(10), 11);
      story.setPlusHP(11000,11);
      story.setNewJurus(jurus.get(17),11);
      story.setNewArmor(npc.get(10).getArmor(),11);
      story.setLevelPoint(2750,11);
      story.setMaxLevelPoint(13000,11);
      story.setPlusCoins(2300,11);
      story.setMusuhHP(2300,11);

      story.setNarasi(narasi.get(12), 12);
      story.setTempat(tempat.get(10),12);
      story.setMusuh(npc.get(11), 12);
      story.setPlusHP(12000,12);
      story.setNewJurus(jurus.get(19),12);
      story.setNewArmor(npc.get(11).getArmor(),12);
      story.setNewElement("Tanah",12);
      story.setLevelPoint(3250,12);
      story.setMaxLevelPoint(15000,12);
      story.setPlusCoins(2400,12);
      story.setMusuhHP(2400,12);

      story.setNarasi(narasi.get(13), 13);
      story.setTempat(tempat.get(3),13);
      story.setMusuh(npc.get(12), 13);
      story.setPlusHP(13000,13);
      story.setNewJurus(jurus.get(10),13);
      story.setNewArmor(npc.get(12).getArmor(),13);
      story.setLevelPoint(3500,13);
      story.setMaxLevelPoint(16000,13);
      story.setPlusCoins(2500,13);
      story.setMusuhHP(2500,13);

      story.setNarasi(narasi.get(14), 14);
      story.setTempat(tempat.get(4),14);
      story.setMusuh(npc.get(13), 14);
      story.setPlusHP(14000,14);
      story.setNewJurus(jurus.get(15),14);
      story.setNewArmor(npc.get(13).getArmor(),14);
      story.setLevelPoint(3750,14);
      story.setMaxLevelPoint(17000,14);
      story.setPlusCoins(2600,14);
      story.setMusuhHP(2600,14);

      story.setNarasi(narasi.get(15), 15);
      story.setTempat(tempat.get(11),15);
      story.setMusuh(npc.get(14), 15);
      story.setPlusHP(15000,15);
      story.setNewJurus(jurus.get(20),15);
      story.setNewArmor(npc.get(14).getArmor(),15);
      story.setLevelPoint(4000,15);
      story.setMaxLevelPoint(18000,15);
      story.setPlusCoins(2700,15);
      story.setMusuhHP(2700,15);
      
      market.setArmor(armor.get(0),500);
      market.setArmor(armor.get(1),1000);
      market.setArmor(armor.get(2),1500);
      market.setArmor(armor.get(3),2000);
      market.setArmor(armor.get(4),3000);
      market.setArmor(armor.get(5),4500);
      market.setArmor(armor.get(6),6000);
      market.setArmor(armor.get(7),9000);
      market.setArmor(armor.get(8),13000);
      market.setArmor(armor.get(9),15000);
      market.setArmor(armor.get(10),17000);
      market.setArmor(armor.get(11),19000);
      market.setArmor(armor.get(12),21000);
      market.setArmor(armor.get(13),23000);
      market.setArmor(armor.get(14),25000);    
      
      market.setJurus(jurus.get(0),300);
      market.setJurus(jurus.get(1),500);
      market.setJurus(jurus.get(2),1000);
      market.setJurus(jurus.get(3),1500);
      market.setJurus(jurus.get(4),2000);
      market.setJurus(jurus.get(5),300);
      market.setJurus(jurus.get(6),300);
      market.setJurus(jurus.get(7),500);
      market.setJurus(jurus.get(8),1000);
      market.setJurus(jurus.get(9),1500);
      market.setJurus(jurus.get(10),2000);
      market.setJurus(jurus.get(11),1000);
      market.setJurus(jurus.get(12),1400);
      market.setJurus(jurus.get(13),1500);
      market.setJurus(jurus.get(14),2000);
      market.setJurus(jurus.get(15),2500);
      market.setJurus(jurus.get(16),1500);
      market.setJurus(jurus.get(17),2000);
      market.setJurus(jurus.get(18),2500);
      market.setJurus(jurus.get(19),2500);
      market.setJurus(jurus.get(20),3500);

      market.setPotion(potion.get(0),500);
      market.setPotion(potion.get(1),700);
    }

    public Objek(){
	      armorInitialized();
	      jurusInitialized();
	      playerInitialized();
	      npcInitialized();
	      narasiIntialized();
	      tempatInitialized();
	      potionInitialized();
	      storyInitialized();
    }
}