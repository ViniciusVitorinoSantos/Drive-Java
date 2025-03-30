import java.util.*;

// Classe Livro
class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}

// Classe Usuario
class Usuario {
    private String nome;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }
}

// Classe Biblioteca
class Biblioteca {
    private List<Livro> catalogo;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Livro> getCatalogo() {
        return catalogo;
    }

    public void emprestarLivro(String isbn, String cpf) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorCpf(cpf);

        if (livro != null && usuario != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
            usuario.emprestarLivro(livro);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }

    public void devolverLivro(String isbn, String cpf) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorCpf(cpf);

        if (livro != null && usuario != null && usuario.getLivrosEmprestados().contains(livro)) {
            livro.setDisponivel(true);
            usuario.devolverLivro(livro);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a devolução.");
        }
    }

    private Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorCpf(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    public void exibirCatalogo() {
        for (Livro livro : catalogo) {
            System.out.println(livro);
        }
    }

    public void exibirUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar alguns livros e usuários iniciais
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "12345"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", "67890"));

        biblioteca.cadastrarUsuario(new Usuario("Vinícius", "111.222.333-44"));
        biblioteca.cadastrarUsuario(new Usuario("Hannah", "555.666.777-88"));

        int opcao;

        do {
            System.out.println("\nSistema de Biblioteca Digital");
            System.out.println("1. Ver catálogo de livros");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Ver usuários cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.println("\nCatálogo de livros:");
                    biblioteca.exibirCatalogo();
                    break;
                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    String cpf = scanner.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(nome, cpf));
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o ISBN do livro a ser emprestado: ");
                    String isbnEmprestimo = scanner.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    String cpfEmprestimo = scanner.nextLine();
                    biblioteca.emprestarLivro(isbnEmprestimo, cpfEmprestimo);
                    break;
                case 4:
                    System.out.print("Digite o ISBN do livro a ser devolvido: ");
                    String isbnDevolucao = scanner.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    String cpfDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(isbnDevolucao, cpfDevolucao);
                    break;
                case 5:
                    System.out.println("\nUsuários cadastrados:");
                    biblioteca.exibirUsuarios();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
