// ATIVIDADE 01

class ProgramaFizzBuzz {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) {

            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Valor "+ i + " = FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Valor " + i + " = Fizz");
            }else if(i % 5 == 0){
                System.out.println("Valor "+ i + " = Buzz");
            }else{
                System.out.println("Valor "+ i);
            }
        }
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 02

import java.util.Scanner;

class PatinhosDaXuxa {
    public static void main(String[] args) {
       
        int patinhos;
        int totalPatinhos;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe numero de patinhos:  ");
        patinhos = scanner.nextInt();
        System.out.println();
        
        scanner.close();
       
        totalPatinhos = patinhos;
       
        while (patinhos > 0) {
            
            System.out.println();
            
            if (patinhos != 0){
                System.out.println(patinhos + " patinhos foram passear... Alem das montanhas para brincar... A mamae gritou: Qua, qua, qua, qua");
            
                patinhos = patinhos - 1;
                
                if (patinhos == 0){
                    System.out.println("Mas nenhum patinho voltou de la");
                } else {
                    System.out.println("Mas so " + patinhos + " patinhos voltaram de la");
                }
            }
        }
        System.out.println();
        System.out.println("A mamae patinha foi procurar... Alem das montanhas na beira do mar... A mamae gritou: Qua, qua, qua, qua... E os " + totalPatinhos + " patinhos voltaram de la.");
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 03

import java.util.Scanner;

class ProgramaIdadeEmDias {
    public static void main(String[] args) {
        
        int anos;
        int meses;
        int dias;
        int diasBase = 1;
        int mesBase  = 30;
        int anoBase  = 365;
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a idade em anos: ");
        anos = scanner.nextInt();
        
        System.out.println("Informe quantos meses: ");
        meses = scanner.nextInt();
        
        System.out.println("Informe os dias: ");
        dias = scanner.nextInt();
        
        scanner.close();
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 04

import java.util.Scanner;

//Faaa um algoritmo que leia 20 numeros e, ao final, escreva quantos estao entre 0 e
//100, quantos estao entre 101 e 200 e quantos sao maiores de 200

class ContaNumeros {
    public static void main(String[] args) {
       
        int numeros;
        int numero;
        int maiorZero = 0;
        int maiorCem = 0;
        int maiorDuz = 0;
        int i = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (i <= 4) {
            i++;
            
            System.out.println("Informe o numero:  ");
            numero = scanner.nextInt();
            System.out.println();
            
            if ((numero >= 0) && (numero <= 100)){
                maiorZero++;
            } else if ((numero >= 101) && (numero <= 200)){
                maiorCem++;
            } else if ((numero > 200){
                maiorDuz++;
            }
        }
        scanner.close();
    }
    System.out.println(maiorZero);
    System.out.println(maiorCem);
    System.out.println(maiorDuz);
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 05

// CLASSE CARRO
import java.util.Scanner;

class Carro {

    String marca;
    String modelo;
    int kilometragem;

    public void criandoCarro() {
        System.out.println("Carro criado");
    }

    public void marcaVeiculo(String marca) {
        this.marca = marca;
    }

    public void modeloVeiculo(String modelo) {
        this.modelo = modelo;
    }

    public void kilometragemCarro(int kilometragem) {
        this.kilometragem = kilometragem;
    }
}

// CLASSE CARROTESTE -> UTILIZADA PARA REALIZAR TESTES PARA OS MÉTODOS

public class CarroTeste {
    public static void main(String[] args) {

        String marcaCarro;
        String modeloCarro;
        int kilometragemCarro;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a marca do veiculo:  ");
        marcaCarro = scanner.next();
        System.out.println();

        System.out.println("Informe o modelo do veiculo:  ");
        modeloCarro = scanner.next();
        System.out.println();

        System.out.println("Informe a kilometragem do veiculo:  ");
        kilometragemCarro = scanner.nextInt();
        System.out.println();

        scanner.close();

        Carro carroTeste = new Carro();

        carroTeste.criandoCarro();
        carroTeste.marcaVeiculo(marcaCarro);
        carroTeste.modeloVeiculo(modeloCarro);
        carroTeste.kilometragemCarro(kilometragemCarro);

        System.out.println();

        System.out.println(carroTeste);
        System.out.println(carroTeste.marca);
        System.out.println(carroTeste.modelo);
        System.out.println(carroTeste.kilometragem);

        System.out.printf("O veículo cadastrado é um %s modelo %s com um quantidade de %s KM rodados", carroTeste.marca, carroTeste.modelo, carroTeste.kilometragem);
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 06

// CLASSE CONTABANCARIA
public class ContaBancaria {

    private double saldo;
    private String numeroConta;


    public double getSaldo(){
        return saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }


    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setNumeroConta(String time){
        this.numeroConta = numeroConta;
    }

    
    public void depositar(double valor) {
        this.saldo = saldo + valor;
        System.out.printf("Valor de R$ %s depositado com suceso!", valor);
    }

    public void sacar(double valor) {
        if (saldo > valor) {
            this.saldo = saldo - valor;
            System.out.printf("Valor %s sacado com sucesso!", valor);
        }
        else {
            System.out.printf("Valor %s não pode ser sacadao pois excede a quantia do saldo.", valor);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Seu saldo atual é de R$ %s ", getSaldo());
    }
}


// CLASSE TESTE -> UTILIZADA PARA REALIZAR TESTES PARA OS MÉTODOS
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        double saldoConta ;
        String numeroContaTeste;
        double valor;


        int validador = 1;
        int opcao;

        ContaBancaria contaBancaria = new ContaBancaria();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o n° de sua conta:  ");
        numeroContaTeste = scanner.next();
        contaBancaria.setNumeroConta(numeroContaTeste);
        System.out.println();
        System.out.println("Informe o saldo atual da sua conta:  ");
        saldoConta = scanner.nextDouble();
        contaBancaria.setSaldo(saldoConta);
        System.out.println();


        while (validador == 1){

            System.out.println("O que você gostaria de fazer?");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.println();
            opcao = scanner.nextInt();
            System.out.println();


            if (opcao == 1){
                System.out.println("Qual valor você gostaria de depositar?");
                valor = scanner.nextDouble();
                contaBancaria.depositar(valor);
                System.out.println();

            } else if (opcao == 2){
                System.out.println("Qual valor você gostaria de sacar?");
                valor = scanner.nextDouble();
                contaBancaria.sacar(valor);
                System.out.println();

            } else if (opcao == 3) {
                contaBancaria.consultarSaldo();
                System.out.println();

            } else if ( opcao == 0){
                System.out.println("Programa finalizado...");
                validador = 0;
            }
        }
    }
}
