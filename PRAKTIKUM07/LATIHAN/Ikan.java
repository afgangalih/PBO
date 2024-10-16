package LATIHAN;

public class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }

    public class Fish {
        public static void main(String[] args) {
            Ikan a = new Ikan();
            Ikan b = new Piranha();
            a.swim();
            b.swim();
        }   
        
    }
    

}

/**
 * InnerIkan
 */
class Piranha extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }

}

