package Singleton;

public class Presidencia {

    public static void main(String[] args) {
        
        System.out.println("Estado:");
        System.out.println("Elegiendo presidente....");
        
        System.out.println("Ya se eligio un presidente!!!");
        
        for (int i = 1; i < 4; i++) {
            System.out.print(i+".-");
            Presidente.getInstance();
        }
        
        System.out.println("Viva el Perú!!!");
    }  
}
