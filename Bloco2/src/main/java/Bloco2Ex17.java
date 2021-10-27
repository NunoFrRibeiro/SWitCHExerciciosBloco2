public class Bloco2Ex17 {
    public static String horasDeChegadaProcessamento(int horasPartida, int minutosPartida, int horasViagem, int minutosViagem){
        String horarioDeChegada = "";
        int conversaoHorasPartida = horasPartida * 60;
        int conversaoHorasViagem = horasViagem * 60;
        int diaSeguinte = 0;
        int horas = 0;
        int minutos = 0;
        int totalMinutos = conversaoHorasPartida + conversaoHorasViagem + minutosPartida + minutosViagem;
        if (horasPartida < 0 || horasPartida > 24){
            horarioDeChegada = "Horas de Partida Inválidas";
            } else
                if (minutosPartida <0 || minutosPartida > 60) {
                    horarioDeChegada = "Minutos de Partida Inválidos";
                    } else
                        if (horasViagem < 0 || horasViagem > 24){
                            horarioDeChegada = "Horas de Viagem Inválidas";
                            } else
                                if (minutosViagem < 0 || minutosViagem > 60){
                                    horarioDeChegada = "Minutos de Viagem Inválidos";
                                    } else
                                        if (totalMinutos > 1440) {
                                            diaSeguinte = totalMinutos - 1440;
                                            horas = diaSeguinte / 60;
                                            minutos = diaSeguinte % 60;
                                            horarioDeChegada = "O comboio chega às " + horas + "h" + minutos + "m do dia seguinte";
                                        } else {
                                            horas = totalMinutos / 60;
                                            minutos = totalMinutos % 60;
                                            horarioDeChegada = "O comboio chega às " + horas + "h" + minutos + "m";
                                        }
        return horarioDeChegada;
    }
}
