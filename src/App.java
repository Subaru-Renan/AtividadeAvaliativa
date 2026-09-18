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
             12.0,
            "ICMS",
            "GO",
            0.0
        );

        Pis pis = new Pis(
             1.65,
            "PIS",
            1234
        );

        Cofins cofins = new Cofins(
             7.6,
            "COFINS",
            5678,
            0.0
        );

        // Adicionando os impostos à nota
        nota.adicionar(icms);
        nota.adicionar(pis);
        nota.adicionar(cofins);

        // Exibindo os valores
        nota.imprimirValores();
    }
} 
