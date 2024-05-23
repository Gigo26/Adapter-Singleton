package Adapter;

public class AdaptadorPortugues implements Adaptador {
    @Override
    public String traducir(String mensajeEspanol) {
        return "Eu tenho que ir agora";
    }
}