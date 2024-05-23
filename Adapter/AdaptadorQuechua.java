package Adapter;

public class AdaptadorQuechua implements Adaptador {
    @Override
    public String traducir(String mensajeEspanol) {
        return "Rimaykullayki, allillanchu kashanki?";
    }
}
