import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.print("Qual é o seu nome?");
        String nome = leitorTexto.nextLine();
        System.out.print("Digite o seu peso: ");
        int peso = leitorNumero.nextInt();
        System.out.print("Digite a sua altura:");
        double altura = leitorNumero.nextDouble();
        System.out.println("Nome da sua cidade? ");
        String cidade = leitorTexto.nextLine();

        leitorTexto.close();
        leitorNumero.close();

        double imc = peso / Math.pow(altura, 2);

        System.out.println(nome  + ", seu IMC é " + imc);
        System.out.printf("%s, seu IMC é %s.\n", nome, imc);
        System.out.printf("%s, você pesa %sKG e tem %sm,\nseu IMC é %s", nome, peso, altura, imc);
    }
}
