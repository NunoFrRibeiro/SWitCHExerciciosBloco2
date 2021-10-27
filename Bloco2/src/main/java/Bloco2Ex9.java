public class Bloco2Ex9 {

    public static String numeroCrescenteProcessamento(int numero){
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        String resultado = "";

        if (numero < 100 || numero > 999){
            resultado = "Número Inválido";
            return resultado;
        } else {
            digito3 = numero % 10;
            digito2 = (numero / 10) % 10;
            digito1 = (numero / 100) % 10;
        }

        if (digito3 > digito2 && digito2 > digito1)
            resultado = numero + " é um número crescente";
        else
            resultado =  numero + " não é um número crescente";

        return resultado;
    }
}
