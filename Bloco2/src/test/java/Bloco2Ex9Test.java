import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex9Test {

    @Test
    void numeroCrescenteTeste1(){
        String expected = "123 é um número crescente";
        String result = Bloco2Ex9.numeroCrescenteProcessamento(123);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void numeroCrescenteTeste2(){
        String expected = "254 não é um número crescente";
        String result = Bloco2Ex9.numeroCrescenteProcessamento(254);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void numeroCrescenteTeste3(){
        String expected = "Número Inválido";
        String result = Bloco2Ex9.numeroCrescenteProcessamento(0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void numeroCrescenteTeste4(){
        String expected = "Número Inválido";
        String result = Bloco2Ex9.numeroCrescenteProcessamento(1250);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void numeroCrescenteTeste5(){
        String expected = "Número Inválido";
        String result = Bloco2Ex9.numeroCrescenteProcessamento(-438);
        Assertions.assertEquals(expected,result);
    }

}