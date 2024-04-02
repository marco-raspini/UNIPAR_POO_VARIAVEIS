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


