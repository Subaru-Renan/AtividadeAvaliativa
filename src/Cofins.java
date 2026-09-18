public class Cofins extends ImpFederal {
    private double descontoBase;


    public Cofins() {
        super();
    }

    public Cofins(
        double aliquota,
        String sigla,
        int codigoReceita,
        double descontoBase
    ) {
        super(aliquota, sigla, codigoReceita);
        this.descontoBase = descontoBase;
    }

    public double getDescontoBase() {
        return descontoBase;
    }

    public void setDescontoBase(double descontoBase) {
        this.descontoBase = descontoBase;
    }

    @Override 
    public double calcularBc(double valor) {
        return valor * (1 - descontoBase / 100);
    }
    
}
