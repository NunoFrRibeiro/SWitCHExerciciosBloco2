public class Bloco2Ex19 {
    public static String salarioSemanalProcessamento(int horasTrabalho){
        String salarioFinal = "";
        double salario = 0;
        double horasExtra1 = horasTrabalho - 36;
        double horasExtra2 = horasExtra1 - 5;
        if (horasTrabalho < 36){
            salarioFinal = "Horas inválidas";
        } else
            if(horasExtra1 < 0){
                salario = 36 * 7.5;
                salarioFinal = String.format("O salário semanal é de %.02f€" ,salario);
                } else
                    if (horasExtra1 <= 5){
                        salario = 36 * 7.5 +  horasExtra1 * 10;
                        salarioFinal = String.format("O salário semanal é de %.02f€" ,salario);
                        } else {
                            salario = 36 * 7.5 + 5 * 10 + horasExtra2 * 15;
                            salarioFinal = String.format("O salário semanal é de %.02f€" ,salario);
                        }
        return salarioFinal;
    }
}
