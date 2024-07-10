import java.util.ArrayList;

public class Banco {
    static ArrayList<Alimento> alimentos = new ArrayList<>();
    static ArrayList<Brincadeira> brincadeiras = new ArrayList<>();
    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPet(Pet pet) {
        pets.add(pet);
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPet(Pet pet) {
        pets.remove(pet);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public Alimento procurarAlimento(int codigo) {
        for (Alimento alimento : alimentos) {
            if (codigo == alimento.getCodigo()) {
                return alimento;
            }
        }
        return null;
    }

    public Brincadeira procurarBrincadeira(int codigo) {
        for (Brincadeira brincadeira : brincadeiras) {
            if (codigo == brincadeira.getCodigo()) {
                return brincadeira;
            }
        }
        return null;
    }

    public Pet procurarPet(int codigo) {
        for (Pet pet : pets) {
            if (codigo == pet.getCodigo()) {
                return pet;
            }
        }
        return null;
    }

    public Pessoa procurarPessoa(long cpf) {
        for (Pessoa pessoa : pessoas) {
            if (cpf == pessoa.getCpf()) {
                return pessoa;
            }
        }
        return null;
    }

    public void getAlimentos() {
        for (Alimento alimento : alimentos) {
            System.out.println(alimento.toString());
        }
    }

    public void getBrincadeiras() {
        for (Brincadeira brincadeira : brincadeiras) {
            System.out.println(brincadeira.toString());
        }
    }

    public void getPets() {
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }

    public void getPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }

    public Pessoa login(long cpf, String senha) {
        for (Pessoa pessoa : pessoas) {
            if (cpf == pessoa.getCpf() && senha.equals(pessoa.getSenha())) {
                return pessoa;
            }
        }
        return null;
    }

    //Classe extra pra facilitar adição nos arraylist
    public void cadastrarAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    //Classe extra pra facilitar adição nos arraylist
    public void cadastrarBrincadeira(Brincadeira brincadeira) {
        brincadeiras.add(brincadeira);
    }
}
