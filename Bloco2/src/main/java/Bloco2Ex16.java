public class Bloco2Ex16 {
    public static String angulosDoTrianguloProcessamento(double alfa, double beta, double gama){
        String tipoDeTriangulo = "";
        if ((alfa + beta + gama) > 180){
            tipoDeTriangulo = "Triângulo Impossivel";
            } else
                if (alfa <= 0){
                    tipoDeTriangulo = "Alfa não é válido";
                } else
                    if (gama <= 0){
                        tipoDeTriangulo = "Gama não é válido";
                    } else
                        if (beta <= 0) {
                            tipoDeTriangulo = "Beta não é válido";
                        } else
                            if (alfa == 90 || beta == 90 || gama == 90){
                                tipoDeTriangulo = "O triangulo é Rectangulo";
                            } else
                                if (alfa > 90 || beta > 90 || gama > 90){
                                    tipoDeTriangulo = "O triangulo é Obtusangulo";
                                } else
                                    tipoDeTriangulo = "O triangulo é Agudo";
        return tipoDeTriangulo;
    }
}
