import java.util.Scanner;


public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
       int largest = a;
       int biggest = 1;
       if (b > largest) {
           largest = b;
           biggest = 2;
       }
       if (c > largest) {
           largest = c;
           biggest = 3;
       }
       return biggest;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}