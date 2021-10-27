public class Bloco2Ex2 {

    public static String ex2Numeros(int numero){

        if (numero <= 99) {
            return "Inferior a 100";
        } else if (numero >= 1000){
            return "Superior a 999";
        } else {
            int digito3 = numero % 10;
            int digito2 = (numero /10 )  % 10;
            int digito1 = (numero / 100)  % 10;
            return (digito1 + " " + digito2 + " " + digito3);
        }
    }

    public static String ex2NumerosParOuImpar(int numero){

        if (numero == 0) {
            return "Número Inválido";
        } else if (numero % 2 == 0){
            return "Par";
        } else
            return "Impar";
        }
    }

