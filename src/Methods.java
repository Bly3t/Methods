import java.util.Random;

public class Methods {

    public void Palindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        System.out.printf(word.equals(builder.reverse().toString()) ? "true" : "false");
    }

    public void Randomize(int a_length, int r_bound) {
        int[] array = new int[a_length];
        Random number = new Random();

        for(int y = 0; y < array.length; ++y) {
            array[y] = number.nextInt(r_bound);
        }

        for(int x : array)
            System.out.print(String.format("Number: %s\n", x));
        }

    }

