public class Gerente extends Funcionario {
    private String equipe;
    private double bonusAnual;

    public Gerente(String nome, String matricula, String equipe, double bonusAnual) {
        super(nome, matricula);
        this.equipe = equipe;
        this.bonusAnual = bonusAnual;
    }

    public Gerente() {
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
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

        return super.toString() + "\nBonus Anual: " + bonusAnual + "\nEquipe : " + equipe;
    }
}
