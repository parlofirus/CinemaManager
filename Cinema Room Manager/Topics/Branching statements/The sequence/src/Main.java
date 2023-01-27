import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int Print = 0;
        for (int i = 1; i <= iterations; i++) {
            int nestle = 0;
            while(nestle < i && Print < iterations){
                System.out.print(i + " ");
                Print++;
                nestle++;
            }
        }
    }
}