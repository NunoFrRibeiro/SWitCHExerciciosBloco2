import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex18Test {
    @Test
    void tempoMaquinaTeste1(){
        String expected = "Tempo de trabalho da máquina inválido";
        String result = Bloco2Ex18.tempoMaquinaProcessamento(0, 2,30,56);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tempoMaquinaTeste2(){
        String expected = "Tempo de trabalho da máquina inválido";
        String result = Bloco2Ex18.tempoMaquinaProcessamento(-100, 2,30,56);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tempoMaquinaTeste3(){
        String expected = "Horas da Máquina inválidas";
        String result = Bloco2Ex18.tempoMaquinaProcessamento(1500, -3,30,56);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tempoMaquinaTeste4(){
        String expected = "Minutos da Máquina inválidos";
        String result = Bloco2Ex18.tempoMaquinaProcessamento(1500, 3,-30,56);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tempoMaquinaTeste5(){
        String expected = "Segundos da Máquina inválidos";
        String result = Bloco2Ex18.tempoMaquinaProcessamento(1500, 3,30,-56);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tempoMaquinaTeste6(){
        String expected = "A Máquina termina de trabalhas às 17h2m36s";
        String result = Bloco2Ex18.tempoMaquinaProcessamento(5500, 15,30,56);
        Assertions.assertEquals(expected, result);
    }
}