public class CuadradoMagico {
    public static void main (String[] args){
        int [][]cuadrado = new int [3][3];
        rellenarCuadrado(cuadrado);
        mostrarCuadrado(cuadrado);
    }
    public static void rellenarCuadrado(int[][] cuadrado) {
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                cuadrado[i][j] = numAleatorio();
            }
        }
    }
    public static int numAleatorio(){
        int numAleatorio =  (int)(Math.random()*10+1);
        return numAleatorio;
    }
    public static void mostrarCuadrado(int[][] cuadrado){
        for (int i = 0; i < cuadrado.length ; i++) {
            System.out.println(cuadrado[i][0] + " " + cuadrado[i][1] + " " + cuadrado[i][2] );
        }
    }
    public static boolean filasMagica(int[][] cuadrado) {
        int suma1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        int suma2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        int suma3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        if (suma1 == 15 && suma2 == 15 && suma3 == 15) {
            return true;
        }
        return false;
    }
    public static boolean columnasMagica(int[][] cuadrado) {
        int suma1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        int suma2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[1][2];
        int suma3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        if (suma1 == 15 && suma2 == 15 && suma3 == 15) {
            return true;
        }
        return false;
    }
}
