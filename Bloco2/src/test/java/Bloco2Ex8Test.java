import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex8Test {

    @Test
    void verificacaoMultiploTeste1(){
        String expected = "40 é multiplo de 5";
        String result = Bloco2Ex8.verificacaoMultiploProcessamento(40,5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoMultiploTeste2(){
        String expected = "Qualquer número é multpiplo de 1";
        String result = Bloco2Ex8.verificacaoMultiploProcessamento(5,1);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoMultiploTeste3(){
        String expected = "Número Inválido";
        String result = Bloco2Ex8.verificacaoMultiploProcessamento(0,5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoMultiploTeste4(){
        String expected = "Número Inválido";
        String result = Bloco2Ex8.verificacaoMultiploProcessamento(5,0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verficacaoMultiploTeste5(){
        String expected = "21 não é multiplo de 5";
        String result = Bloco2Ex8.verificacaoMultiploProcessamento(21,5);
    }

    @Test
    void verificacaoDivisorTeste1(){
        String expected = "5 é divisor de 40";
        String result = Bloco2Ex8.verificacaoDivisorProcessamento(5,40);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoDivisorTeste2(){
        String expected = "Qualquer número pode ser dividido por 1";
        String result = Bloco2Ex8.verificacaoDivisorProcessamento(1,5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoDivisorTeste3(){
        String expected = "Número Inválido";
        String result = Bloco2Ex8.verificacaoDivisorProcessamento(0,5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoDivisorTeste4(){
        String expected = "Número Inválido";
        String result = Bloco2Ex8.verificacaoDivisorProcessamento(5,0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void verificacaoDivisorTeste5(){
        String expected = "5 não é divisor de 21";
        String result = Bloco2Ex8.verificacaoDivisorProcessamento(5,21);
    }

}