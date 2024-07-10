public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Pet pet = new Pet(1, "PetTeste", true, true, 50, 50, 50, 50, 50, 50);
        banco.cadastrarPet(pet);

        Pessoa pessoa = new Pessoa(1234567, "Mateus", "123");
        banco.cadastrarPessoa(pessoa);
        pessoa.adotarPet(pet);

        Brincadeira brincadeira = new Brincadeira("Correr", 10, 25, 25, 25, 25);
        banco.cadastrarBrincadeira(brincadeira);

        Alimento alimento = new Alimento("Racao", 20);
        banco.cadastrarAlimento(alimento);

        System.out.println("\nListando os primeiros valores criados");
        System.out.println("Pessoa");
        System.out.println(pessoa.toString());
        System.out.println("Brincadeira");
        System.out.println(brincadeira.toString());
        System.out.println("Alimento");
        System.out.println(alimento.toString());
        System.out.println("Pet");
        System.out.println(pet.toString());

        System.out.println("\n---TESTES CLASSE PESSOA COM O PET---\n");

        System.out.println("\nAntes de qualquer método");
        System.out.println(pet.toString());

        System.out.println("\nBotar para dormir");
        pessoa.botaPetParaDormir();
        System.out.println(pet.toString());

        System.out.println("\nAcordar");
        pessoa.acordarPet();
        System.out.println(pet.toString());

        System.out.println("\nAlimentar");
        pessoa.alimentarPet(alimento);
        System.out.println(pet.toString());

        System.out.println("\nAvaliar Pet");
        System.out.println(pessoa.avaliarPet());

        System.out.println("\nBrincar com o pet");
        pessoa.brincarComPet(brincadeira);
        System.out.println(pet.toString());

        System.out.println("\nDar agua");
        pessoa.darAguaParaPet();
        System.out.println(pet.toString());

        System.out.println("\nFazer necessidade");
        pessoa.levarPerParaFazerNecessidades();
        System.out.println(pet.toString());

        System.out.println("\nLimpar Pet");
        pessoa.limparPet();
        System.out.println(pet.toString());

        pet.morrer();


        System.out.println("\n---TESTES CLASSE BANCO---");
        Pet pet2 = new Pet(2, "PetTeste2", true, false, 10, 10, 10, 10, 10, 10);
        banco.cadastrarPet(pet2);

        Pessoa pessoa2 = new Pessoa(987654232, "PessoaTeste2", "2712");
        banco.cadastrarPessoa(pessoa2);

        Alimento alimento2 = new Alimento(123, "Carne", 50);
        banco.cadastrarAlimento(alimento2);

        Brincadeira brincadeira2 = new Brincadeira(876, "Esconde Esconde", 20, 20, 20, 20, 20);
        banco.cadastrarBrincadeira(brincadeira2);
        System.out.println("\n---Get Alimentos---");
        banco.getAlimentos();

        System.out.println("\n---Get Pets---");
        banco.getPets();

        System.out.println("\n---Get Brincadeiras---");
        banco.getBrincadeiras();

        System.out.println("\n---Get Pessoas---");
        banco.getPessoas();

        System.out.println("\nVendo se a pesso2 tem pet (Não tem)");
        System.out.println(pessoa2.avaliarPet());

        banco.removerPessoa(pessoa2);

        banco.removerPet(pet2);

        System.out.println("\n---Get Pets após removação---");
        banco.getPets();

        System.out.println("\n---Procurar Alimentos---");
        System.out.println(banco.procurarAlimento(123));

        System.out.println("\n---Procurar Pessoa---");
        System.out.println(banco.procurarPessoa(1234567));

        System.out.println("\n---Procurar Brincadeira---");
        System.out.println(banco.procurarBrincadeira(876));

        System.out.println("\n---Procurar Pet---");
        System.out.println(banco.procurarPet(1));

        System.out.println("\n---Procurar Pet Inexistente (simulei o erro)---");
        System.out.println(banco.procurarPet(2));

        System.out.println("\n---Login puxando todas as informações do Usuário---");
        System.out.println(banco.login(1234567, "123"));

        System.out.println("\n---Login inexistente (simulei o erro)---");
        System.out.println(banco.login(13, "123"));
    }
}
