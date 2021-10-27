public class Bloco2Ex14 {

    public static String distMediaDiariaProcessamento(double distSegunda, double distTerca, double distQuarta, double distQuinta, double distSexta){
        String mediaDiaria = "";

        if (distSegunda < 0){
            mediaDiaria = "Distância para Segunda inválida";
        } else if (distTerca < 0){
            mediaDiaria = "Distância para Terça inválida";
        } else if (distQuarta < 0){
            mediaDiaria = "Distância para Quarta inválida";
        } else if (distQuinta < 0){
            mediaDiaria = "Distância para Quinta inválida";
        } else if (distSexta < 0){
            mediaDiaria = "Distância para Sexta inválida";
        } else {
            double mediaDiariaKm = ((distSegunda + distTerca + distQuarta + distQuinta + distSexta) / 5) * 1.609;
            mediaDiaria = String.format("A distância média diária é de %.1f km",mediaDiariaKm);
        }
        return mediaDiaria;
    }
}
