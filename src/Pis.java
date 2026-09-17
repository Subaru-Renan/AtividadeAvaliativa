public class Pis extends ImpFederal {

    public Pis() {
    }

    public Pis(double aliquota, String sigla, int codigoReceita, String uf) {
        super(aliquota, sigla, codigoReceita, uf);
    }
    
    @Override 
    public double calcularBc(double valor) {
        return valor;
    }
    
}
