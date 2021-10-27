import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex6Test {

    @Test
    void converterSegundosEmHorasTeste1(){
        String expected = "Boa Noite 00:01:00";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(60);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void converterSegundosEmHorasTeste2(){
        String expected = "Boa Noite 01:00:00";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(3600);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void converterSegundosEmHorasTeste3(){
        String expected = "Inválido";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(-40);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void converterSegundosEmHorasTeste4(){
        String expected = "Inválido";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(0);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void converterSegundosEmHorasTeste5(){
        String expected = "Boa Noite 01:00:07";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(3607);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void converterSegundosEmHorasTeste6(){
        String expected = "Bom Dia 06:00:00";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(21600);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void converterSegundosEmHorasTeste7(){
        String expected = "Boa Tarde 12:00:01";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(43201);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void converterSegundosEmHorasTeste8(){
        String expected = "Boa Noite 20:00:01";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(72001);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void converterSegundosEmHorasTeste9(){
        String expected = "Boa Noite 05:00:00";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(18000);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void converterSegundosEmHorasTeste10(){
        String expected = "Inválido";
        String result = Bloco2Ex6.converterSegundosEmHorasProcessamento(86401);
        Assertions.assertEquals(expected, result);
    }
}