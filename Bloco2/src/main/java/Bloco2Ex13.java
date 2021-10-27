public class Bloco2Ex13 {

    public static String horasECustoProcessamento(double quantGrama, int quantArvores, int quantArbustos){
        String resultado = "";
        if (quantGrama < 0){
            resultado = "Quantidade de Grama inválida";
        } else if (quantArvores < 0){
            resultado = "Quantidade de Arvores inválido";
        } else if (quantArbustos < 0){
            resultado = "Quantidade de arbustos inválido";
        } else {
            double custoJardinagem = (10 * quantGrama + 20 * quantArvores + 15 * quantArbustos);
            double quantHoras = (300 * quantGrama + 600 * quantArvores + 400 * quantArbustos)/3600;
            double custoTotal = custoJardinagem + (quantHoras * 10);

            //resultado = "O serviço terá um custo de " + custoTotal + "€ e durará " + quantHoras + " horas";
            resultado = String.format("O serviço terá um custo de %.2f€ e durará %.0f horas", custoTotal, quantHoras);
        }
        return resultado;
    }
}
