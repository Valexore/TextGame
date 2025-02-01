package MyGame;

import java.util.Scanner;

public class GameSettings {

    static Scanner s = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

    // random encounter
    public static String[] encounters = { "Battle", "Battle", "Battle", "Battle", "Rest", "Quiz" };

    public static String[] enemies = { "🕷️ Spider", "🐀🐀🐀 Rats", "🦇 Bats", "👻 Ghost", "🐺🐺 Wolves", };
    // story elements
    public static int place = 0, arc = 1, town = 0;
    // fighting stage
    public static String[] places = { "Dark Forest of Kush", "Dungeon of NEIA", "Mystic Cave of SilverStone",
            "Ancient Ruins" };
    // town
    public static String[] towns = { "Village of Kush", "Village of NEIA", "Kingdom of SilverStone", "Ancient Ruins" };

    // prompti1
    public static int prompti(String prompt, int userChoices) {
        int input;

        do {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(s.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an Number! ");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    // clearConsole1
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }

    // separator1
    public static void separator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    // printHeading1
    public static void printHeading(String title) {
        separator(30);
        System.out.println(title);
        separator(30);
    }

    // anythingToContinue1
    public static void anythingToContinue() {
        System.out.println("\n Type anything to continue...");
        System.out.print("-> ");
        s.next();
    }

    //
    public static void displayInfo() {

        // Display player info
        separator(65);
        System.out.println("Name: " + player.name + "  |  💖HP: " + player.hp + "/" + player.maxHp +
                "  |  🌟XP: " + player.xp + "  |  💤Rest: " + player.restsLeft + "  |  💰Lur: " + player.lur);
        separator(65);

    }

    // quiz
    public static void tanong() {
        displayInfo();
        // quiz with prizes!
        Quizy.quiz();
        // give +2 lur whenever the player correct answer.
        player.lur += Quizy.score * 4;
    }

    // startGame1
    public static void startGame() {
        boolean nameSet = false;
        String name;

        clearConsole();
        separator(153);
        separator(30);
        System.out.println("\r\n" + //
                " _______        _       _______ _  _       ______  _______ _     _  _____  ______  _____        _____ _____  _     _ ______  ______  _______ _     _ \r\n"
                + //
                "(_______)  /\\  | |     (_______| )| |     (____  \\(_______) |   | |/ ___ \\|  ___ \\(____ \\      (_____) ___ \\| |   | (_____ \\|  ___ \\(_______) |   | |\r\n"
                + //
                " _        /  \\ | |      _____  |/  \\ \\     ____)  )_____  | |___| | |   | | |   | |_   \\ \\        _ | |   | | |   | |_____) ) |   | |_____  | |___| |\r\n"
                + //
                "| |      / /\\ \\| |     |  ___)      \\ \\   |  __  (|  ___)  \\_____/| |   | | |   | | |   | |      | || |   | | |   | (_____ (| |   | |  ___)  \\_____/ \r\n"
                + //
                "| |_____| |__| | |_____| |_____ _____) )  | |__)  ) |_____   ___  | |___| | |   | | |__/ /    ___| || |___| | |___| |     | | |   | | |_____   ___   \r\n"
                + //
                " \\______)______|_______)_______|______/   |______/|_______) (___)  \\_____/|_|   |_|_____/    (____/  \\_____/ \\______|     |_|_|   |_|_______) (___)  \r\n"
                + //
                "                                                                                                                                                     \r\n"
                + //
                "");
        separator(30);
        separator(153);
        anythingToContinue();

        do {
            Story.printIntro();
            clearConsole();
            printHeading("What's your name Adventurer? ");
            System.out.print("-> ");
            name = s.next();

            clearConsole();
            printHeading("Welcome, " + name + "!");
            System.out.println("[1] Yes!");
            System.out.println("[2] No, I want to change my name. ");
            int input = prompti("-> ", 2);
            if (input == 1)
                nameSet = true;

        } while (!nameSet);

        player = new Player(name);
        People.Liz();
        tanong();
        characterInfo();

        // story intro first act intro
        Story.printFirstArcIntro();
        clearConsole();
        separator(40);
        printHeading("You found your self in a Village of Kush.");
        separator(40);
        anythingToContinue();

        isRunning = true;
        gameLoop();
    }

    // checkArc1
    public static void checkArc() {
        if (player.xp >= 20 && arc == 1) {

            arc = 2;
            town = 1;
            Story.printFirstArcOutro();
            // let lvl up
            player.chooseTrait();
            // next arc
            Story.printSecondArcIntro();

            // dungeon
            // values for enemies

            place = 1;
            enemies[0] = "💀🏹 Skeleton Archer";
            enemies[1] = "🧟‍♂️🧟‍♀️ Zombies";
            enemies[2] = "🐍🐍 Snakes";
            enemies[3] = "💀⚔️ Skeleton Knight";
            enemies[4] = "💀🛡️ Shielded Skeleton";

            // values for encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Battle";

        } else if (player.xp >= 55 && arc == 2) {
            arc = 3;
            town = 2;
            Story.printSecondArcOutro();
            player.chooseTrait();
            // next act
            Story.printThirdArcIntro();

            // ??
            // values for enemies
            place = 2;
            enemies[0] = "🧙‍♂️ Wizard";
            enemies[1] = "🥨 Pretzzles";
            enemies[2] = "👹 Shinigami";
            enemies[3] = "🧛‍♀️ Vampire";
            enemies[4] = "🧙‍♀️ Loli Witch";

            // values for encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Battle";

        } else if (player.xp >= 115 && arc == 3) {
            arc = 4;
            town = 3;
            Story.printThirdArcOutro();
            player.chooseTrait();
            // next act
            place = 3;

            Story.printFourthArcIntro();

            finalBattle();
        }
    }

    // randomEncounter1
    public static void randomEncounter() {
        // randomly selects an encounter from the array
        int encounter = (int) (Math.random() * encounters.length);

        if (encounters[encounter].equals("Battle")) {
            // Take a Battle
            randomBattle();
        } else if (encounters[encounter].equals("Rest")) {
            // rest
            sleeping();
        } else {
            // quiz
            tanong();
        }
    }

    // continueJourney1
    public static void continueJourney() {
        checkArc();
        // how many acts are there?
        if (arc != 4) {
            randomEncounter();
        }
    }

    // characterInfo1
    public static void characterInfo() {
        clearConsole();
        displayInfo();
        printHeading("CHARACTER INFO");
        System.out.println(player.name + "\t💖HP: " + player.hp + "/" + player.maxHp);
        separator(20);

        // player xp and Lur
        System.out.println("🌟XP: " + player.xp + "\t💰Lur: " + player.lur);
        separator(20);

        if (player.numAtkUpgrades > 0) {
            System.out.println("Offensive trait: ⚔️" + player.atkUpgrades[player.numAtkUpgrades - 1]);
            separator(20);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defensive trait: 🛡️" + player.defUpgrades[player.numDefUpgrades - 1]);
        }

        anythingToContinue();
    }

    // shop
    public static void shop() {
        while (true) {
            clearConsole();
            displayInfo();
            System.out.println();
            printHeading("Welcome, Traveler!!");
            separator(40);
            System.out.println("I am the Shop Keeper of this Village");
            System.out.println("How can I help you?");
            separator(40);
            System.out.println();
            System.out.println("[1] 💱Sell item");
            System.out.println("[2] 🌿Low Potion = 15 Lur");
            System.out.println("[3] 💉High Potion = 30 Lur");
            System.out.println("[4] 💣Bomb = 10 Lur");
            System.out.println("[5] Leave Shop");
            System.out.println();

            int input = prompti("-> ", 5);
            int price = 0;

            if (input == 1) {
                clearConsole();
                displayInfo();

                printHeading("What would you like to sell?");
                System.out.println("[1] " + player.CrySun + "🔅Crystal Sun -> (4💰Lur)");
                System.out.println("[2] Go back");
                int sellChoice = prompti("-> ", 2);

                // selling part
                if (sellChoice == 1) {
                    if (player.CrySun > 0) {
                        clearConsole();
                        displayInfo();

                        printHeading("Thank you adventurer for good quality of Sliver Stone");
                        System.out.println("\"You have successfully sold 1 🔅Crystal Sun for 4 Lur\"");
                        player.CrySun -= 1;
                        player.lur += 4;

                    } else if (player.CrySun <= 0) {
                        clearConsole();
                        printHeading("Too bad  adventurer, you dont have 🔅Crystal Sun!?");
                    }
                } else if (sellChoice == 2) {
                    shop();
                }

                // Low Potion
            } else if (input == 2) {
                price = 10;
                if (player.lur >= price) {
                    player.lpots++;
                    player.lur -= price;
                    clearConsole();
                    printHeading("You bought a 🌿Low Potion for " + price + " 💰Lur!");
                } else {
                    clearConsole();
                    printHeading("You don't have enough Lur to buy a 🌿Low Potion.");
                }

                // High Potion
            } else if (input == 3) {
                price = 20;
                if (player.lur >= price) {
                    player.hpots++;
                    player.lur -= price;
                    clearConsole();
                    printHeading("You bought a 💉High Potion for " + price + " 💰Lur!");
                } else {
                    clearConsole();
                    printHeading("You don't have enough Lur to buy a 💉High Potion.");
                }

                // Bomb
            } else if (input == 4) {
                price = 10;
                if (player.lur >= price) {
                    player.bombs++;
                    player.lur -= price;
                    clearConsole();
                    printHeading("You bought a 💣Bomb for " + price + " 💰Lur!");
                } else {
                    clearConsole();
                    printHeading("You don't have enough Lur to buy a 💣Bomb.");
                }

                // Leave shop
            } else if (input == 5) {
                clearConsole();
                displayInfo();
                printHeading("Safe travels, adventurer!");
                anythingToContinue();
                break;
            }
            anythingToContinue();
        }
    }

    public static void heal() {
        clearConsole();
        displayInfo();
        printHeading("Welcome, weary traveler!");
        anythingToContinue();

        clearConsole();
        displayInfo();
        System.out.println("Do you want to accept the priest's offer?");
        System.out.println("[1] Yes (50 💰Lur)");
        System.out.println("[2] No, I am fine for now.");

        int input = prompti("-> ", 2);

        if (input == 1) {
            if (player.lur >= 40) {
                displayInfo();
                player.lur -= 40;
                player.hp = player.maxHp; // Restore full health
                clearConsole();
                printHeading("The priest lays their hands on you, and you feel your wounds vanish.");
                System.out.println("\"You are healed now, traveler. May your journey be blessed,\" the priest says.");
            } else {
                clearConsole();
                displayInfo();
                printHeading("The priest looks at you with pity.");
                System.out.println(
                        "\"It seems you don't have enough Lur for my services. Return when you can afford it.\"");
            }
        } else {
            clearConsole();
            displayInfo();
            printHeading("You thank the priest but decline their offer for now.");
            System.out.println("\"Take care, traveler,\" the priest says as they watch you leave.");
        }

        anythingToContinue();
    }

    // takeRest1
    public static void sleeping() {
        clearConsole();

        if (player.restsLeft >= 1) {
            displayInfo();
            printHeading("Do you want to take a Sleep? (" + player.restsLeft + ") 💤rests left).");
            System.out.println("[1] Yes\n[2] No, not now.");
            int input = prompti("-> ", 2);
            if (input == 1) {
                clearConsole();
                if (player.hp == player.maxHp) {
                    displayInfo();
                    printHeading("You're already at full 💖HP, but you used a 💤rest.");
                } else if (player.hp < player.maxHp) {
                    displayInfo();
                    int hpRestored = (int) (Math.random() * (player.xp / 4 - 1) + 10);
                    player.hp += hpRestored;
                    if (player.hp > player.maxHp)
                        player.hp = player.maxHp;

                    System.out.println("You took a 💤rest and restored up to " + hpRestored + " 💖HP.");
                    System.out.println("You're now at " + player.hp + "/" + player.maxHp + " 💖HP.");
                    player.restsLeft--;
                }
            } else {
                clearConsole();
                displayInfo();
                printHeading("You did not rest and continue the journey...");
            }
            anythingToContinue();

        }
    }

    // battle1
    public static void battle(Enemy enemy) {
        while (true) {
            clearConsole();
            displayInfo();
            printHeading(enemy.name + "\n💖HP: " + enemy.hp + "/" + enemy.maxHp);
            printHeading(player.name + "\n💖HP: " + player.hp + "/" + player.maxHp);
            separator(20);
            System.out.println("[1] ⚔️Fight\n[2] 🎒Inventory\n[3] 🏃‍♂️Run");
            int input = prompti("-> ", 3);

            if (input == 1) {
                clearConsole();
                displayInfo();
                printHeading(enemy.name + "\n💖HP: " + enemy.hp + "/" + enemy.maxHp);
                printHeading(player.name + "\n💖HP: " + player.hp + "/" + player.maxHp);
                separator(20);
                System.out.println("[1] ⚔️Attack\n[2] 💣Use Bomb (" + player.bombs + " left)\n[3] 🏃‍♂️Go Back");
                int inputAtk = prompti("-> ", 3);

                if (inputAtk == 1) {
                    // Regular Attack
                    int dmg = player.attack() - enemy.defend();
                    int dmgTook = enemy.attack() - player.defend();

                    if (dmgTook < 0) {
                        dmg -= dmgTook / 2;
                        dmgTook = 0;
                    }
                    if (dmg < 0)
                        dmg = 0;

                    player.hp -= dmgTook;
                    enemy.hp -= dmg;

                    clearConsole();
                    displayInfo();
                    System.out.println();
                    printHeading("BATTLE");
                    System.out.println("You dealt " + dmg + " 💥damage to the " + enemy.name + ".");
                    separator(15);
                    System.out.println("The " + enemy.name + " dealt " + dmgTook + " 💥damage to you.");
                    anythingToContinue();

                } else if (inputAtk == 2) {
                    // Use Bomb
                    if (player.bombs > 0) {
                        int bombDamage = (int) (player.attack() * .8); // crit + x.8 the damage
                        int dmgTook = enemy.attack() - player.defend();

                        if (dmgTook < 0)
                            dmgTook = 0;

                        enemy.hp -= bombDamage;
                        player.hp -= dmgTook;
                        player.bombs--;

                        clearConsole();
                        displayInfo();
                        System.out.println();
                        printHeading("BOMB USED");
                        System.out
                                .println("You dealt a massive " + bombDamage + " 💥damage to the " + enemy.name + "!");
                        separator(15);
                        System.out.println("The " + enemy.name + " dealt " + dmgTook + " 💥damage to you.");
                        anythingToContinue();
                    } else {
                        System.out.println("You have no bombs left!");
                        anythingToContinue();
                    }
                } else {
                    // Go Back
                    continue;
                }

                if (player.hp <= 0) {
                    playerDied();
                    break;
                } else if (enemy.hp <= 0) {
                    clearConsole();
                    displayInfo();
                    System.out.println();
                    printHeading("You defeated the " + enemy.name + "!");

                    // Increase player XP
                    player.xp += enemy.xp;
                    System.out.println("You earned " + enemy.xp + " 🌟XP!");

                    if (arc == 3) {
                        System.out.println("You earned 🔅Crystal Sun from the Cave!");
                        player.CrySun++;
                    }

                    // Random drops 225%
                    boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                    int lurEarned = (int) (Math.random() * enemy.xp);
                    if (addRest) {
                        player.restsLeft++;
                        System.out.println("You earned the chance to get an additional 💤rest!");
                    }
                    if (lurEarned > 0) {
                        player.lur += lurEarned;
                        System.out.println("You gain 💰" + lurEarned + " Lur from the " + enemy.name + "'s corpse.");
                    }
                    anythingToContinue();
                    break;
                }

            } else if (input == 2) {
                inventory();

            } else {
                clearConsole();

                if (arc != 4) {
                    displayInfo();
                    // 35% chance to run
                    if (Math.random() * 10 + 1 <= 3.5) {
                        printHeading("You 🏃ran away from the " + enemy.name + "!");
                        anythingToContinue();
                        break;
                    } else {
                        printHeading("You didn't manage to run :(");
                        int dmgTook = enemy.attack();
                        System.out.println("In your hurry you took " + dmgTook + " 💥damage!");
                        player.hp -= dmgTook;
                        anythingToContinue();

                        if (player.hp <= 0)
                            playerDied();
                    }
                } else {
                    // When arc is 4, remove the run option
                    clearConsole();
                    displayInfo();
                    printHeading("Running is not an option in this arc!");
                    anythingToContinue();
                }
            }
        }
    }

    // accur random battle = randomBattle1
    public static void randomBattle() {
        clearConsole();
        displayInfo();
        printHeading("You encounter an Enemy!!!");
        anythingToContinue();
        battle(new Enemy(enemies[(int) (Math.random() * enemies.length)], player.xp));
    }

    // inventory
    public static void inventory() {
        while (true) {
            clearConsole();
            displayInfo();
            printHeading("Inventory");
            System.out.println("[1] Use 🌿Low Potion (" + player.lpots + " left)");
            System.out.println("[2] Use 💉High Potion (" + player.hpots + " left)");
            System.out.println("[3] 🔅Crystal Sun (" + player.CrySun + ")");
            System.out.println("[4] Go Back");
            int invInput = prompti("-> ", 4);

            if (invInput == 1) { // Use Low Potion
                if (player.lpots > 0 && player.hp < player.maxHp) {
                    int healAmount = 20;
                    if (player.hp + healAmount > player.maxHp) {
                        healAmount = player.maxHp - player.hp;
                    }
                    player.hp += healAmount;
                    player.lpots--;
                    clearConsole();
                    printHeading("You used a 🌿Low Potion! Restored " + healAmount + " HP.");
                    anythingToContinue();
                } else if (player.hp == player.maxHp) {
                    clearConsole();
                    printHeading("Your 💖HP is already full. You don't need to use a potion.");
                    anythingToContinue();
                } else {
                    clearConsole();
                    printHeading("You don't have any 🌿Low Potions left.");
                    anythingToContinue();
                }
            } else if (invInput == 2) { // Use High Potion
                if (player.hpots > 0 && player.hp < player.maxHp) {
                    int healAmount = 45;
                    if (player.hp + healAmount > player.maxHp) {
                        healAmount = player.maxHp - player.hp;
                    }
                    player.hp += healAmount;
                    player.hpots--;
                    clearConsole();
                    printHeading("You used a 💉High Potion! Restored " + healAmount + " HP.");
                    anythingToContinue();
                } else if (player.hp == player.maxHp) {
                    clearConsole();
                    printHeading("Your 💖HP is already full. You don't need to use a potion.");
                    anythingToContinue();
                } else {
                    clearConsole();
                    printHeading("You don't have any 💉High Potions left.");
                    anythingToContinue();
                }
            } else if (invInput == 3) { // 🔅Crystal Sun
                clearConsole();
                printHeading(
                        "[🔅Crystal Sun] - a precious stone that only blooms within the Mystic Cave of SilverStone, \none must venture deep into the cavern's shadows and defeat the \nformidable monsters that guard its radiant glow.");
                anythingToContinue();
            } else if (invInput == 4) { // Back to Main Menu
                break;
            }
        }
    }

    // menu = printMenu1
    public static void printMenu() {
        clearConsole();
        displayInfo();
        printHeading(places[place]);
        System.out.println("Choose an action: ");
        separator(20);
        System.out.println("[1] 👣Go Travel.");
        System.out.println("[2] 📋Character info");
        System.out.println("[3] 🏡Go Back in Village");
    }

    // going back to village/town/kingdom
    public static void printTownMenu() {
        clearConsole();
        displayInfo();
        printHeading(towns[town]);
        System.out.println("Choose an action: ");
        separator(20);
        System.out.println("[1] 👣Go Back in Journey.");
        System.out.println("[2] 🛍️Shop");
        System.out.println("[3] ⛪Heal");
        System.out.println("[4] ❌Exit Game");
    }

    // final boss and its hp > finalBattle1
    public static void finalBattle() {

        battle(new Enemy("😈Boss", 500));
        if (player.hp <= 0) {
            playerDied();
        } else{
            Story.printFourthArcOutro();
        Story.printEnd();
        }
        isRunning = false;
    }

    // playerDied1
    public static void playerDied() {
        clearConsole();
        printHeading("You died :(");
        printHeading("You earned 🌟" + player.xp + "XP on your journey. Try earn more next time!");
        System.out.println("Thank you for playing!");
        isRunning = false;
    }

    public static void townMenuLoop() {
        boolean inTown = true;
        while (inTown) {
            printTownMenu();
            int input = prompti("-> ", 4);
            if (input == 1)
                gameLoop();
            else if (input == 2)
                shop();
            else if (input == 3)
                heal();
            else if (input == 4)
                inTown = false;
        }
    }

    // gameLoop1
    public static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = prompti("-> ", 4);

            if (input == 1) {
                continueJourney();
            } else if (input == 2) {
                characterInfo();
            } else if (input == 3) {
                townMenuLoop();
            }
        }
    }
}
