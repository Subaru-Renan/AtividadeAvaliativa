public class Icms extends ImpEstadual {
    private double reducaoBc;

    public Icms() {

    }


    public double getReducaoBc() {
        return reducaoBc;
    }

    public void setReducaoBc(double reducaoBc) {
        this.reducaoBc = reducaoBc;
    }


    public Icms(double aliquota, String sigla, String uf, double reducaoBc) {
        super(aliquota, sigla, uf);
        this.reducaoBc = reducaoBc;
    }

    @Override 
    public double calcularBc(double valor) {
        return valor * (1 - reducaoBc / 100);
    }

}
