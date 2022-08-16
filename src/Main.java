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

    private static void selecionarCaneta(){
        System.out.println("Qual caneta deseja: (id)");
        int id = sc.nextInt();
        for (int i = 0; i < Caneta.listaCaneta.size(); i++){
            if (Caneta.listaCaneta.get(i).getId() == id){
                caneta = Caneta.listaCaneta.get(i);
            }
        }
    }

    public static void destampar(){
        selecionarCaneta();
        switch (menu()){
            case 1 -> {
                caneta.destampar(caneta);
            }
            case 2 -> {
                caneta.tampar(caneta);
            }
            case 3 -> {
                caneta.rabiscar(caneta);
            }
            case 4 -> {
                caneta.status();
            }
        }
    }
}
