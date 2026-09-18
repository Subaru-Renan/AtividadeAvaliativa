public class ImpFederal extends Imposto {
    private int codigoReceita;


    public ImpFederal() {

    }



   public ImpFederal(double aliquota, String sigla, int codigoReceita) {
        super(aliquota, sigla);
        this.codigoReceita = codigoReceita;
    }

    public int getCodigoReceita() {
        return codigoReceita;
    }

    public void setCodigoReceita(int codigoReceita) {
        this.codigoReceita = codigoReceita;
    }

    @Override 
    public String getEsfera() {
        return "Federal";
    }



    

    
}
