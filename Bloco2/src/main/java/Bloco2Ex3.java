public class Bloco2Ex3 {

    public static double ex3DistProcessamento(double x1, double y1, double x2, double y2){

        double d = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2-y1),2)));
        if ((x1 == x2) && (y1 == y2)){
            d = Double.NaN;
        }
        return d;
    }
}
