public class Bloco2Ex11 {

    public static String tipoDeTurmaProcessamento(double aprovados, double limite1, double limite2,
                                                  double limite3, double limite4) {
        String resultado = "";
        String limites = "";

        if (limite4 <= 0 || limite4 < limite1) {
            limites = "Valor do Limite 4 inválido";
            return limites;
        } else if (limite3 <= 0 || limite3 > limite4) {
            limites = "Valor do Limite 3 inválido";
            return limites;
        } else if (limite2 <= 0 || limite2 > limite3) {
            limites = "Valor do Limite 2 inválido";
            return limites;
        } else if (limite1 < 0 || limite1 > limite2) {
            limites = "Valor do Limite 1 inválido";
            return limites;
        } else if (aprovados < 0 || aprovados > 1){
            resultado = "Valor Inválido";
        } else if(aprovados < limite1){
            resultado = "Turma Má";
        } else if (aprovados < limite2){
            resultado = "Turma Fraca";
        } else if (aprovados < limite3){
            resultado = "Turma Razoável";
        } else if (aprovados < limite4){
            resultado = "Turma Boa";
        } else
            resultado = "Turma Excelente";

        return resultado;
    }
}
