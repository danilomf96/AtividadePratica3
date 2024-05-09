public abstract class Funcionario implements Trabalhavel {
    private String nome;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {

        return "\nNome: " + nome +
                "\nMatricula: " + matricula;
    }

    public abstract String calcularSalario();
}