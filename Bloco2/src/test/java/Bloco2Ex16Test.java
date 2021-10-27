import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex16Test {

    @Test
    void angulosDoTrianguloTeste1(){
        String expected = "Triângulo Impossivel";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(90,90,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void angulosDoTrianguloTeste2(){
        String expected = "Alfa não é válido";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(0,90,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void angulosDoTrianguloTeste3(){
        String expected = "Beta não é válido";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(90,0,10);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void angulosDoTrianguloTeste4(){
        String expected = "Gama não é válido";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(90,10,0);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void angulosDoTrianguloTeste5(){
        String expected = "O triangulo é Rectangulo";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(90,70,20);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void angulosDoTrianguloTeste6(){
        String expected = "O triangulo é Obtusangulo";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(40,100,40);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void angulosDoTrianguloTeste7(){
        String expected = "O triangulo é Agudo";
        String result = Bloco2Ex16.angulosDoTrianguloProcessamento(70,55,55);
        Assertions.assertEquals(expected,result);
    }
}