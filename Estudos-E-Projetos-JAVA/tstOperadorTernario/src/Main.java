import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();
        int maior = ((num > num2) ? num : num2);
        System.out.println("O maior número é: " + maior);
    }
}