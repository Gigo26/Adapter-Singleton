package Adapter;

public class AdaptadorIngles implements Adaptador {
    @Override
    public String traducir(String mensajeEspanol) {
        return "I have to go now.";
    }
}