
// ATIVIDADE 01

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        int idadePessoa = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        idadePessoa = scanner.nextInt();

        scanner.close();
        System.out.println("");

        if (idadePessoa >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        System.out.println("");
    }
}

//------------------------------------------------------------------------------------------------------------------

