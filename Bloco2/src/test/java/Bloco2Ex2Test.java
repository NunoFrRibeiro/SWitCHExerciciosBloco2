import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex2Test {

    @Test
    void ex2NumerosTeste1() {
        String result = Bloco2Ex2.ex2Numeros(123);
        String expected = (1 + " " + 2 + " " + 3);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void ex2NumerosTeste2() {
        String result = Bloco2Ex2.ex2Numeros(99);
        Assertions.assertEquals("Inferior a 100",result);
    }

    @Test
    void ex2NumerosTeste3() {
        String result = Bloco2Ex2.ex2Numeros(1000);
        Assertions.assertEquals("Superior a 999",result);
    }

    @Test
    void ex2NumerosTeste4() {
        String result = Bloco2Ex2.ex2Numeros(012);
        Assertions.assertEquals("Inferior a 100", result);
    }

    @Test
    void ex2numerosParOuImparTeste1(){
        String result = Bloco2Ex2.ex2NumerosParOuImpar(100);
        Assertions.assertEquals("Par",result);
    }

    @Test
    void ex2numerosParOuImparTeste2(){
        String result = Bloco2Ex2.ex2NumerosParOuImpar(99);
        Assertions.assertEquals("Impar", result);
    }

    @Test
    void ex2numerosParOuImparTeste3(){
        String result = Bloco2Ex2.ex2NumerosParOuImpar(0);
        Assertions.assertEquals("Número Inválido", result);
    }

}