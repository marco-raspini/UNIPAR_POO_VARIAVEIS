
// ATIVIDADES DE JAVA

// ATIVIDADES 01

class Atividade {
    public static void main(String[] args) {
    
    String nomeProduto = "Camiseta";
    Double precoProduto = 349.90;
    String marcaDoProduto = "Nike";
    Integer quantidadeProdutoEstoque = 50;
    String descricaoProduto = "Camiseta da Nike Original";
    char tamanhoProduto = 'M';
    boolean produtoExclusivoPromocional = true;
    short descontoPromocional = 25; 
    String localArmazenado = "Cidade x";
    long cepEnvioDestino = 85603780;
    }
}

// ATIVIDADE 02

class Atividade {
    public static void main(String[] args) {
    
        String nomeProduto;
        Double precoProduto;
        String marcaDoProduto;
        Integer quantidadeProduto;
        String descricaoProduto;
        String nomeProdutoTeste;
        String numeroProduto;
        double precoDoProduto; 
        long estoqueDisponivel;
        Integer totalDeProdutos;
    }
}

// ATIVIDADE 03

public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeAluno;
        int idadeAluno;
        double notaPrimeira;
        double notaSegunda;
        double mediaNotas;
        
        nomeAluno = "Marco";
        idadeAluno = 21;
        notaPrimeira = 8.5;
        notaSegunda = 9.0;

        mediaNotas = ((notaPrimeira + notaSegunda)/2);

        System.out.println("- - - - - - - - -");
        System.out.println("- Media do aluno -");
        System.out.println("- - - - - - - - -");
        System.out.println("");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Media: " + mediaNotas);
    }
}

// ATIVIDADE 04

public class ControleEstoque {
    public static void main(String[] args) {
        // Declaração das variáveis aqui
        String nomeProduto;
        String categoriaProduto;
        boolean precoProduto;
        Integer qtddEstoque;
    }
}

// ATIVIDADE 05

public class ControleEstoque {
    public static void main(String[] args) {
    
        String nomeSmartphone;
        double precoSmartphone;
        int quantidadeSmartphone;
        String marcaSmartphone;

        String nomeLaptop;
        double precoLaptop;
        int quantidadeLaptop;
        String marcaLaptop;
        
        String nomeFone;
        double precoFone;
        int quantidadeFone;
        String marcaFone;

        nomeSmartphone = "Galaxy S23 Ultra";
        precoSmartphone = 5.000;
        quantidadeSmartphone = 50;
        marcaSmartphone = "Samsung";

        nomeLaptop = "Alienware";
        precoLaptop = 35.000;
        quantidadeLaptop = 12;
        marcaLaptop = "Dell";

        nomeFone = "Cloud Revolver";
        precoFone = 520.00;
        quantidadeFone = 100;
        marcaFone = "HyperX";

        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("- Dados do Produto Cadastrado -");
        System.out.println("- - - - - - - - - - - - - - - -");
        
        System.out.println("");
        System.out.println("Nome: " + nomeSmartphone);
        System.out.println("Marca: " + marcaSmartphone);
        System.out.println("Preco: R$" + precoSmartphone);
        System.out.println("Quantidade em estoque: " + quantidadeSmartphone);
        
        System.out.println("");
        System.out.println("Nome: " + nomeLaptop);
        System.out.println("Marca: " + marcaLaptop);
        System.out.println("Preco: R$" + precoLaptop);
        System.out.println("Quantidade em estoque: " + quantidadeLaptop);
        
        System.out.println("");
        System.out.println("Nome: " + nomeFone);
        System.out.println("Marca: " + marcaFone);
        System.out.println("Preco: R$" + precoFone);
        System.out.println("Quantidade em estoque: " + quantidadeFone);
    }
}

// ATIVIDADE 06

public class Main {
    public static void main(String[] args) {
       
        int numeroProduto = 123; 
        double precoProduto = 25.00; 
        String descricaoProduto;
        
        descricaoProduto = "Fone de ouvido Bluetooth";
        
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("- Dados do Produto Cadastrado -");
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("Numero: " + numeroProduto);
        System.out.println("Preco: $" + precoProduto);
        System.out.println("Descricao: " + descricaoProduto);
        System.out.println("Descricao do Produto: " + descricaoProduto);
    }
}

// ATIVIDADE 07

public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;
        String marcaProduto;

        nomeProduto = "12345";
        precoProduto = 29.99;
        quantidadeProduto = 10;
        marcaProduto = "JBL";

        nomeProduto = "Fone de Ouvido";
        precoProduto = 29.99;
        
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("- Dados do Produto Cadastrado -");
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Marca: " + marcaProduto);
        System.out.println("Preco: $" + precoProduto);
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
    }
}


