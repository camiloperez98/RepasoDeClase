package Logica;

public class poo {
    public static void main(String[] args) {

        Alumno alu1=new Alumno();
        Alumno alu2=new Alumno(12, "camilo","perez");
        System.out.println("la id del alumno 2: "+alu2.getId());

        alu1.setId(5);
        alu1.setNombre("kelly");
        alu1.setApellido("perez");

        System.out.println("-------------------------------");

        System.out.println("el nombre del alumno 1 es: "+ alu1.getNombre());
        System.out.println("apellido: "+alu1.getApellido());
        System.out.println("ID: "+alu1.getId());
    }
}
