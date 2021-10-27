import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Bloco2Ex11Test {

    @Test
    void tipoDeTurmaTeste1(){
        String expected = "Turma Má";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0, 0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTurmaTeste2(){
        String expected = "Turma Má";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.15, 0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void tipoDeTurmaTeste3() {
        String expected = "Turma Fraca";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.37, 0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tipoDeTurmaTeste4() {
        String expected = "Turma Razoável";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.47, 0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tipoDeTurmaTeste5() {
        String expected = "Turma Boa";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.67, .2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tipoDeTurmaTeste6() {
        String expected = "Turma Excelente";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.98, 0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void tipoDeTurmaTeste7() {
        String expected = "Valor Inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(-0.9, 0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurma2Teste8(){
        String expected = "Valor Inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(-0.5,.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurma2Teste9(){
        String expected = "Valor do Limite 1 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,-0.2, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurma2Teste10(){
        String expected = "Valor do Limite 2 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.2, -0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurma2Teste11(){
        String expected = "Valor do Limite 3 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.2, 0.4, -0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurmaTeste12(){
        String expected = "Valor do Limite 4 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.2, 0.4, 0.5, -0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurmaTeste13(){
        String expected = "Valor do Limite 1 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.45, 0.4, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurmaTeste14(){
        String expected = "Valor do Limite 2 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.2, 0.55, 0.5, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurma2Teste15(){
        String expected = "Valor do Limite 3 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.2, 0.4, 0.75, 0.7);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void
    tipoDeTurma2Teste16(){
        String expected = "Valor do Limite 4 inválido";
        String result = Bloco2Ex11.tipoDeTurmaProcessamento(0.5,0.2, 0.4, 0.7, 0.1);
        Assertions.assertEquals(expected, result);
    }
}