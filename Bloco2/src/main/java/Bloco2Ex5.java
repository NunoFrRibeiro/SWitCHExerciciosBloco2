public class Bloco2Ex5 {

    public static double volumeCuboProcessamento(double area){
        double volume = Double.NaN;
        if (area > 0){
            double aresta = Math.sqrt(area / 6);
            volume = Math.pow(aresta,3);
        }
        return volume;
    }

    public static String tamanhoVolumeCuboProcessamento(double area){
        double volume = Bloco2Ex5.volumeCuboProcessamento(area);
        String resultado = "Área Inválida";
        if (volume > 0 && volume <= 1)
        {
            resultado = "Cubo Pequeno";
        } else if (volume > 1 && volume <= 2)
        {
            resultado = "Cubo Médio";
        } else if (volume > 2)
        {
            resultado = "Cubo Grande";
        }
        return resultado;
    }
}