package MyGame;

public class Story {

        // makes text delay
        public static void textDelay(String text, int delay) {
                for (char c : text.toCharArray()) {
                        System.out.print(c);
                        try {
                                Thread.sleep(delay); // delay at miilisec
                        } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                System.out.println("Typing interrupted");
                                return;
                        }
                }
        }

        // intro
        public static void printIntro() {
                GameSettings.clearConsole();
                GameSettings.printHeading("STORY");
                textDelay("The legends say at the far eastern edge of the continent lies Gärten, a place that feels almost otherworldly. \r\n"
                                + //
                                "It's a haven filled with vibrant flowers that stretch as far as the eye can see, painting the landscape with bursts of color. \r\n"
                                + //
                                "The air here carries a gentle stillness, inviting anyone who visits to pause and breathe deeply. \r\n"
                                + //
                                "There's a sense of calm that wraps around you, as if the very ground holds a quiet understanding of peace. \r\n"
                                + //
                                "It's more than just a beautiful spot—it’s a place where the soul feels at home, finding rest in the embrace of nature’s quiet beauty.",
                                15);
                System.out.println();
                GameSettings.anythingToContinue();

        }

        // Arc 1 - intro
        public static void printFirstArcIntro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ARC I - VILLAGE OF KUSH - INTRO");
                GameSettings.separator(315);
                textDelay("In the village of Kush, you found more than a safe haven—you found a sense of purpose. \r\n"
                                + //
                                "The people there, shaped by resilience and bound together by tradition, shared stories that spoke not just of survival but of thriving against all odds. \r\n"
                                + //
                                "Their wisdom, their way of living in harmony with the land, and their quiet strength began to shift something inside you. \r\n"
                                + //
                                "It wasn’t vengeance that fueled you anymore. \r\n" + //
                                "Instead, it was a deep curiosity, a yearning to see more of the world, to understand its stories, and perhaps, to uncover your own.",
                                15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ARC I - Outro
        public static void printFirstArcOutro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ARC I - DARK FOREST OF KUSH - OUTRO");
                GameSettings.separator(315);
                textDelay("The time came when you felt it was right to move on. Though Kush had welcomed you, its purpose in your journey was clear—it had given you rest, insight, and direction. \r\n"
                                + //
                                "With the villagers’ blessings and their stories still echoing in your mind, you packed your meager belongings and stepped back onto the open road. \r\n"
                                + //
                                "The path ahead was unmarked, stretching toward unknown horizons, but that uncertainty no longer unsettled you. \r\n"
                                + //
                                "Instead, it filled you with a quiet excitement.", 15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ARC II - Intro
        public static void printSecondArcIntro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ARC II - DUNGEON OF NEIA - INTRO");
                GameSettings.separator(315);
                textDelay("Your journey led you to the village of Neia, nestled in a peaceful valley surrounded by towering peaks. \r\n"
                                + //
                                "Though it seemed idyllic at first, a dark secret lay beneath its beauty—monstrous creatures had made their home in the dungeon within the mountains. \r\n"
                                + //
                                "These beasts had long threatened the village, and despite the villagers' best efforts, they were growing bolder, endangering everything the people of Neia held dear.\r\n"
                                + //
                                "", 15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ACT II - Outro
        public static void printSecondArcOutro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ACT II - Outro");
                GameSettings.separator(315);
                textDelay("As Neia began to heal, you felt the familiar pull of the road once more. \r\n" + //
                                "The villagers had their peace now, and though the bonds you’d formed with them were strong, you knew your journey was far from over. \r\n"
                                + //
                                "With their gratitude and blessings, you packed your things and prepared to move on.\r\n"
                                + //
                                "\r\n" + //
                                "The morning you left, the air was crisp, the horizon bathed in the soft hues of dawn. \r\n"
                                + //
                                "As you walked away from Neia, its rooftops and winding paths disappearing behind you, a sense of calm settled in your heart. \r\n"
                                + //
                                "You didn’t know where the road would take you next, but you welcomed the unknown, ready to face whatever lay ahead. \r\n"
                                + //
                                "The journey was not about reaching a destination—it was about the places, the people, and the stories you encountered along the way. \r\n"
                                + //
                                "And somewhere beyond the next hill or valley, another village, another chapter, was waiting for you.",
                                15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ACT III - Intro
        public static void printThirdArcIntro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ARC III - Intro");
                GameSettings.separator(315);
                textDelay("During your journey, you arrived at the Kingdom of SilverStone, a majestic realm nestled between snow-capped mountains. \r\n"
                                + //
                                "The kingdom’s shining spires and vast city hinted at its wealth and power, yet a sense of unease lingered in the air.\r\n"
                                + //
                                "Monsters had begun to emerge near the Mystic Cave, an ancient site of great importance to the kingdom.\r\n"
                                + //
                                "Upon meeting the king, he entrusted you with a crucial task: to venture into the cave and slay the creatures threatening SilverStone. \r\n"
                                + //
                                "Driven by a sense of duty, you agreed to take on this dangerous mission.", 15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ACT III - Outro
        public static void printThirdArcOutro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ARC III - Outro");
                GameSettings.separator(315);
                textDelay("With the king’s request heavy on your mind, you entered the Mystic Cave, your resolve unwavering. \r\n"
                                + //
                                "Deep within its ancient walls, you faced countless monsters—each one more challenging than the last. \r\n"
                                + //
                                "But through sheer determination and skill, you overcame them all. As you emerged victorious, the kingdom’s future seemed brighter. \r\n"
                                + //
                                "The king, grateful for your bravery, hailed you as a hero, and SilverStone began to heal from the threat that had loomed over it.\r\n"
                                + //
                                "\r\n" + //
                                "As you left the kingdom, having fulfilled your promise, you felt the pull of the road once more. \r\n"
                                + //
                                "Another journey awaited, and with each step forward, you knew you were closer to uncovering more about the world—and yourself.",
                                15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ACT IV - Intro
        public static void printFourthArcIntro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ACT IV - Intro");
                GameSettings.separator(315);
                textDelay("In the midst of your journey, you wandered deep into a forgotten forest, a place where the trees towered like giants, their thick canopies casting shadows over the land. \r\n"
                                + //
                                "As you ventured further, you stumbled upon a massive cavern hidden within the mountains, its entrance concealed by twisted vines and rocks. \r\n"
                                + //
                                "Inside, you discovered something far more terrifying than you could have imagined—a tremendous demon golem, an ancient creature, sleeping in the heart of the cave. \r\n"
                                + //
                                "Its hulking form was made of dark stone, with glowing crimson eyes and runes carved into its massive body, signifying an otherworldly power. \r\n"
                                + //
                                "It lay dormant, but you quickly realized that if this beast were to awaken, it could devastate entire villages, leaving nothing but destruction in its wake.\r\n"
                                + //
                                "\r\n" + //
                                "Driven by a sense of duty, you knew you had no choice but to confront the golem before it could unleash its wrath. \r\n"
                                + //
                                "With a heavy heart, you steeled yourself and approached the beast, knowing that waking it would come at great risk. \r\n"
                                + //
                                "As you struck the golem’s stone skin, its eyes flickered to life, and the ground shook with the sound of its awakening. \r\n"
                                + //
                                "A fierce battle ensued, testing every ounce of your strength and skill. In the end, you managed to deliver the final blow, shattering the demon golem into pieces, ensuring it would never rise again.",
                                15);
                System.out.println();
                GameSettings.anythingToContinue();
        }

        // ACT IV - Outro
        public static void printFourthArcOutro() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("ACT IV - Outro");
                GameSettings.separator(315);
                textDelay("With the demon golem slain, the land was safe once more, and the threat that loomed over countless villages was vanquished. \r\n"
                                + //
                                "The echoes of the battle faded as the cavern grew silent, and you stood victorious among the wreckage. \r\n"
                                + //
                                "Though the journey had been perilous, you knew this was just another chapter in your ongoing adventure. \r\n"
                                + //
                                "As you left the cave behind and resumed your path, the road ahead stretched wide with endless possibilities. \r\n"
                                + //
                                "The world was vast, and your journey—full of challenges yet to come—continued onward",
                                15);

                System.out.println();
                GameSettings.anythingToContinue();
        }

        public static void printEnd() {
                GameSettings.clearConsole();
                GameSettings.separator(315);
                System.out.println("The End");
                GameSettings.separator(315);
                textDelay("Throughout your long and arduous journey, you faced challenges that tested your limits—monstrous creatures, treacherous lands that still mystery. \r\n"
                                + //
                                "Each victory brought you closer to understanding not only the world around you but also yourself. \r\n"
                                + //
                                "The places you visited, the people you met, and the battles you fought all shaped the adventurer you had become. \r\n"
                                + //
                                "Yet, despite all you had seen and endured, the world remained vast and full of mysteries, with new lands waiting to be discovered beyond the horizon.\r\n"
                                + //
                                "\r\n" + //
                                "Among the many stories you encountered, one still called to you \"the legend of Gärten\", a place of wonder and beauty, yet shrouded in secrecy. \r\n"
                                + //
                                "No matter how much you learned or how far you traveled, its true nature remained an enigma. \r\n"
                                + //
                                "What lay within the depths of Gärten? Was it merely a dream, a myth, or something more? The answers still eluded you, but as you continued your journey, you felt the pull of the unknown stronger than ever.\r\n"
                                + //
                                "\r\n" + //
                                "The road ahead was long, and though you had conquered many trials, you knew your greatest challenge had yet to come. \r\n"
                                + //
                                "The world was big, the adventure endless, and Gärten’s mystery still waiting to be unraveled. \r\n"
                                + //
                                "What lies ahead? Only time, and the path you choose, will reveal the next chapter.",
                                15);

                System.out.println();
                GameSettings.anythingToContinue();
        }

}
