public class Desenvolvedor extends Funcionario {
    private String linguagens;
    private String repositorio;

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String matricula, String linguagens, String repositorio) {
        super(nome, matricula);
        this.linguagens = linguagens;
        this.repositorio = repositorio;
    }

    @Override
    public String calcularSalario() {
        System.out.println("\nDigite as horas Trabalhadas");
        double ht = Console.lerDouble();
        System.out.println("\nDigite o valor:");
        double valor = Console.lerDouble();
        double sal = ht * valor;
        return toString() + "\nSalario: " + sal;
    }

    @Override
    public String trabalhar() {
        return "\nO dev " + getNome() + " chegou no trabalho.";
    }
    
    @Override
    public String relatarProgresso() {
        return "\nO dev " + getNome() + " realizou um novo commit no repositorio " + repositorio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLinguagens de Programação: " + linguagens;
    }
}
