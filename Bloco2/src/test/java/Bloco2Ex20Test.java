import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Ex20Test {
    @Test
    void valorAluguerTeste1(){
        String expected = "Inputs incorrectos";
        String result = Bloco2Ex20.valorAluguerProcessamento("A", "B", 20);
    }

    @Test
    void valorAluguerTeste2(){
        String expected = "O custo do Aluguer é: 90€";
        String result = Bloco2Ex20.valorAluguerProcessamento("Segunda", "B", 20);
    }
}