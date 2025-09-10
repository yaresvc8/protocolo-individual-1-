public class Coche {
    
    private String marca;
    private String modelo;

    private static int contadorCoches = 0;

    public Coche (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarcontador (){
        System.out.println("se han creado " + contadorCoches + " coches.");
    }

    public void mostrarinfo(){
        System.out.println("marca: " + marca + ", modelo: " + modelo);

    }

    public static void main(String[] args) {
        Coche C1 = new Coche("toyota", "corolla");
        Coche C2 = new Coche ("honda", "civic");
        Coche C3 = new Coche ("ford", "focus");

        C1.mostrarinfo();
        C2.mostrarinfo();
        C3.mostrarinfo();

        Coche.mostrarcontador();
    }
}

