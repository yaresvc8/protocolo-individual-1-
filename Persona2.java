public class Persona2 {
    private String nombre; 

    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void mostrarNombre() {
        System.out.println("nombre: " + nombre );      
    }

    public static void main(String[] args) {
        Persona2 p1 = new Persona2();
        p1.cambiarNombre("carlos");
        p1.mostrarNombre();
    }
}
