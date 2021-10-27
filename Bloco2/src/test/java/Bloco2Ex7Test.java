import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex7Test {

    @Test
    void custoTotalDeMaoDeObraTeste1() {
        double expected = 62.5;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(50, 0, 0, 20);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeMaoDeObraTeste2() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(0, 0, 0, 20);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeMaoDeObraTeste3() {
        double expected = 560;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(256, 0, 0, 35);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeMaoDeObraTeste4() {
        double expected = 1250;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(400, 0, 0, 50);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeMaoDeObraTeste5() {
        double expected = 10546.87;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(3375, 0, 0, 50);
        Assertions.assertEquals(expected, result, 0.01);
    }

    @Test
    void custoTotalDeMaoDeObraTeste6() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(-42, 0, 0, 50);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeMaoDeObraTeste7() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(400, 0, 0, 0);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeMaoDeObraTeste8() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoDeMaoDeObraTotalProcessamento(400, 0, 0, -50);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeTinta1() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoTotalDeTintaProcessamento(400, 0, 100, 0);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeTinta2() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoTotalDeTintaProcessamento(400, -20, 100, 0);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeTinta3() {
        double expected = Double.POSITIVE_INFINITY;
        double result = Bloco2Ex7.custoTotalDeTintaProcessamento(400, 20, 0, 0);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeTinta4() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoTotalDeTintaProcessamento(400, 20, -100, 0);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDeTinta5() {
        double expected = 99.96;
        double result = Bloco2Ex7.custoTotalDeTintaProcessamento(400, 24.99, 100, 0);
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void custoTotalDaObraTeste1() {
        double expected = 1350;
        double result = Bloco2Ex7.custoTotalDaObraProcessamento(400, 25, 100, 50);
        Assertions.assertEquals(expected, result, 0.01);
    }

    @Test
    void custoTotalDaObraTeste2() {
        double expected = Double.POSITIVE_INFINITY;
        double result = Bloco2Ex7.custoTotalDaObraProcessamento(400, 25, 0, 50);
        Assertions.assertEquals(expected, result, 0.01);
    }

    @Test
    void custoTotalDaObraTeste3() {
        double expected = Double.NaN;
        double result = Bloco2Ex7.custoTotalDaObraProcessamento(0, 25, 100, 50);
        Assertions.assertEquals(expected, result, 0.01);
    }
}
