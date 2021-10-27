import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex13Test {

    @Test
    void horasECustoTeste1(){
        String expected = "Quantidade de Grama inválida";
        String result = Bloco2Ex13.horasECustoProcessamento(-20,20,10);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void horasECustoTeste2(){
        String expected = "Quantidade de Arvores inválido";
        String result = Bloco2Ex13.horasECustoProcessamento(20,-20,10);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void horasECustoTeste3(){
        String expected = "Quantidade de arbustos inválido";
        String result = Bloco2Ex13.horasECustoProcessamento(20,20,-10);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void horasECustoTeste4(){
        String expected = "O serviço terá um custo de 811.11€ e durará 6 horas";
        String result = Bloco2Ex13.horasECustoProcessamento(20,20,10);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void horasECustoTeste5(){
        String expected = "O serviço terá um custo de 5738.89€ e durará 44 horas";
        String result = Bloco2Ex13.horasECustoProcessamento(400,50,20);
        Assertions.assertEquals(expected, result);
    }
}