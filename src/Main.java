//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PessoaBuilder pessoaBuilder=new PessoaConcretBuilder();
        Pessoa pessoa=pessoaBuilder
                .definirNome("Junior")
                .definirCpf("123456789")
                .definirRg("2122322")
                .definirEmail("jijunior@gmail.com")
                .definirIdade("35")
                .definirTelefone("83981948227")
                .criarIndividuo();
        System.out.println("Pessoa: "+pessoa);


    }
}