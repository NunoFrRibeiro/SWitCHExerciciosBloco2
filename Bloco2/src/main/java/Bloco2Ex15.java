public class Bloco2Ex15 {
    public static String ladosDoTrianguloProcessamento(int ladoA, int ladoB, int ladoC) {
        String tipoDeTriangulo = "";

        if (ladoA <= 0) {
            tipoDeTriangulo = "Lado A do triângulo é inválido";
        } else
            if (ladoB <= 0) {
            tipoDeTriangulo = "Lado B do triângulo é inválido";
            } else
                if (ladoC <= 0) {
            tipoDeTriangulo = "Lado C do triângulo é inválido";
                } else
                    if (ladoC > (ladoA + ladoB) || ladoB > (ladoC + ladoA) || ladoA > (ladoB + ladoC)){
            tipoDeTriangulo = "Não existe possibilidade de triângulo";
                    } else
                        if ((ladoA == ladoB) && (ladoB == ladoC)){
            tipoDeTriangulo = "O triângulo é Equilatero";
                        } else
                            if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            tipoDeTriangulo = "O triângulo é Isósceles";
                            } else{
                                tipoDeTriangulo = "O triângulo é Escaleno";
                            }
        return tipoDeTriangulo;
    }
}
