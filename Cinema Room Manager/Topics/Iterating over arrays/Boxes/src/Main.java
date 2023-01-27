import java.util.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] One = new int[3];
        int[] Two = new int[3];
        for (int i = 0; i <= 2; i++) {
            One[i] = sc.nextInt();
        }
        for (int i = 0; i <= 2; i++) {
            Two[i] = sc.nextInt();
        }
        Arrays.sort(One);
        Arrays.sort(Two);
        boolean A = true;
        boolean B = true;
        for (int i = 0; i < 3; i++){
            if (One[i] <= Two[i]) A = false;
            if (Two[i] <= One[i]) B = false;
        }
        if (A) System.out.println("Box 1 > Box 2");
        else if (B)System.out.println("Box 1 < Box 2");
        else System.out.println("Incompatible");
    }
}