import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        int vector [] = new int [4];

        Scanner entrada=new Scanner(System.in);

        for (int i=0; i<vector.length; i++) {
            System.out.println("ingrese el valor para el indice: "+i);
            vector [i]=entrada.nextInt();
        }


        for (int i=0; i<vector.length; i++) {
            System.out.println("estoy en el indice "+i);
            System.out.println("tengo guardado un "+vector[i]);
            System.out.println("--------------------------------------");
        }
    }
}
