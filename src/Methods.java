import java.util.Random;
import java.util.Scanner;

class Methods {
   private Scanner reader = new Scanner(System.in);


     void Palindrome() {
         System.out.println("Give a word: ");
         String word = reader.nextLine();
        StringBuilder builder = new StringBuilder(word);
        System.out.print(word.equals(builder.reverse().toString()) ? "true" : "false");
    }

    void Randomize() {
        System.out.print("Give a_length: ");
        int x_length = reader.nextInt();
        System.out.print("Give r_bound: ");
        int y_bound = reader.nextInt();
        int[] array = new int[x_length];
        Random number = new Random();

        for(int y = 0; y < array.length; ++y) {
            array[y] = number.nextInt(y_bound);
        }

        for(int x : array)
            System.out.print(String.format("Number: %s\n", x));
        }

    }

