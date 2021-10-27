public class Bloco2Ex8 {

    public static String verificacaoMultiploProcessamento(int x, int y) {
        String resultado = " ";
        int n;
        int ny = 0;
        if (y == 1) {
            resultado = "Qualquer número é multpiplo de 1";
        } else if (x == 0 || y == 0) {
            resultado = "Número Inválido";
        } else

        for (n = 2; x > ny; n++) {
            ny = n * y;
            if (x == ny) {
                resultado = x + " é multiplo de " + y;
                break;
            } else {
                resultado = x + " não é multiplo de " + y;
            }
        }
        return resultado;
    }

    public static String verificacaoDivisorProcessamento(int x, int y) {
        String resultado = " ";
        if (x == 0 || y == 0) {
            resultado = "Número Inválido";
        } else if (x == 1){
                resultado =  "Qualquer número pode ser dividido por 1";
            } else if ((y % x) == 0){
                resultado = x + " é divisor de " + y;
            } else {
            resultado = x + " não é divisor de " + y;
        }
        return resultado;
    }
}
