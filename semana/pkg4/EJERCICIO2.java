// EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL PRIMARIA Y SECUNDARIAS
package semana.pkg4;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int sumaDiagonalPrimaria = 1;
        int sumaDiagonalSecundaria = 1;
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el numero de filas es
        //igual que el numero de columna : matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int k= (int)(Math.random() * 10 + 1);
                System.out.println("Ingrese el valor de la posicion : [" + i + "][" + j + "] = " +k);
                matriz [i][j] = k;
                if (i==j){
                    sumaDiagonalPrimaria *= matriz[i][j];
                }
                
                if (i + j == (matriz.length - 1)) {
                    sumaDiagonalSecundaria *= matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("La multiplicacion de la diagonal primaria es : " + sumaDiagonalPrimaria);
        System.out.println("La multiplicacion de la diagonal secundaria es : " + sumaDiagonalSecundaria);

    }
}
