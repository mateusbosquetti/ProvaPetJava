public class Pessoa {
    private long cpf;
    private String nome;
    private String senha;
    private Pet pet;

    public Pessoa(long cpf, String nome, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }

    public void botaPetParaDormir() {
        pet.dormir();
    }

    public void acordarPet() {
        pet.acordar();
    }

    public void adotarPet(Pet pet) {
        this.pet = pet;
    }

    public void darAguaParaPet() {
        pet.beberAgua();
    }

    public void brincarComPet(Brincadeira brincadeira) {
        pet.brincar(brincadeira);
    }

    public void alimentarPet(Alimento alimento) {
        pet.comer(alimento);
    }

    public void levarPerParaFazerNecessidades() {
        pet.fazerNecessidades();
    }

    public void limparPet() {
        pet.limpar();
    }

    public String avaliarPet() {
        if (pet == null) {
            return "Sem pet";
        }
        return "Pet já adotado!";
    }

    @Override
    public String toString() {
        return "Cpf: " + cpf + "\n" +
                "Nome: " + nome + "\n" +
                "Senha: " + senha + "\n" +
                "Pet: \n" + pet;
    }

    public String getSenha() {
        return senha;
    }

    public long getCpf() {
        return cpf;
    }


}
