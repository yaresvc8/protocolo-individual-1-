public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio){
    this.nombre = nombre;
    this.edad = edad;
    this.notaPromedio = notaPromedio;
}

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad (){
        return edad;
    }

    public void setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public double getNotaPromedio (){
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio){
        if (notaPromedio >= 0 && notaPromedio <= 5){
            this.notaPromedio = notaPromedio;
        }
    }

}

class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Laura", 20, 4.5);
        estudiante1.setNombre("Laura Isabel");
        estudiante1.setEdad(20);
        estudiante1.setNotaPromedio(4.5);


        System.out.println("informacion del estudiante 1:");
        System.out.println("nombre: " + estudiante1.getNombre());
        System.out.println("edad " + estudiante1.getEdad());
        System.out.println("nota promedio: " + estudiante1.getNotaPromedio());

        System.out.println("----------------------------");

        Estudiante estudiante2 = new Estudiante("Carlos", 18, 3.7);
        estudiante2.setNombre("Carlos Andrés");
        estudiante2.setEdad(19);
        estudiante2.setNotaPromedio(4.0);

        System.out.println("📘 Información del Estudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Nota promedio: " + estudiante2.getNotaPromedio());

        System.out.println("----------------------------");


    }
}