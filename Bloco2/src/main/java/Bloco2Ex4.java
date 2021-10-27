public class Bloco2Ex4 {

    public static double funcaoXProcessamento(double x){
        double resultado = 0;
        if (x < 0)
        {
            resultado = x;
        } else if (x > 0){
            resultado = Math.pow(x,2) - 2 * x;
        }
        return resultado;
    }
}
