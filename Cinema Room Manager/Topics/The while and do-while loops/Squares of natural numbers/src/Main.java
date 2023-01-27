import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();
        int num = 0;
        int square = 0;
        do {
            num++;
            square = num * num;
            if (square <= Input) {
                System.out.println(square);
            }
        } while (square <= Input);
    }
}