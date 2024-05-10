public class Gerente extends Funcionario {
    private int equipe;
    private double bonusAnual;

    public Gerente(String nome, String matricula, int equipe, double bonusAnual) {
        super(nome, matricula);
        this.equipe = equipe;
        this.bonusAnual = bonusAnual;
    }
    public Gerente(String nome, String matricula, int equipe) {
        super(nome, matricula);
        this.equipe = equipe;
    }

    public Gerente() {
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
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
        System.out.println("\nDigite as horas Trabalhadas");
        double ht = Console.lerDouble();
        System.out.println("\nDigite o valor:");
        double valor = Console.lerDouble();
        System.out.println("\nQual a equipe? ");
        equipe = Console.lerInt();
        double sal = ht * valor;
        if (equipe % 2 != 0) {
            bonusAnual = 5000;
            return toString() + "\nSalario: " + sal + "\nBonus Anual : " + bonusAnual ;
        }else{
            bonusAnual = 3000;
            return toString() + "\nSalario: " + sal + "\nBonus Anual : " + bonusAnual ;
        }
    }

    @Override
    public String trabalhar() {
        return "\nO Gerente " + getNome() + " chegou no trabalho e começou a cordenar a equipe.";
    }

    @Override
    public String relatarProgresso() {
        return "\nO Gerente " + getNome() + " relatou o progresso para o CEO";
    }

    @Override
    public String toString() {

        return super.toString() + "\nBonus Anual: " + bonusAnual + "\nEquipe : " + equipe;
    }
}
