package Logica;

public class Alumno {

    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public void mostrarNombre (){

        System.out.println("hola soy un alumno y se decir mi nombre");
    }

}
