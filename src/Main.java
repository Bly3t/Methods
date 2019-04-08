import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Give a_length: ");
        int x = reader.nextInt();
        System.out.printf("Give r_bound: ");
        int y = reader.nextInt();
        Methods object = new Methods();
        object.Randomize(x, y);
    }
}
