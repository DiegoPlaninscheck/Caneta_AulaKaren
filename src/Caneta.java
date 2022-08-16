import java.util.ArrayList;

public class Caneta {

    private String modelo, cor;
    private boolean tampada;
    private int id;

    static ArrayList<Caneta> listaCaneta = new ArrayList<>();

    static {
        Caneta caneta = new Caneta("bic", "azul", true, 1);
        listaCaneta.add(caneta);
        Caneta caneta2 = new Caneta("bic", "azul", true, 2);
        listaCaneta.add(caneta2);
        Caneta caneta3 = new Caneta("bic", "azul", false, 3);
        listaCaneta.add(caneta3);
    }

    public Caneta(String modelo, String cor, boolean tampada, int id) {
        this.modelo = modelo;
        this.cor = cor;
        this.tampada = tampada;
        this.id = id;
    }

    public void status() {
        System.out.println("Uma caneta: " + cor);
        System.out.println("Está tampada:" + tampada);
    }

    public void destampar(Caneta caneta) {
        caneta.setTampada(false);
    }

    public void tampar(Caneta caneta) {
        caneta.setTampada(false);
    }

    public void rabiscar(Caneta caneta) {
        try {
            if (caneta.isTampada()) {
                throw new ExceptionTampada();
            } else {
                System.out.println("Rabiscando!");
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getClass().getSimpleName() + "\nMessage: " + exception.getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
