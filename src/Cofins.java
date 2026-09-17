public class Cofins extends ImpFederal {
    private double descontoBase;


    public Cofins() {}

    public Cofins(double descontoBase) {
        this.descontoBase = descontoBase;
    }


    public Cofins(double aliquota, String sigla, int codigoReceita, double descontoBase, String uf) {
        super(aliquota, sigla, codigoReceita, uf);
        this.descontoBase = descontoBase;
    }

    @Override 
    public double calcularBc(double valor) {
        return valor * (1 - descontoBase / 100);
    }
    
}
