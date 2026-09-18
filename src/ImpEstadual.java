public class ImpEstadual extends Imposto {
    private String uf;


    public ImpEstadual() {
        super();
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ImpEstadual(double aliquota, String sigla, String uf) {
        super(aliquota, sigla);
        this.uf = uf;
    }

    @Override 
    public String getEsfera() {
        return "Estadual";
    }



}
