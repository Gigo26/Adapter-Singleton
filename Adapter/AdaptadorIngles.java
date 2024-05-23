package Adapter;

public class AdaptadorIngles implements Adaptador {
    @Override
    public String traducir(String mensajeEspanol) {
        return "Hello, how are you?";
    }
}
