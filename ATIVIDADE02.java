
import java.util.Scanner;

class EncontrandoErro {
    public static void main(String[] args) {

        String nome = "";
        int idade = 0;
        double peso = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados: nome... idade... peso... ");
        idade = scanner.nextInt();
        peso = scanner.nextDouble();
        nome = scanner.next(); // <- Basicamente teria de ser alterado o tipo do next para receber a variavel e não fazer a funcao incorreta que seria ele passar para a próxima linha.
        
        scanner.close();
        
        System.out.println("Nome "+ nome);
        System.out.println("idade "+ idade);
        System.out.println("peso "+ peso);
    }
}
