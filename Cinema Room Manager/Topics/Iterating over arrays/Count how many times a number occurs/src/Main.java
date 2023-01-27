import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        for (int num : array) {
            if (num == number) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
