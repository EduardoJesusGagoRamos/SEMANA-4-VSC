// EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS PARES DE LA MATRIZ
package semana.pkg4;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int [] sumaColumnas = new int [10];
        int total = 0;
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el numero de filas es
        //igual que el numero de columna : matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int k= (int)(Math.random() * 10 + 1);
                System.out.println("Ingrese el valor de la posicion : [" + i + "][" + j + "] = " +k);
                matriz [i][j] = k;
                if (j%2 == 0){
                sumaColumnas[j] += matriz [i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        for (int i = 0; i < matriz.length; i++) {
            if (i%2 == 0){
        System.out.println("La suma de la columna "+i+" es : " +sumaColumnas [i]);
        total += sumaColumnas [i];
            }
        }
        System.out.println("La suma total de las columnas pares es : " +total);
    }
}
