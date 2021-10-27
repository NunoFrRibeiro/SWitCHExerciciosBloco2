import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex3Test {

    @Test
    void ex3DistTeste1() {
        double expected = 1;
        double result = Bloco2Ex3.ex3DistProcessamento(1,2,1,3);
        Assertions.assertEquals(expected, result, 0.01);
    }

    @Test
    void ex3DistTeste2(){
        double expected = 1;
        double result = Bloco2Ex3.ex3DistProcessamento(-1, -2, -1, -3);
        Assertions.assertEquals(expected, result, 0.01);
    }

    @Test
    void ex3DistTeste3(){
        double result = Bloco2Ex3.ex3DistProcessamento(1, 2, 1, 2);
        Assertions.assertEquals(Double.NaN, result, 0.01);
    }

    @Test
    void ex3DistTeste4(){
        double expected = 4.47;
        double result = Bloco2Ex3.ex3DistProcessamento(4, -2, 2, 2);
        Assertions.assertEquals(expected,result, 0.01);
    }
}