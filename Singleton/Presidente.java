package Singleton;

public class Presidente {
    private static Presidente instance;
    
    private Presidente(){      
    }
    
    public static Presidente getInstance() {
        if (instance == null) {
            instance = new Presidente();
            System.out.println("Ya hay un presidente");
        } else {
            System.out.println("No puede haber otro presidente");
        }
        return instance;
    }
}
