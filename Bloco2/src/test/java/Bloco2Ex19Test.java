import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex19Test {
    @Test
    void salarioSemanalTeste1(){
        String expected = "Horas inválidas";
        String result = Bloco2Ex19.salarioSemanalProcessamento(0);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void salarioSemanalTeste2(){
        String expected = "Horas inválidas";
        String result = Bloco2Ex19.salarioSemanalProcessamento(20);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void salarioSemanalTeste3(){
        String expected = "O salário semanal é de 270.00€";
        String result = Bloco2Ex19.salarioSemanalProcessamento(36);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void salarioSemanalTeste4(){
        String expected = "O salário semanal é de 545.00€";
        String result = Bloco2Ex19.salarioSemanalProcessamento(56);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void salarioSemanalTeste5() {
        String expected = "O salário semanal é de 310.00€";
        String result = Bloco2Ex19.salarioSemanalProcessamento(40);
        Assertions.assertEquals(expected, result);
    }
}