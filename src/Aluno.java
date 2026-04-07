import java.time.LocalDate;
import  java.time.Period;

public class Aluno {
    private String nome;
    private int idade;
    private LocalDate dataNacimento;

    public Aluno(String nome, LocalDate dataNacimento) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + calcularIdade() + " anos.");
    }

    public int calcularIdade () {
        return Period.between(dataNacimento, LocalDate.now()).getYears();
    }
}

