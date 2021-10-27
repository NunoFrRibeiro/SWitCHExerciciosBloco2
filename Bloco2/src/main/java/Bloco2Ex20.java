public class Bloco2Ex20 {
    public static String valorAluguerProcessamento(String diaDeAluguer, String kitAluguer, double distKm){
        String aluguerTotal = "";
        int dia = 0;
        int nKit = 0;
        String[] diaDeSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo", "Feriado"};
        String[] kits = {"A", "B", "C"};
        int precoKit[][] = {{30, 30, 30, 30, 30, 50, 50, 50} , {40, 40, 40, 40, 40, 70, 70, 70} ,
                {100, 100, 100, 100, 100, 140, 140, 140}};
        for (dia = 0; dia < diaDeSemana.length; dia++){
            for (nKit = 0; nKit < kits.length; nKit++)
            if (diaDeSemana[dia].equals(diaDeAluguer) && kits[nKit].equals(kitAluguer)){
                int precoAluguer = (int) (precoKit[nKit][dia] + distKm * 2);
                aluguerTotal = "O custo do Aluguer é: " + precoAluguer + "€";
            } else {
                aluguerTotal = "Inputs incorrectos";
            }
        }
        return aluguerTotal;
    }
}
