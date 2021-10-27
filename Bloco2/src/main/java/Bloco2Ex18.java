public class Bloco2Ex18 {
    public static String tempoMaquinaProcessamento(int tempoMaquina, int horasMaquina, int minMaquina, int segMaq){
        String horarioFinal = "";
        int convHorasMaq = horasMaquina * 3600;
        int convMintMaq = minMaquina * 60;
        int totalMaq = convHorasMaq + convMintMaq + segMaq;
        int tempoFinal = totalMaq + tempoMaquina;

        if (tempoMaquina <= 0){
            horarioFinal = "Tempo de trabalho da máquina inválido";
            } else
                if (horasMaquina < 0 || horasMaquina > 24){
                    horarioFinal = "Horas da Máquina inválidas";
                    } else
                        if (minMaquina < 0 || minMaquina > 60){
                            horarioFinal = "Minutos da Máquina inválidos";
                            } else
                                if (segMaq < 0 || segMaq > 60){
                                    horarioFinal = "Segundos da Máquina inválidos";
                                } else {
                                    int horasFinal = tempoFinal / 3600;
                                    int minFinal = (tempoFinal / 60) % 60;
                                    int segFinal = tempoFinal % 60;
                                    horarioFinal = "A Máquina termina de trabalhas às "
                                            + horasFinal + "h" + minFinal + "m" + segFinal + "s";
                                    }
        return horarioFinal;
    }
}
