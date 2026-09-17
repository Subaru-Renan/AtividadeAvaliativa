public class App {
    public static void main(String[] args) throws Exception {
        
         double valorVenda = 10000.00;

        // Criando a nota fiscal
        NotaFiscal nota = new NotaFiscal(
            1,
            "NF-001",
            valorVenda
            
        );

        // Criando os impostos
        Icms icms = new Icms(
             0.0,
             "APA",
             "ASP",
             123
        );

        Pis pis = new Pis(
             1.65,
            "PIS",
             1234,
             "GO"
        );

        Cofins cofins = new Cofins(
            7.6,
            "SIMPLA",
            5678,
            2432,
            "GO"
        );

        // Adicionando os impostos à nota
        nota.adicionar(icms);
        nota.adicionar(pis);
        nota.adicionar(cofins);

        // Exibindo os valores
        nota.imprimirValores();
    }
} 
