import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Funcionario> listaFuncionario = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionario.add(funcionario);
    }

    public static List<Funcionario> getFuncionario() {
        return listaFuncionario;
    }

    public static void setListaFuncionario(List<Funcionario> listaFuncionario) {
        Cadastro.listaFuncionario = listaFuncionario;
    }

    public static Funcionario buscar(String matricula) {
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getMatricula() == matricula) {
                return funcionario;
            }
        }
        return null;
    }

    public static void excluir(Funcionario funcionario) {
        listaFuncionario.remove(funcionario);
    }
}