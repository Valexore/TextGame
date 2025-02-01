package MyGame;

public class People {
    // Arc = Village of Kush
    public static void Liz() {
        // 1
        GameSettings.clearConsole();
        GameSettings.displayInfo();
        System.out.println();
        System.out.println("\"Liz-\"");
        if (!GameSettings.player.hasReceivedLizQuest) {
            GameSettings.printHeading(
                    "[Approaching with a warm smile] Well, hello there! You look like you’ve \nbeen on quite the journey. Welcome to our little village. I’m Liz. What brings you here?");
            System.out.println();
            System.out.println("[1] Ask about the village. \n[2] Ignore her and walk away.");
            int input = GameSettings.prompti("->", 2);
            if (input == 1) {
                GameSettings.clearConsole();
                GameSettings.displayInfo();
                GameSettings.printHeading("Hi, Liz! can you tell me a bit about this village?");
                GameSettings.anythingToContinue();

                // 2
                GameSettings.clearConsole();
                GameSettings.displayInfo();
                System.out.println("\"Liz-\"");
                GameSettings.printHeading(
                        "Welcome to Kush, traveler. This village is a place of resilience and tradition, where we live in harmony with the land. \r\n"
                                + //
                                "But beyond the hills lies the dark forest, infested with evil monsters. If their numbers grow unchecked, they could destroy us.\r\n"
                                + //
                                "\r\n" + //
                                "We stay vigilant, but it’s a constant struggle. Kush has a way of changing people, though. \r\n"
                                + //
                                "Stay awhile, and you might just find your place here—but beware the darkness that lurks beyond.");
                GameSettings.anythingToContinue();

                // 3
                GameSettings.clearConsole();
                GameSettings.displayInfo();
                System.out.println("\"Liz-\"");
                GameSettings.printHeading("So tell me adventurer " + GameSettings.player.name
                        + " Could you help our village by slaying some of the monsters? \nIf we don’t reduce their numbers, they’ll bring harm to everyone here. Your strength could make all the difference.");
                System.out.println();
                System.out.println("[1] Sure. \n[2] Sorry i can't.");
                int input1 = GameSettings.prompti("->", 2);
                if (input1 == 1) {
                    GameSettings.clearConsole();
                    GameSettings.displayInfo();
                    GameSettings.printHeading("You have agreed to help the village of Kush\r\n" + //
                            "you gained 10lur from Liz's thanks..");
                    GameSettings.player.lur = GameSettings.player.lur + 10;
                    GameSettings.anythingToContinue();
                } else if (input1 == 2) {
                    GameSettings.clearConsole();
                    GameSettings.displayInfo();
                    System.out.println("\"Liz-\"");
                    GameSettings.printHeading("It's okay " + GameSettings.player.name + ", Have a safe travel..");
                }
                //quest complete
                GameSettings.player.hasReceivedLizQuest = true;

            } else if (input == 2) {
                GameSettings.displayInfo();
                GameSettings.separator(40);
                System.out.println("You ignore Liz and walk away.");
                GameSettings.anythingToContinue();
            }
        } else {
            GameSettings.printHeading("Liz smiles at you warmly. \"Thank you again for offering to help our village, "
                    + GameSettings.player.name + ".\"");
            GameSettings.anythingToContinue();
        }
    }

    public static void Maximilian() {

    }

    public static void Finn() {

    }

    public static void Jake() {

    }
}
