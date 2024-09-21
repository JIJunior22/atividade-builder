public interface PessoaBuilder {
    PessoaBuilder definirNome(String nome);

    PessoaBuilder definirIdade(String idade);

    PessoaBuilder definirCpf(String cpf);

    PessoaBuilder definirRg(String rg);

    PessoaBuilder definirEndereco(String endereco);

    PessoaBuilder definirTelefone(String telefone);

    PessoaBuilder definirEmail(String email);

    Pessoa criarIndividuo();


}
