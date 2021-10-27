import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex17Test {
    @Test
    void horasDeChegadaTeste1(){
        String expected = "Horas de Partida Inválidas";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(-9,56,6,50);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste2(){
        String expected = "Horas de Partida Inválidas";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(25,56,6,50);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste3(){
        String expected = "Minutos de Partida Inválidos";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(9,-54,6,50);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste4(){
        String expected = "Minutos de Partida Inválidos";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(9,65,6,50);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste5(){
        String expected = "Horas de Viagem Inválidas";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(9,48,-6,50);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste6(){
        String expected = "Horas de Viagem Inválidas";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(9,48,45,50);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste7(){
        String expected = "Minutos de Viagem Inválidos";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(9,48,2,-80);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste8(){
        String expected = "Minutos de Viagem Inválidos";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(9,48,2,78);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste9(){
        String expected = "O comboio chega às 15h50m";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(10,10,5,40);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void horasDeChegadaTeste10(){
        String expected = "O comboio chega às 2h30m do dia seguinte";
        String result = Bloco2Ex17.horasDeChegadaProcessamento(22,20,4,10);
        Assertions.assertEquals(expected,result);
    }
}