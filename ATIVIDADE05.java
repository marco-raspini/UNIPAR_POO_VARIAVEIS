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

// ATIVIDADE 02

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

