import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex12Test {

    @Test
    void avaliacaoIndiceDeProcessamentoTeste1(){
        String expected = "Indice de poluição dentro do intervalo aceitável";
        String result = Bloco2Ex12.avaliacaoIndiceDePoluicaoProcessamento(0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void avaliacaoIndiceDeProcessamentoTeste2(){
        String expected = "Valor de indice de poluição Inválido";
        String result = Bloco2Ex12.avaliacaoIndiceDePoluicaoProcessamento(-0.5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void avaliacaoIndiceDeProcessamentoTeste3(){
        String expected = "Indice de poluição dentro do intervalo aceitável";
        String result = Bloco2Ex12.avaliacaoIndiceDePoluicaoProcessamento(0.2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void avaliacaoIndiceDeProcessamentoTeste4(){
        String expected = "1º Grupo de empresas intimada a suspender actividades";
        String result = Bloco2Ex12.avaliacaoIndiceDePoluicaoProcessamento(0.3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void avaliacaoIndiceDeProcessamentoTeste5(){
        String expected = "1º Grupo e 2º Grupo de empresas intimada a suspender actividades";
        String result = Bloco2Ex12.avaliacaoIndiceDePoluicaoProcessamento(0.4);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void avaliacaoIndiceDeProcessamentoTeste6(){
        String expected = "Todas as empresas suspendem actividades";
        String result = Bloco2Ex12.avaliacaoIndiceDePoluicaoProcessamento(0.5);
        Assertions.assertEquals(expected, result);
    }

}