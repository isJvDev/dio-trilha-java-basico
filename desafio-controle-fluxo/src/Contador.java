import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro número :");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o segundo numero :");
        int numeroDois = terminal.nextInt(); 

        try{
         contar(numeroUm, numeroDois);

        }
        catch (ParametrosInvalidosException e){
            System.out.println("O segundo numero deve ser maior que o primeiro.");
        }

    }

    public static void contar (int numeroUm , int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois){
            throw new ParametrosInvalidosException();
            
        }

        else{
            int contagem = numeroDois - numeroUm;
            for (int x = 1 ; x <= contagem; x++)
            System.out.println("Imprimindo o número: " + x );
          
    }
    }

}
