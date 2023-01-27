import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        int n = sc.nextInt();
        for (int num : array) {
            if (num > n) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}