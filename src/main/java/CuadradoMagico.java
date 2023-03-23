import java.util.Arrays;
import java.util.Random;

public class CuadradoMagico {
    public static void main (String[] args){
        int [][]cuadrado = new int [3][3];
        rellenarCuadrado(cuadrado);
        mostrarCuadrado(cuadrado);
        cuadradoMagico(cuadrado);
    }
    public static void rellenarCuadrado(int[][] cuadrado) {
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                int num = numAleatorio();
                while(estaDuplicado(cuadrado, num)){
                    num = numAleatorio();
                }
                cuadrado[i][j] = num;
            }
        }
    }
    public static boolean estaDuplicado(int[][] cuadrado, int num){
        int contador = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                if (cuadrado[i][j] == num) {
                    contador++;
                    break;
                }
            }
        }

        if (contador == 1) {
            return true;
        }
        return false;
    }
    public static int numAleatorio(){
        Random rNum = new Random();
        int numAleatorio =  rNum.nextInt(1,10);
        return numAleatorio;
    }
    public static void mostrarCuadrado(int[][] cuadrado){
        for (int i = 0; i < cuadrado.length ; i++) {
            System.out.println(Arrays.toString(cuadrado[i]));
        }
    }
    public static boolean filasMagicas(int[][] cuadrado){
        int suma1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        int suma2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        int suma3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        if (suma1 == 15 && suma2 == 15 && suma3 == 15) {
            return true;
        }
        return false;
    }
    public static boolean columnasMagicas(int[][] cuadrado){
        int suma1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        int suma2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        int suma3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
        if (suma1 == 15 && suma2 == 15 && suma3 == 15) {
            return true;
        }
        return false;
    }
    public static boolean diagonalesMagicas(int[][] cuadrado){
        int suma1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int suma2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (suma1 == 15 && suma2 == 15) {
            return true;
        }
        return false;
    }
    public static boolean igualdadesdoMagico(int[][] cuadrado){
        boolean filas = filasMagicas(cuadrado);
        boolean columnas = columnasMagicas(cuadrado);
        boolean diagonales = diagonalesMagicas(cuadrado);
        if (filas && columnas && diagonales) {
            return true;
        }
        return false;
    }
    public static void cuadradoMagico(int[][] cuadrado){
        if (igualdadesdoMagico(cuadrado)){
            System.out.println("Este cuadrado si es un cuadrado Perfecto");
        } else{
            System.out.println("Este cuadrado no es un cuadrado Perfecto");
        }
    }
}
