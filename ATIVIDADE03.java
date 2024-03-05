
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






