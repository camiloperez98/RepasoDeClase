import java.util.Scanner;

public class Respaso_Escanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nombre del 1er producto: ");
        String producto1;
        producto1= sc.next();

        System.out.println("ingrese el valor: ");
        int valor1;
        valor1=sc.nextInt();

        System.out.println("cantidad: ");
        byte cantidad_producto_1;
        cantidad_producto_1= sc.nextByte();

        int total1=valor1*cantidad_producto_1;

        System.out.println("ingrese el nombre del 2ndo producto: ");
        String producto2;
        producto2=sc.next();

        System.out.println("ingrese el valor: ");
        int valor2;
        valor2= sc.nextInt();

        System.out.println("cantidad: ");
        byte cantidad_producto_2;
        cantidad_producto_2= sc.nextByte();

        int total2=valor2*cantidad_producto_2;

        System.out.println("ingrese el nombre del 3er producto: ");
        String producto3;
        producto3= sc.next();

        System.out.println("ingrese el valor: ");
        int valor3;
        valor3= sc.nextInt();

        System.out.println("cantidad: ");
        byte cantidad_producto_3;
        cantidad_producto_3= sc.nextByte();

        int total3=valor3*cantidad_producto_3;

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);

        int totalVenta=total1+total2+total3;
        System.out.println("total a pagar: "+totalVenta);





    }
}
