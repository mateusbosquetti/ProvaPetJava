public class Alimento {
    private static int geradorCodigo;
    private String nome;
    private int codigo, nutricao;

    public Alimento(String nome, int nutricao) {
        this.nome = nome;
        this.nutricao = nutricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNutricao() {
        return nutricao;
    }

    //Construtor extra pra facilitar nos arraylist e deixar eles mais completos
    public Alimento(int codigo, String nome, int nutricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.nutricao = nutricao;
    }

    //Fiz para listar o arraylist
    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Nutrição: " + nutricao + "\n";
    }
}
