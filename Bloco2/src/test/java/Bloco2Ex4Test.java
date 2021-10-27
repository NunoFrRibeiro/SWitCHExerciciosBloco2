import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex4Test {

    @Test
    void funcaoXteste1 (){
        double expected = -1.0;
        double result = Bloco2Ex4.funcaoXProcessamento(-1.0);
        Assertions.assertEquals(expected,result,0.01);
    }

    @Test
    void funcaoXTeste2 (){
        double expected = 0;
        double result = Bloco2Ex4.funcaoXProcessamento(0);
        Assertions.assertEquals(expected, result, 0.01);
    }

    @Test
    void funcaXTeste3 (){
        double expected = -0.02;
        double result = Bloco2Ex4.funcaoXProcessamento(0.01);
        Assertions.assertEquals(expected, result, 0.01);
    }
}