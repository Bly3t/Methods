import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a_length: ");
        int x = reader.nextInt();
        System.out.println("Give r_bound: ");
        int y = reader.nextInt();
        Methods object = new Methods();
        object.Randomize(x, y);
    }
}
