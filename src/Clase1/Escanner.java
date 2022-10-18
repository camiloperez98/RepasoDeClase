package Clase1;

import java.util.Scanner;

public class Escanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String nombre;
        nombre= sc.nextLine();

        System.out.println("ingrese su salario: ");
        int salario;
        salario= sc.nextInt();

        int eps,prestamo;
        prestamo=120000;
        eps=70000;


        System.out.println("el usuario: "+ nombre+" tiene un salario mensual de: "+ salario);
        System.out.println();

    }
}

