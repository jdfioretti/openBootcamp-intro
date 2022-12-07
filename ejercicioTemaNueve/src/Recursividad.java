public class Recursividad{

    //forma recursiva
    public static int factorial(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        }
        resultado = factorial(numero - 1) * numero;
        return resultado;
    }

    //forma NO recursiva
    public static int factorialNR(int numero) {
        int temp;
        int resultado = 1;

        for (temp = 1; temp <= numero; temp++) {
            resultado = resultado * temp;
        }
        return resultado;
    }
}
