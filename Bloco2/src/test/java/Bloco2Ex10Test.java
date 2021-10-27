import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex10Test {

    @Test
    void descontoDeUmArtigoTeste1(){
        String expected = "Preço com desconto é igual a 98.40€";
        String result = Bloco2Ex10.descontoDeUmArtigoProcessamento(249.99);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void descontoDeUmArtigoTeste2(){
        String expected = "Preço com desconto é igual a 74.85€";
        String result = Bloco2Ex10.descontoDeUmArtigoProcessamento(124.75);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void descontoDeUmArtigoTeste3(){
        String expected = "Preço com desconto é igual a 52.50€";
        String result = Bloco2Ex10.descontoDeUmArtigoProcessamento(75);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void descontoDeUmArtigoTeste4(){
        String expected = "Preço com desconto é igual a 27.99€";
        String result = Bloco2Ex10.descontoDeUmArtigoProcessamento(34.99);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void descontoDeUmArtigoTeste5(){
        String expected = "Preço Inválido";
        String result = Bloco2Ex10.descontoDeUmArtigoProcessamento(-10);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void descontoDeUmArtigoTeste6(){
        String expected = "Preço Inválido";
        String result = Bloco2Ex10.descontoDeUmArtigoProcessamento(0);
        Assertions.assertEquals(expected, result);
    }

}