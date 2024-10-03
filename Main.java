import pessoa.Pessoa;
import pessoa.PessoaFisica;

public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoafisica = new PessoaFisica();

        System.out.println(pessoa.getNome());
        pessoa.setNome("Beatriz");
        System.out.println(pessoa.getNome());

        pessoafisica.setNome("Rafael");
        pessoafisica.setCpf("123.456.789-09");

        System.out.println(pessoafisica.getNome());
        System.out.println(pessoafisica.getCpf());
    }
}