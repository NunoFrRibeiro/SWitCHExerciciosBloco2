public class Bloco2Ex6 {

    public static String converterSegundosEmHorasProcessamento(int segundosTotal){
         String resultado = "Inválido";
         if (segundosTotal > 0 && segundosTotal <= 86400){
             int horas = segundosTotal / 3600;
             int minutos = (segundosTotal / 60) % 60;
             int segundos = segundosTotal % 60;
             resultado = String.format("%02d:%02d:%02d", horas, minutos, segundos);
         }

        String tempo = "Inválido";
         if (segundosTotal >=  21600 && segundosTotal < 43201){
            //System.out.println("Bom Dia");
             tempo = "Bom Dia " + resultado;
        } else if (segundosTotal >=  43201 && segundosTotal < 72001) {
            //System.out.println("Boa Tarde");
             tempo = "Boa Tarde " + resultado;
        } else if (segundosTotal > 0 && segundosTotal < 21600 || segundosTotal >= 72001 && segundosTotal <=86400){
            //System.out.println("Boa Noite");
             tempo = "Boa Noite " + resultado;
        } else
            tempo = "Inválido";
         return tempo;
    }
}
