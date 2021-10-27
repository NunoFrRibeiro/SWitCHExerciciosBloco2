public class Bloco2Ex7 {

    public static double custoTotalDaObraProcessamento(double areaAPintar, double custoDaTinta,
                                                       double rendimentoDaTinta, double salarioPintor)
    {
        double custoTotalDaObra = custoDeMaoDeObraTotalProcessamento(areaAPintar, custoDaTinta, rendimentoDaTinta,
                salarioPintor) + custoTotalDeTintaProcessamento(areaAPintar, custoDaTinta, rendimentoDaTinta, salarioPintor);
        return custoTotalDaObra;
    }

    public static double custoDeMaoDeObraTotalProcessamento(double areaAPintar, double custoDaTinta, double rendimentoDaTinta, double salarioPintor) {
        double custoTotalDaMaoDeObra = Double.NaN;
        int numeroDePintores = 0;
        double tempoDeObra;

        if (areaAPintar <= 0 || salarioPintor <= 0){
            numeroDePintores = 0;
        } else if (areaAPintar > 0 && areaAPintar < 100){
            numeroDePintores = 1;
        } else if (areaAPintar >= 100 && areaAPintar < 300){
            numeroDePintores = 2;
        } else if (areaAPintar >= 300 && areaAPintar < 1000){
            numeroDePintores = 3;
        } else if (areaAPintar >= 1000){
            numeroDePintores = 4;
        }

        tempoDeObra = ((areaAPintar / numeroDePintores) / 2) / 8;
        custoTotalDaMaoDeObra = tempoDeObra * numeroDePintores * salarioPintor;
        return custoTotalDaMaoDeObra;

    }

    public static double custoTotalDeTintaProcessamento(double areaAPintar, double custoDaTinta, double rendimentoDaTinta, double salarioPintor)
    {
        double custoTotalDeTinta = (areaAPintar / rendimentoDaTinta) * custoDaTinta;
        if (custoTotalDeTinta <= 0 || custoTotalDeTinta == Double.NaN){
            custoTotalDeTinta = Double.NaN;
        }
        return custoTotalDeTinta;
    }
}
