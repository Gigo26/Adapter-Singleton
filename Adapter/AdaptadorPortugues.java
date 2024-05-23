package Adapter;

public class AdaptadorPortugues implements Adaptador {
    @Override
    public String traducir(String mensajeEspanol) {
        return "Olá, como você está?";
    }
}
