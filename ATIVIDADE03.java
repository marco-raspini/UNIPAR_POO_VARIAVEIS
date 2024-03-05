
// ATIVIDADE 01
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        int notaUm;
        int notaDois;
        int notaTres;
        int media;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe suas notas:  ");
        notaUm = scanner.nextInt();
        notaDois = scanner.nextInt();
        notaTres = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Nota 1 - "+ notaUm);
        System.out.println("Nota 2 - "+ notaDois);
        System.out.println("Nota 3 - "+ notaTres);
        
        media = (notaUm + notaDois + notaTres);

        System.out.println("");
        System.out.println("Media Final: " + media);
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 02
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        int notaUm;
        int notaDois;
        int resultado;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe os valores para subtrair:  ");
        notaUm = scanner.nextInt();
        notaDois = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Valor 1 - "+ notaUm);
        System.out.println("Valor 2 - "+ notaDois);
        
        resultado = (notaUm - notaDois);

        System.out.println("");
        System.out.println("Resultado Final: " + resultado);
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 03
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        int notaUm;
        int notaDois;
        int media;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe os valores para calcular a media:  ");
        notaUm = scanner.nextInt();
        notaDois = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Valor 1 - "+ notaUm);
        System.out.println("Valor 2 - "+ notaDois);
        
        media = ((notaUm + notaDois)/2);

        System.out.println("");
        System.out.println("Resultado Final: " + media);
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 04
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        int notaUm;
        int notaDois;
        int notaTres;
        int notaQuatro;
        int media;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe os valores para calcular a media:  ");
        notaUm = scanner.nextInt();
        notaDois = scanner.nextInt();
        notaTres = scanner.nextInt();
        notaQuatro = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Nota 1 - "+ notaUm);
        System.out.println("Nota 2 - "+ notaDois);
        System.out.println("Nota 3 - "+ notaTres);
        System.out.println("Nota 4 - "+ notaQuatro);
        
        media = ((notaUm + notaDois + notaTres + notaQuatro)/4);

        System.out.println("");
        System.out.println("Resultado Final: " + media);
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 5
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        int notaUm;
        int notaDois;
        int resultSoma;
        int resultSub;
        int resultMulti;
        int resultDiv;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe os valores para calcular a media:  ");
        notaUm = scanner.nextInt();
        notaDois = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Valor 1 - "+ notaUm);
        System.out.println("Valor 2 - "+ notaDois);

        resultSoma = (notaUm + notaDois);
        resultSub = (notaUm - notaDois);
        resultMulti = (notaUm * notaDois);
        resultDiv = (notaUm / notaDois);

        System.out.println("");
        System.out.println("Resultado Soma: " + resultSoma);
        System.out.println("Resultado Subtracao: " + resultSub);
        System.out.println("Resultado Soma: " + resultMulti);
        System.out.println("Resultado Soma: " + resultDiv);
    }
}

//------------------------------------------------------------------------------------------------------------------

// ATIVIDADE 6






