package questao16.emprestimo_livros.service;

import questao16.emprestimo_livros.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {
    List<Pessoa> pessoas = new ArrayList<>();

    public void criarPessoas(Pessoa pessoaNova){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(pessoaNova.getId());
        pessoa.setNome(pessoaNova.getNome());
        pessoas.add(pessoa);
    }
    public void deletarPessoas(Pessoa pessoaASerDeletada){
        pessoas.remove(pessoaASerDeletada);
    }
    public List<Pessoa> listarPessoas(){
        return pessoas;
    }

}
