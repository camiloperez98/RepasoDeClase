public class Matrices {
    public static void main(String[] args) {

        int matriz[][] = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++){

                System.out.println("el valor de la posicion f "+ f + " columna "+c);
                System.out.println("es de "+matriz [f] [c]);
                System.out.println("-------------------------------------------------");


            }
        }

    }
}