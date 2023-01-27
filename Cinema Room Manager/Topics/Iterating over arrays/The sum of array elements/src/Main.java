import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int num : array) {
            sum += num;
        }
        System.out.println(sum);
    }
}
