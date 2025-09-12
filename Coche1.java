public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento){
        if (incremento > 0){
            velocidadMaxima += incremento;
            System.out.println("la velocidad maxima ahora es: " + velocidadMaxima);
        } else {
            System.out.println("el incremento debe ser positivo.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

}

class PruebaCoche {
    public static void main(String[] args) {
        Coche Coche1 = new Coche("Toyota", "corolla", 180);

        System.out.println(Coche1.marca);
        Coche1.modelo = "mazda";
        Coche1.velocidadMaxima = 300;

        Coche1.acelerar(20);
    }
}