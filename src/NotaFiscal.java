import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private int id;
    private String numeroNota;
    private double valorOperacao;
    private List <Imposto> impostos;


    public NotaFiscal() {

    }

    public NotaFiscal(int id, String numeroNota, double valorOperacao) {
        this.id = id;
        this.numeroNota = numeroNota;
        this.valorOperacao = valorOperacao;
        this.impostos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public List<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(List<Imposto> impostos) {
        this.impostos = impostos;
    }

    
    public void adicionar(Imposto imposto) {
        impostos.add(imposto);
    }

    public double calcularTotalImpostos() {
        double total = 0;

        for (Imposto imposto : impostos) {
            total += imposto.calcularValor(valorOperacao);
        }

        return total;
    }

    public double getTotalFederal() {
        return valorOperacao + calcularTotalImpostos();
    }

    public void imprimirValores() {

        System.out.println("======================================");
        System.out.println("              NOTA FISCAL");
        System.out.println("======================================");

        System.out.println("ID: " + id);
        System.out.println("Número: " + numeroNota);

        System.out.printf(
            "Valor da operação: R$ %.2f%n",
            valorOperacao
        );

        System.out.println("--------------------------------------");

        for (Imposto imposto : impostos) {

            double baseCalculo =
                imposto.calcularBc(valorOperacao);

            double valorImposto =
                imposto.calcularValor(valorOperacao);

            System.out.println("Sigla: " + imposto.getSigla());

            System.out.println(
                "Esfera: " + imposto.getEsfera()
            );

            System.out.printf(
                "Alíquota: %.2f%%%n",
                imposto.getAliquota()
            );

            System.out.printf(
                "Base de cálculo: R$ %.2f%n",
                baseCalculo
            );

            System.out.printf(
                "Valor apurado: R$ %.2f%n",
                valorImposto
            );

            System.out.println("--------------------------------------");
        }

        System.out.printf(
            "Total de impostos: R$ %.2f%n",
            calcularTotalImpostos()
        );

        System.out.printf(
            "Valor total + impostos: R$ %.2f%n",
            valorOperacao + calcularTotalImpostos()
        );

        System.out.println("======================================");
    }
}
