import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Alana", LocalDate.of(2000, 7,15));

        System.out.println(a.calcularIdade());
        a.apresentar();
    }
}
