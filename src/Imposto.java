public class Imposto {
    private double aliquota;
    private String sigla;

    public Imposto(){

    }

    public Imposto(double aliquota, String sigla) {
        this.aliquota = aliquota;
        this.sigla = sigla;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void salvar() {
        System.out.println("Imposto salvo.");
    }

    public void alterar() {
        System.out.println("Imposto alterado.");
    }

    public void excluir() {
        System.out.println("Imposto excluído.");
    }

    public void pesquisar() {
        System.out.println("Imposto pesquisado.");
    }
    
        // Cada imposto poderá ter sua própria regra
    public double calcularBc(double valor){
        return valor;
    };

    // Método comum para todos os impostos
    public double calcularValor(double valor) {
        double baseCalculo = calcularBc(valor);
        return baseCalculo * (aliquota / 100);
    }

    public String getEsfera(){
        return "Não definida";
    };

    
}
