import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Banco JAVA ! Por favor, digite o seu primeiro nome:");
        String primeiroNome = scanner.next();

        System.out.println("Agora o segundo nome:");
        String segundoNome = scanner.next();
        
        System.out.println("Digite a sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua agência:");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor que deseja depositar:");
        double saldo = scanner.nextDouble();
        System.out.println(textoFinal(primeiroNome,segundoNome,agencia,numero,saldo));
    }

    public static String textoFinal (String primeiroNome, String segundoNome, String agencia, int numero, double saldo){
        return "Olá, " + primeiroNome.concat(" ").concat(segundoNome).concat(" obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", e o numero da conta ") + numero + " e o seu saldo de " + saldo + " já está disponível para saque.";

      }


}
