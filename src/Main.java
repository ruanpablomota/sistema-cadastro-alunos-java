import java.time.LocalDate;
import java.util.Scanner;
import  java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            //menu aqui
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Sair");

            int opcao = sc.nextInt();

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

            else if (opcao == 2) {
                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno castrado.");
                } else {
                    for (Aluno a : alunos) {
                        a.apresentar();
                    }
                }
            }

            else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            }

            else {
                System.out.println("Opção inválida");
            }
        }

    }

}
