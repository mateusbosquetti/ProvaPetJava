public class Pet {
    private static int geradorCodigo;
    private String nome;
    private boolean vivo, acordado;
    private int codigo, sede, fome, energia, diversao, higiene, vontadeBanheiro;

    
    public Pet(String nome) {
        this.nome = nome;
    }

    public void beberAgua() {
        sede += 50;
        vontadeBanheiro -= 25;
        if (vontadeBanheiro <= 0) {
            higiene = 0;
            vontadeBanheiro = 100;
        }
        metodoLimitador();
    }

    public void comer(Alimento alimento) {
        fome += alimento.getNutricao();
        vontadeBanheiro -= (alimento.getNutricao() / 2);
        if (vontadeBanheiro == 0) {
            higiene = 0;
            vontadeBanheiro = 100;
        }
        metodoLimitador();
    }

    public void dormir() {
        energia += 25;
        acordado = false;
        metodoLimitador();
    }

    public void acordar() {
        energia += 25;
        acordado = true;
        metodoLimitador();
    }

    public void brincar(Brincadeira brincadeira) {
        diversao += brincadeira.getDivertimento();
        energia -= brincadeira.getCansaco();
        fome -= brincadeira.getFome();
        sede -= brincadeira.getSede();
        higiene -= brincadeira.getSujeira();
        metodoLimitador();
    }

    public void limpar() {
        higiene = 100;
        metodoLimitador();
    }

    public void fazerNecessidades() {
        vontadeBanheiro = 100;
        higiene -= 25;
        metodoLimitador();
    }

    public void morrer() {
        if (sede == 0 && fome == 0 && energia == 0) {
            System.out.println("Animal faleceu");
            vivo = false;
        } else {
            System.out.println("Animal está vivo");
            vivo = true;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Vivo: " + vivo + "\n" +
                "Acordado=" + acordado + "\n" +
                "Sede=" + sede + "\n" +
                "Fome=" + fome + "\n" +
                "Energia=" + energia + "\n" +
                "Diversão=" + diversao + "\n" +
                "Higiene=" + higiene + "\n" +
                "Vontade de ir ao Banheiro=" + vontadeBanheiro + "\n";
    }

    //Getter extra pro método procurar pet la no banco
    public int getCodigo() {
        return codigo;
    }

    //Construtor extra pra facilitar nos arraylist
    public Pet(int codigo, String nome, boolean vivo, boolean acordado, int sede, int fome, int energia, int diversao, int higiene, int vontadeBanheiro) {
        this.codigo = codigo;
        this.nome = nome;
        this.vivo = vivo;
        this.acordado = acordado;
        this.sede = sede;
        this.fome = fome;
        this.energia = energia;
        this.diversao = diversao;
        this.higiene = higiene;
        this.vontadeBanheiro = vontadeBanheiro;
    }

    //Método que vai deixar tudo mais facil, vou por em todos os métodos dai vou poupar linhas de codigo, essa classe verifica se passa de 100 ou é abaixo de 0, dai vai limitar
    public void metodoLimitador() {
        if (sede > 100) {
            sede = 100;
        } else if (sede < 0) {
            sede = 0;
        }

        if (fome > 100) {
            fome = 100;
        } else if (fome < 0) {
            fome = 0;
        }

        if (energia > 100) {
            energia = 100;
        } else if (energia < 0) {
            energia = 0;
        }

        if (diversao > 100) {
            diversao = 100;
        } else if (diversao < 0) {
            diversao = 0;
        }

        if (higiene > 100) {
            higiene = 100;
        } else if (higiene < 0) {
            higiene = 0;
        }

        if (vontadeBanheiro > 100) {
            vontadeBanheiro = 100;
        } else if (vontadeBanheiro < 0) {
            vontadeBanheiro = 0;
        }

    }
}
