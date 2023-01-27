import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Height = scanner.nextInt();
        int Tunnels = scanner.nextInt();
        int Tun = 0;
        boolean Broken = false;
        for(int i = 1; i <= Tunnels; i++){
            Tun = scanner.nextInt();
            if(Tun <= Height){
                System.out.println("Will crash on bridge " + i);
                Broken = true;
                break;
            }
        }
        if(!Broken){
            System.out.println("Will not crash");
        }
    }
}