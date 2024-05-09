public class Desenvolvedor extends Funcionario {
    private String linguagens;

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String matricula, String linguagens) {
        super(nome, matricula);
        this.linguagens = linguagens;
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
        return super.toString() + "\nLinguagens de Programação: " + linguagens;
    }
}
