import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex14Test {

    @Test
    void distMediaDiariaTeste1(){
        String expected = "A distância média diária é de 46.7 km";
        String result = Bloco2Ex14.distMediaDiariaProcessamento(20,10,50,5,60);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void distMediaDiariaTeste2(){
        String expected = "Distância para Segunda inválida";
        String result = Bloco2Ex14.distMediaDiariaProcessamento(-20,10,50,5,60);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void distMediaDiariaTeste3(){
        String expected = "Distância para Terça inválida";
        String result = Bloco2Ex14.distMediaDiariaProcessamento(20,-10,50,5,60);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void distMediaDiariaTeste4(){
        String expected = "Distância para Quarta inválida";
        String result = Bloco2Ex14.distMediaDiariaProcessamento(20,10,-50,5,60);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void distMediaDiariaTeste5(){
        String expected = "Distância para Quinta inválida";
        String result = Bloco2Ex14.distMediaDiariaProcessamento(20,10,50,-5,60);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void distMediaDiariaTeste6(){
        String expected = "Distância para Sexta inválida";
        String result = Bloco2Ex14.distMediaDiariaProcessamento(20,10,50,5,-60);
        Assertions.assertEquals(expected,result);
    }
}