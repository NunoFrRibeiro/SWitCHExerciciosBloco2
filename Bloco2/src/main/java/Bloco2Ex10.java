public class Bloco2Ex10 {

    public static String descontoDeUmArtigoProcessamento (double precoArtigo){

        double precoDeSaldo;
        String precoFinal = " ";
        if (precoArtigo > 200){
            precoDeSaldo = precoArtigo * 0.4;
            precoFinal = String.format("Preço com desconto é igual a %.2f€", precoDeSaldo);
        } else if (precoArtigo > 100 && precoArtigo <= 200){
            precoDeSaldo = precoArtigo * 0.6;
            precoFinal = String.format("Preço com desconto é igual a %.2f€", precoDeSaldo);
        } else if (precoArtigo > 50 && precoArtigo <= 100){
            precoDeSaldo = precoArtigo * 0.7;
            precoFinal = String.format("Preço com desconto é igual a %.2f€", precoDeSaldo);
        } else if (precoArtigo > 0 && precoArtigo <= 50) {
            precoDeSaldo = precoArtigo * 0.8;
            precoFinal = String.format("Preço com desconto é igual a %.2f€", precoDeSaldo);
        } else if (precoArtigo <= 0) {
            precoFinal = "Preço Inválido";
        }
        return precoFinal;
    }
}