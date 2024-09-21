public class PessoaConcretBuilder implements PessoaBuilder {

    private Pessoa pessoa;

    public PessoaConcretBuilder() {
        this.pessoa = new Pessoa();
    }

    @Override
    public PessoaBuilder definirNome(String nome) {
        this.pessoa.setNome(nome);
        return this;
    }

    @Override
    public PessoaBuilder definirIdade(String idade) {
        this.pessoa.setIdade(idade);
        return this;
    }

    @Override
    public PessoaBuilder definirCpf(String cpf) {
        this.pessoa.setCpf(cpf);
        return this;
    }

    @Override
    public PessoaBuilder definirRg(String rg) {
        return this;
    }



    @Override
    public PessoaBuilder definirEndereco(String endereco) {
        this.pessoa.setEndereco(endereco);
        return this;
    }

    @Override
    public PessoaBuilder definirTelefone(String telefone) {
        this.pessoa.setTelefone(telefone);
        return this;
    }

    @Override
    public PessoaBuilder definirEmail(String email) {
        this.pessoa.setEmail(email);
        return this;
    }

    @Override
    public Pessoa criarIndividuo() {
        return this.pessoa;
    }
}
