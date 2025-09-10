public class persona {
    private String nombre;

    public static void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public static void main(String[] args) {
        persona.cambiarNombre("Carlos");
    }
}
