import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = inpu.nextInt();

        if (num < 0){
            System.out.println(String.format("O número %d é negativo", num));
        } else if (num > 0) {
            System.out.println(String.format("O numero %d é positivo", num));
        }
        else {
            System.out.println(String.format("O numero informado %d é igual a 0", num));
        }
    }
}