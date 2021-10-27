import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Bloco2Ex1Test {

    @Test
    void ex1MediaPesadaTeste1(){
        double expected1 = 7.94;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(8, 7, 10, 5.0, 9.0, 4.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste2(){
        double expected1 = 13.4;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, 10.0, 10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste3(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(-1, 12, 14, 10.0, 10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste4(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, -12, 14, 10.0, 10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste5(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, -14, 10.0, 10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }
    @Test
    void ex1MediaPesadaTeste6(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, 0, 10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste7(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, 10.0, 0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste8(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, 10.0, 10.0, 0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste9(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, -10.0, 10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste10(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, 10.0, -10.0, 80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1MediaPesadaTeste11(){
        double expected1 = Double.NaN;
        double result1 = Bloco2Ex1.ex1MediaPesadaProcessamento(10, 12, 14, 10.0, 10.0, -80.0);
        Assertions.assertEquals(expected1,result1, 0.01);
    }

    @Test
    void ex1VerificaoNotaTeste1(){
        double result1 = Bloco2Ex1.ex1VerificacaoMedia(8, 7, 10, 5, 9, 4);
        Assertions.assertEquals(Double.NaN, result1, 0.01);
    }

    @Test
    void ex1VerificaoNotaTeste2() {
        double result1 = Bloco2Ex1.ex1VerificacaoMedia(14, 16, 15, 20, 25, 54);
        Assertions.assertEquals(15.05, result1, 0.01);
    }
}