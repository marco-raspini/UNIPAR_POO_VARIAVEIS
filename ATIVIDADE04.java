
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

// ATIVIDADE 02

import java.util.Scanner;

class IdentificaParImpar {
    public static void main(String[] args) {
      
        int numero;
        int identificador;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o numero inteiro:  ");
        numero = scanner.nextInt();
        System.out.println();
        
        scanner.close();
        
        identificador = (numero % 2);
        
        if (identificador == 0) {
            System.out.println("Seu numero e Par");
        }
        else {
            System.out.println("Seu numero e Impar");
        }
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 03

import java.util.Scanner;

class IdentificaParImpar {
    public static void main(String[] args) {

        String loginCorreto = "usuario";
        String senhaCorreta = "senha123";

        String login;
        String senha;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Login:  ");
        login = scanner.next();
        System.out.println("Informe a Senha: ");
        senha = scanner.next();
        System.out.println();

        scanner.close();

        if ((login.equals(loginCorreto)) && (senha.equals(senhaCorreta)) ){
            System.out.println("Login realizado com sucesso");
        }
        else {
            System.out.println("Nome de usuario ou senha incorretos");
        }
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 04

import java.util.Scanner;

class IdentificaParImpar {
    public static void main(String[] args) {
      
        int numFirst;
        int numSecond;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero:  ");
        numFirst = scanner.nextInt();
        System.out.println("Informe o segundo numero:  ");
        numSecond = scanner.nextInt();
        System.out.println();
        
        scanner.close();
        
        
        if (numFirst > numSecond) {
            System.out.println("O primeiro numero " + numFirst + " e o Maior que o segundo " + numSecond);
        }
        else {
            System.out.println("O segundo numero " + numSecond + " e o Maior que o primeiro " + numFirst);
        }
    }
}


