public class Bloco2Ex12 {

    public static String avaliacaoIndiceDePoluicaoProcessamento(double indiceDePoluicao){
        String avaliacao = "";

        if (indiceDePoluicao < 0){
            avaliacao = "Valor de indice de poluição Inválido";
        } else if (indiceDePoluicao >= 0 && indiceDePoluicao < 0.3){
            avaliacao = "Indice de poluição dentro do intervalo aceitável";
        } else if (indiceDePoluicao >= 0.3 && indiceDePoluicao < 0.4){
            avaliacao = "1º Grupo de empresas intimada a suspender actividades";
        } else if (indiceDePoluicao >= 0.4 && indiceDePoluicao <0.5){
            avaliacao = "1º Grupo e 2º Grupo de empresas intimada a suspender actividades";
        } else if (indiceDePoluicao >= 0.5) {
            avaliacao = "Todas as empresas suspendem actividades";
        }
        return avaliacao;
    }
}
