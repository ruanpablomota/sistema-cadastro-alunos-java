import java.time.LocalDate;
import java.util.Scanner;
import  java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();



        while (true) {
            //menu aqui
            System.out.println("\n==== SISTEMA DE ALUNOS ====");

            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine(); // limpar buffer

                System.out.println("Digite o nome:");
                String nome = sc.nextLine().trim();

                //VAlIDAÇÃO DE DUPLICADO
                boolean existe = alunos.stream()
                        .anyMatch(a -> a.getNome().equalsIgnoreCase(nome));
                if (existe) {
                    System.out.println("Aluno já cadastrado!");
                } else {
                    int ano;
                    while (true) {
                        System.out.println("Digite o ano de nascimento: ");
                        if (sc.hasNextInt()) {
                            ano = sc.nextInt();
                            break;
                        } else {
                            System.out.println("Digite um número válido!");
                            sc.next(); // limpa entrada inválida
                        }
                    }

                    System.out.println("Digite o mês:");
                    int mes = sc.nextInt();

                    System.out.println("Digite o dia:");
                    int dia = sc.nextInt();

                    Aluno aluno = new Aluno(nome, LocalDate.of(ano, mes, dia));
                    alunos.add(aluno);

                    System.out.println("Aluno cadastrado!");
                }

                sc.nextLine();
                System.out.println("\nPressione ENTER para continuar...");
                sc.nextLine();

            }
            else if (opcao == 2) {
                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno castrado.");
                } else {
                    for (Aluno a : alunos) {
                        a.apresentar();
                    }
                }
            } else if (opcao == 3) {
                sc.nextLine();

                System.out.println("Digite o nome do aluno:");
                String nomeBusca = sc.nextLine();

                boolean encontrado = false;

                for (Aluno a : alunos) {
                    if (a.getNome().equalsIgnoreCase(nomeBusca)) {
                        a.apresentar();
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Aluno não encontrado");

                }

                System.out.println("\nPressione ENTER para continuar...");
                sc.nextLine();

            } else if (opcao == 4) {
                sc.nextLine();

                System.out.println("Digite o nome do aluno para remover:");
                String nomeRemover = sc.nextLine();

                boolean removido = alunos.removeIf(a -> a.getNome().equalsIgnoreCase(nomeRemover));

                if (removido) {
                    System.out.println("Aluno removido");
                } else {
                    System.out.println("Aluno não encontrado");
                }

                System.out.println("\nPressione ENTER para continuar...");
                sc.nextLine();

            } else if (opcao == 5) {
                sc.nextLine();
                System.out.println("Saindo...");
                break;
            }
            else {
                System.out.println("Opção inválida");
            }
        }

    }

}
