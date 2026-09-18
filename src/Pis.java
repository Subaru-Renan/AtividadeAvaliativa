public class Pis extends ImpFederal {

    public Pis() {
        super();
    }

    public Pis(double aliquota, String sigla, int codigoReceita) {
        super(aliquota, sigla, codigoReceita);
    }
    
    @Override 
    public double calcularBc(double valor) {
        return valor;
    }
    
}
