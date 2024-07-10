public class Brincadeira {
    private static int geradorCodigo;
    private String nome;
    private int codigo, divertimento, cansaco, fome, sede, sujeira;

    public Brincadeira(String nome, int divertimento, int cansaco, int fome, int sede, int sujeira) {
        this.nome = nome;
        this.divertimento = divertimento;
        this.cansaco = cansaco;
        this.fome = fome;
        this.sede = sede;
        this.sujeira = sujeira;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getDivertimento() {
        return divertimento;
    }

    public int getCansaco() {
        return cansaco;
    }

    public int getFome() {
        return fome;
    }

    public int getSede() {
        return sede;
    }

    public int getSujeira() {
        return sujeira;
    }

    //Construtor extra pra facilitar nos arraylist, e para usar os métodos de procurar precisa do codigo que não tinha no outro construtor
    public Brincadeira(int codigo, String nome, int divertimento, int cansaco, int fome, int sede, int sujeira) {
        this.codigo = codigo;
        this.nome = nome;
        this.divertimento = divertimento;
        this.cansaco = cansaco;
        this.fome = fome;
        this.sede = sede;
        this.sujeira = sujeira;
    }

    //Fiz para listar arraylist
    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Divertimento: " + divertimento + "\n" +
                "Cansaco: " + cansaco + "\n" +
                "Fome: " + fome + "\n" +
                "Sede: " + sede + "\n" +
                "Sujeira: " + sujeira + "\n";
    }
}
