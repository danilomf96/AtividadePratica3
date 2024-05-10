public class Estagiario extends Funcionario {
    private String supervisor;
    private int horasTrabalho;

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public Estagiario(String nome, String matricula, String supervisor, int horasTrabalho) {
        super(nome, matricula);
        this.supervisor = supervisor;
        this.horasTrabalho = horasTrabalho;
    }

    public Estagiario() {
    }

    @Override
    public String calcularSalario() {
        System.out.println("\nDigite o valor da hora :");
        double valor = Console.lerDouble();
        System.out.println("\nDigite o valor do vale transporte :");
        double vt = Console.lerDouble();
        double salT = horasTrabalho * valor + vt;
        double sal = horasTrabalho * valor;
        return toString() + "\nDinheiro total: " + salT + "\nVale Transporte " + vt + "\nSalario: " + sal;
    }

    @Override
    public String trabalhar() {
        return "\nO estagiario " + getNome() + " chegou no trabalho";
    }

    @Override
    public String relatarProgresso() {
        return "\nO estagiario falou com o supervisor " + supervisor + " e relatou o progresso.";
    }

    @Override
    public String toString() {

        return super.toString() + "\nHoras de Trabalho: " + horasTrabalho +
                "\nSupervisor: " + supervisor;
    }
}
