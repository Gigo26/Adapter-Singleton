package Adapter;

import java.util.Scanner;

public class Traductor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mensajeEnEspanol = "Hola, ¿cómo estás?";

        Adaptador adaptadorIngles = new AdaptadorIngles();
        Adaptador adaptadorQuechua = new AdaptadorQuechua();
        Adaptador adaptadorPortugues = new AdaptadorPortugues();
        
        boolean bandera = true;
        
        while(bandera){
            System.out.println("Seleccione a qué idioma quiere que se traduzca:");
            System.out.println("[1] Inglés.");
            System.out.println("[2] Quechua.");
            System.out.println("[3] Portugués.");
            System.out.println("[4] Salir");
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Mensaje en inglés: " + adaptadorIngles.traducir(mensajeEnEspanol));
                    break;
                case 2:
                    System.out.println("Mensaje en quechua: " + adaptadorQuechua.traducir(mensajeEnEspanol));
                    break;
                case 3:
                    System.out.println("Mensaje en portugués: " + adaptadorPortugues.traducir(mensajeEnEspanol));
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
        }
    }
}
