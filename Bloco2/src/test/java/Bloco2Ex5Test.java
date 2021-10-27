import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex5Test {

    @Test
    void volumeCuboTeste1(){
        double expected = 2.15;
        double resultado = Bloco2Ex5.volumeCuboProcessamento(10);
        Assertions.assertEquals(expected, resultado, 0.01);
    }

    @Test
    void volumeCuboTeste2(){
        double resultado = Bloco2Ex5.volumeCuboProcessamento(-5);
        Assertions.assertEquals(Double.NaN,resultado, 0.01);
    }

    @Test
    void volumeCuboTeste3(){
        double expected = 0.002;
        double resultado = Bloco2Ex5.volumeCuboProcessamento(0.1);
        Assertions.assertEquals(expected, resultado, 0.01);
    }

    @Test
    void tamanhoVolumeCuboTeste1(){
        String expected = "Cubo Pequeno";
        String resultado = Bloco2Ex5.tamanhoVolumeCuboProcessamento(0.1);
        Assertions.assertEquals(expected, resultado);
    }

    @Test
    void tamanhoVolumeCuboTeste2(){
        String expected = "Cubo Médio";
        String resultado = Bloco2Ex5.tamanhoVolumeCuboProcessamento(8);
        Assertions.assertEquals(expected,resultado);
    }

    @Test
    void tamanhoVolumeCuboTeste3(){
        String expected = "Cubo Grande";
        String resultado = Bloco2Ex5.tamanhoVolumeCuboProcessamento(10);
        Assertions.assertEquals(expected,resultado);
    }

    @Test
    void tamanhoVolumeCuboTeste4(){
        String resultado = Bloco2Ex5.tamanhoVolumeCuboProcessamento(-5);
        Assertions.assertEquals("Área Inválida",resultado);
    }

}