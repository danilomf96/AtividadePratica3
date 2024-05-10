public class Sistema {

    public static void menu() {
        System.out.println("\n----------Empresa Desenvolvimento GDC----------");
        System.out.println("1. Cadastrar Gerente");
        System.out.println("2. Cadastrar Desenvolvedor");
        System.out.println("3. Cadastrar Estagiário");
        System.out.println("4. Listar Funcionários");
        System.out.println("5. Excluir Funcionário");
        System.out.println("6. Registrar Entrada/Saída de Funcionário");
        System.out.println("7. Atualizar Progresso de Trabalho");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção:");
    }
    
    private static void verificarOP(int op) {
        switch (op) {
            case 1:
                cadastrarGerente();
                break;
            case 2:
                cadastrarDesenvolvedor();
                break;
            case 3:
                cadastrarEstagiario();
                break;
            case 4:
                listarFuncionario();
                break;
            case 5:
                excluirFuncionario();
                break;
            case 6:
                baterPonto();
                break;
            case 7:
                atualizarTrab();
                break;
            case 0:
                System.out.println("----Programa finalizado----");
                break;
            default:
                System.out.println("Opção Invalida... \nTecle novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            menu();
            op = Console.lerInt();
            verificarOP(op);
        } while (op != 0);
    }

    private static void cadastrarGerente() {
        System.out.println("\nCadastro de Gerente:");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Matrícula: ");
        String matricula = Console.lerString();
        System.out.println("Equipe: ");
        int equipe = Console.lerInt();


        Gerente gerente = new Gerente(nome, matricula, equipe);
        Cadastro.cadastrar(gerente);

        System.out.println("Gerente cadastrado com sucesso.");
    }

    private static void cadastrarDesenvolvedor() {
        System.out.println("\nCadastro de Desenvolvedor:");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Matrícula: ");
        String matricula = Console.lerString();
        System.out.println("Linguagens de Programação: ");
        String linguagens = Console.lerString();
        System.out.println("Repositório: ");
        String repositorio = Console.lerString();

        Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matricula, linguagens, repositorio);
        Cadastro.cadastrar(desenvolvedor);

        System.out.println("Desenvolvedor cadastrado com sucesso.");
    }

    private static void cadastrarEstagiario() {
        System.out.println("\nCadastro de Estagiário:");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Matrícula: ");
        String matricula = Console.lerString();
        System.out.println("Supervisor: ");
        String supervisor = Console.lerString();
        System.out.println("Horas de Trabalho: ");
        int horasTrabalho = Console.lerInt();

        Estagiario estagiario = new Estagiario(nome, matricula, supervisor, horasTrabalho);
        Cadastro.cadastrar(estagiario);

        System.out.println("Estagiário cadastrado com sucesso.");
    }

    private static void listarFuncionario() {
        System.out.println("\nTodos os Funcionarios Cadastrados : ");
        if (Cadastro.getListaFuncionario().size() == 0) {
            System.out.println("Nao há Funcionarios cadastrados.");
            return;
        }
        for (Funcionario funcionario : Cadastro.getListaFuncionario()) {
            System.out.println("\n" + funcionario.toString());
        }
    }

    private static void excluirFuncionario() {
        System.out.println("\nInforme a Matrícula do funcionário que deseja excluir: ");
        String matricula = Console.lerString();
        Funcionario funcionario = Cadastro.buscar(matricula);
        if (funcionario == null) {
            System.out.println("\nFuncionário com a Matrícula " + matricula + " não encontrado.");
            return;
        }
        Cadastro.excluir(funcionario);
        System.out.println("\nFuncionário removido com sucesso.");
    }

    private static void atualizarTrab() {
        System.out.println("\nInforme a Matrícula do funcionário que deseja atualizar: ");
        String matricula = Console.lerString();
        Funcionario funcionario = Cadastro.buscar(matricula);
        if (funcionario == null) {
            System.out.println("\nFuncionário com a Matrícula " + matricula + " não encontrado.");
            return;
        }
        System.out.println(funcionario.relatarProgresso());
        System.out.println("\nProgresso atualizado.");
    }

    private static void baterPonto() {
        System.out.println("\nInforme a Matrícula do funcionário que chegou: ");
        String matricula = Console.lerString();
        Funcionario funcionario = Cadastro.buscar(matricula);
        if (funcionario == null) {
            System.out.println("\nFuncionário com a Matrícula " + matricula + " não encontrado.");
            return;
        }
        System.out.println(funcionario.trabalhar());
    }
}
