import java.util.Locale;
import java.util.Scanner;

//Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while(idade >= 0){
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }
        double media = (double) soma / cont;
        System.out.printf("%.2f%n", media);
    }
}