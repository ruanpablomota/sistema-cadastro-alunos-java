import java.time.LocalDate;
import java.util.Scanner;
import  java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Sair");
         int opcao = sc.nextInt();

        ArrayList<Aluno> alunos = new ArrayList<>();

        if (opcao == 1) {
            sc.nextLine(); // limpar buffer

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite o ano de nascimento:");
            int ano = sc.nextInt();

            System.out.println("Digite o mes:");
            int mes = sc.nextInt();

            System.out.println("Digite o dia:");
            int dia = sc.nextInt();

            Aluno aluno = new Aluno(nome, LocalDate.of(ano, mes, dia));
            alunos.add(aluno);

            System.out.println("Aluno cadastrado!");
        }
        for (Aluno a : alunos) {
            a.apresentar();
        }
    }

}
