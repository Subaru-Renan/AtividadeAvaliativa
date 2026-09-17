public class ImpFederal extends Imposto {
    private int codigoReceita;


    public ImpFederal() {

    }

    public int getCodigoReceita() {
        return codigoReceita;
    }



    public void setCodigoReceita(int codigoReceita) {
        this.codigoReceita = codigoReceita;
    }

    public ImpFederal(double aliquota, String sigla, int codigoReceita, String uf) {
        super(aliquota, sigla, uf);
        this.codigoReceita = codigoReceita;
    } 

    @Override 
    public String getEsfera() {
        return "Federal";
    }



    

    
}
