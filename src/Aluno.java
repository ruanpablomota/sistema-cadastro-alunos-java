import java.time.LocalDate;
import  java.time.Period;

public class Aluno {
    String nome;
    int idade;
    private LocalDate dataNacimento;

    public void apresentar(){
        System.out.println("Ola, meu nome é " + nome + " e tenho " + calcularIdade() + " anos.");
    }

    public Aluno(String nome, LocalDate dataNacimento) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }

    public int calcularIdade () {
        return Period.between(dataNacimento, LocalDate.now()).getYears();
    }
}
