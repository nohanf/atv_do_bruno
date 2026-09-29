import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   System.out.println("Digite o seu salário:");
   double salario = scanner.nextDouble();
   System.out.println("Digite a porcentagem de aumento:");
   double porcentagem_aumento = scanner.nextDouble();
   double valor_aumento =salario *porcentagem_aumento / 100;
   double novo_salario = valor_aumento + salario;
 System.out.println("O valor do aumento é:"+novo_salario);
 scanner.close();
    }
}