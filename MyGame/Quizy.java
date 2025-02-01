package MyGame;

import java.util.ArrayList;
import java.util.Collections;

public class Quizy {

    public static int score = 0;

    public static void quiz() {
        // Questions and their options
        String[] questions = {
                "Who are the authors of Understanding Data Structures and Algorithms?",
                "What is the main principle of Object-Oriented Programming?",
                "Which data structure uses LIFO (Last In, First Out)?",
                "What is the time complexity of searching in a binary search tree?",
                "Which of the following is NOT an OOP concept?",
                "What is the purpose of a constructor in Java?",
                "Which data structure uses FIFO (First In, First Out)?",
                "What is encapsulation in OOP?",
                "Which algorithm is used to traverse a graph?",
                "What is the difference between an interface and an abstract class in Java?",
                "Which data structure is best for implementing a priority queue?",
                "What is polymorphism in OOP?",
                "What is the default size of an ArrayList in Java?",
                "What is the difference between Stack and Queue?",
                "What is inheritance in OOP?",
                "What is the key difference between aggregation and composition?",
                "What does 'overloading' mean in Java?",
                "What is the purpose of the `super` keyword in Java?",
                "What is the main purpose of an abstract class in Java?",
                "What is the time complexity of searching in a sorted array?"

        };

        String[][] options = {
                {
                        "[1] Arjo R. Ladia, James Darryl B. Bungay, and AL. F. Santiago",
                        "[2] Sheila Marie M. Matias, Hazel F. Anuncio, and Melody L. Gabas",
                        "[3] Sheila Marie M. Matias, Hazel F. Anuncio, and Jesus S. Paguigan",
                        "[4] Arjo R. Ladia, James Darryl B. Bungay and Jesus S. Paguigan"
                },
                {
                        "[1] Procedural Programming",
                        "[2] Functional Programming",
                        "[3] Encapsulation",
                        "[4] Data Hiding"
                },
                {
                        "[1] Stack",
                        "[2] Queue",
                        "[3] Linked List",
                        "[4] Array"
                },
                {
                        "[1] O(n)",
                        "[2] O(log n)",
                        "[3] O(n^2)",
                        "[4] O(1)"
                },
                {
                        "[1] Encapsulation",
                        "[2] Inheritance",
                        "[3] Abstraction",
                        "[4] Recursion"
                },
                {
                        "[1] To define a method",
                        "[2] To initialize an object",
                        "[3] To implement an interface",
                        "[4] To inherit a class"
                },
                {
                        "[1] Stack",
                        "[2] Queue",
                        "[3] Linked List",
                        "[4] Tree"
                },
                {
                        "[1] Wrapping data and methods into a single unit",
                        "[2] Dividing data into classes",
                        "[3] Using multiple inheritance",
                        "[4] Sharing methods across classes"
                },
                {
                        "[1] Bubble Sort",
                        "[2] Depth First Search (DFS)",
                        "[3] Binary Search",
                        "[4] Merge Sort"
                },
                {
                        "[1] Interfaces can have implemented methods, abstract classes cannot",
                        "[2] Abstract classes can have constructors, interfaces cannot",
                        "[3] Interfaces support multiple inheritance, abstract classes do not",
                        "[4] Both [2] and [3]"
                },
                {
                        "[1] Array",
                        "[2] Linked List",
                        "[3] Stack",
                        "[4] Heap"
                },
                {
                        "[1] Allowing a class to have multiple forms",
                        "[2] Hiding data",
                        "[3] Sharing data across objects",
                        "[4] Wrapping data and methods into one unit"
                },
                {
                        "[1] 10",
                        "[2] 15",
                        "[3] 16",
                        "[4] 20"
                },
                {
                        "[1] Stack uses FIFO, Queue uses LIFO",
                        "[2] Stack uses LIFO, Queue uses FIFO",
                        "[3] Both use LIFO",
                        "[4] Both use FIFO"
                },
                {
                        "[1] The ability to extend the properties of one class to another.",
                        "[2] The ability to share data between objects.",
                        "[3] The process of creating new classes from existing ones.",
                        "[4] A technique for data hiding."
                },
                {
                        "[1] Aggregation is a part-of relationship, while composition is a has-a relationship.",
                        "[2] Composition allows for a weaker relationship between objects.",
                        "[3] Aggregation represents a strong relationship.",
                        "[4] Composition allows for shared ownership."
                },
                {
                        "[1] Using the same method name to perform different functions.",
                        "[2] Creating multiple methods with the same name but different parameters.",
                        "[3] Overriding a method in a subclass.",
                        "[4] A method with the same name and signature but in different classes."
                },
                {
                        "[1] To call the superclass constructor from a subclass.",
                        "[2] To create an object within a method.",
                        "[3] To hide methods from subclasses.",
                        "[4] To access private members of the superclass."
                },
                {
                        "[1] To define methods that can be overridden by subclasses.",
                        "[2] To provide the implementation for the methods defined in an interface.",
                        "[3] To enforce implementation of methods in subclasses.",
                        "[4] To hide data members from being accessed directly."
                },
                {
                        "[1] O(n)",
                        "[2] O(log n)",
                        "[3] O(1)",
                        "[4] O(n^2)"
                }
        };

        int[] correctAnswers = { 3, 3, 1, 2, 4, 2, 2, 1, 2, 4, 4, 1, 3, 2, 3, 4, 2, 1, 4, 2 };

        // Create a list of question indices and shuffle it
        ArrayList<Integer> questionIndices = new ArrayList<>();
        for (int i = 0; i < questions.length; i++) {
            questionIndices.add(i);
        }
        Collections.shuffle(questionIndices);

        // Ask 2 questions only
        for (int i = 0; i < 2; i++) {
                int questionIndex = questionIndices.remove(0);


                GameSettings.clearConsole();
                GameSettings.displayInfo();
                GameSettings.printHeading("Quiz Time - Question " + (i + 1));
                System.out.println();
                GameSettings.separator(40);
                System.out.println(questions[questionIndex]);
                GameSettings.separator(40);

            // Print options for the question
            for (String option : options[questionIndex]) {
                System.out.println(option);
            }

            int input = GameSettings.prompti("-> ", 4);
            System.out.println();

            if (input == correctAnswers[questionIndex]) {
                GameSettings.clearConsole();
                GameSettings.displayInfo();
                GameSettings.printHeading("Correct!");
                System.out.println();
                GameSettings.separator(30);
                System.out.println("Good job! You answered correctly.");
                GameSettings.separator(30);
                System.out.println();

                // Add score
                score++;
            } else {
                GameSettings.clearConsole();
                GameSettings.displayInfo();
                GameSettings.printHeading("Wrong!");
                System.out.println();
                GameSettings.separator(30);
                System.out.println(
                        "Try again next time");
                        GameSettings.separator(30);
                System.out.println();
                GameSettings.player.hp -= 1;
            }

            GameSettings.anythingToContinue();
        }
    }
}
