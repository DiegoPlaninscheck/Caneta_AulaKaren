import java.lang.reflect.Array;
import java.util.ArrayList;

public class Caneta {

    private String modelo, cor;
    private boolean tampada;

    ArrayList<Caneta> listaCaneta = new ArrayList<>();

    static{
        Caneta caneta = new Caneta();
        caneta.setCor("Azul");
    }

    public void status(){
        System.out.println("Uma caneta: " + cor);
        System.out.println("Está tampada:" + tampada);
    }

    public void destampar(){
        setTampada(false);
    }

    public void tampar(){
        setTampada(true);
    }

    public void rabiscar(Caneta caneta){
        try{
            if(caneta.isTampada()){
                throw new ExceptionTampada();
            }
        }catch (Exception exception){
            System.out.println(exception.getClass().getSimpleName() + exception.getMessage());
        }
        System.out.println("Rabiscando!");
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
