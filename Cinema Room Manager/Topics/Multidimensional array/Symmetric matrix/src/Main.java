import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] twoDim = new int[n][n];

        for(int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = sc.nextInt();
            }
        }

        boolean yes = true;

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                if (twoDim[i][j] != twoDim[j][i]) {
                    yes = false;
                }
            }
        }
        if (yes) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}