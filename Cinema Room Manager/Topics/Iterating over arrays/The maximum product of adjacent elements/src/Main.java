import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        int largest = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] * array[i + 1] >= largest)
            largest = array[i] * array[i + 1];
        }
        System.out.println(largest);
    }
}