package MyGame;

public class Player extends Character{
    public int numAtkUpgrades, numDefUpgrades;

    //additional player stats
    int lur, restsLeft, lpots, hpots,  bombs, CrySun;

    public boolean hasReceivedLizQuest;

    public String[] atkUpgrades = {"Strength I", "Strength II", "Strength III", "Strength IV"};
    public String[] defUpgrades = {"Health I", "Health II", "Health III", "Health IV"};



    public Player(String name){
        super(name, 100, 0);
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //the additional stas
        this.lur = 5;
        this.restsLeft = 2;
        this.lpots = 0;
        this.hpots = 0;
        this.bombs = 1;
        this.CrySun = 0;
        //this.hasReceivedLizQuest = false;    //if to add a  quesst
        chooseTrait();
    }


    @Override
    public int attack(){
        return (int) (Math.random()*(xp/4 + numAtkUpgrades*3 + 3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades + 1);
    }
    @Override
    public int defend(){
        return (int) (Math.random()*(xp/4 + numDefUpgrades*3 + 3) + xp/10 + numDefUpgrades*2 + numAtkUpgrades + 1) ;
    }

    public void chooseTrait(){
        GameSettings.clearConsole();
        GameSettings.printHeading("Choose a Blessing");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]); // Strength
        System.out.println("(2) "+ defUpgrades[numDefUpgrades]); // Heavy Bones

        int input = GameSettings.prompti("->" , 2);
        GameSettings.clearConsole();
        if (input == 1) {
            GameSettings.printHeading("you Choose " + atkUpgrades[numAtkUpgrades] + "! ");
            numAtkUpgrades++;
            // add an aditional 5% to the player damage
            xp += xp * 0.05;
        } else {
            GameSettings.printHeading("you Choose " + defUpgrades[numDefUpgrades] + "! ");
            numDefUpgrades++;
            //add and aditiional 10max hp
        maxHp += 10; 
        hp += 10;    
        }
        GameSettings.anythingToContinue();

    }
}