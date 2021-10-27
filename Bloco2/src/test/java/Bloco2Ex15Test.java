import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex15Test {

    @Test
    void tipoDeTrianguloTeste1(){
        String expected = "Lado A do triângulo é inválido";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(0,4,5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste2(){
        String expected = "Lado B do triângulo é inválido";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,0,5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste3(){
        String expected = "Lado C do triângulo é inválido";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,4,0);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste4(){
        String expected = "Não existe possibilidade de triângulo";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(10,4,5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste5(){
        String expected = "Não existe possibilidade de triângulo";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,10,5);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste6(){
        String expected = "Não existe possibilidade de triângulo";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,4,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste7(){
        String expected = "O triângulo é Equilatero";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,3,3);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste8(){
        String expected = "O triângulo é Isósceles";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,2,3);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTrianguloTeste9(){
        String expected = "O triângulo é Escaleno";
        String result = Bloco2Ex15.ladosDoTrianguloProcessamento(3,4,5);
        Assertions.assertEquals(expected,result);
    }
}