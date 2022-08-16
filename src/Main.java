import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Caneta caneta;

    public static void main(String[] args) {
        destampar();
    }

    private static int menu() {
        System.out.println("1- Destampar\n2- Tampar\n3- Rabiscar\n4- Status");
        return sc.nextInt();
    }

    public static void destampar(){
        switch (menu()){
            case 1 -> {
                caneta.destampar();
            }
            case 2 -> {
                caneta.tampar();
            }
            case 3 -> {
                caneta.rabiscar(caneta);
            }
            case 4 -> {
                caneta.status();
            }
        }
        menu();
    }
}
