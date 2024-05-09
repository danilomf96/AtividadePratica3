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
        return "";
    }

    @Override
    public String trabalhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trabalhar'");
    }

    @Override
    public String relatarProgresso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'relatarProgresso'");
    }

    @Override
    public String toString() {

        return super.toString() + "\nHoras de Trabalho: " + horasTrabalho +
                "\nSupervisor: " + supervisor;
    }
}
