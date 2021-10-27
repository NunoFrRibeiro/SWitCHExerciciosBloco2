import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Bloco2Ex1 {


    public static double ex1MediaPesadaProcessamento(int nota1, int nota2, int nota3, double peso1, double peso2, double peso3){
        double mediaPesada;
        double somaPesos = (peso1 + peso2 + peso3);

        mediaPesada = ((nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos);

        if ((nota1 < 0) || (nota2 < 0) || (nota3 < 0) || (peso1 <= 0) || (peso2 <= 0) || (peso3 <= 0)) {
            return Double.NaN;
        } else if((nota1 > 20) || (nota2 > 20) || (nota3 > 20)){
            return Double.NaN;
        } else return mediaPesada;
    }

    public  static double ex1VerificacaoMedia(int nota1, int nota2, int nota3, double peso1, double peso2, double peso3){
        double mediaPesada = ex1MediaPesadaProcessamento(nota1, nota2, nota3, peso1, peso2, peso3);
        if(mediaPesada <= 7.99) {
            return Double.NaN;
        }else {
            return mediaPesada;
        }
    }
}

