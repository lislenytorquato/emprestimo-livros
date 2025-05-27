package questao16.emprestimo_livros.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import questao16.emprestimo_livros.helper.TestHelper;
import questao16.emprestimo_livros.model.Pessoa;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {

    @InjectMocks
    PessoaService pessoaService;

    @DisplayName("1- deveria criar pessoa")
    @Test
    void deveriaCriarPessoa(){
        Pessoa pessoaNova = TestHelper.criarPessoa1();
        List<Pessoa> pessoasNovas = List.of(pessoaNova);
        pessoaService.criarPessoas(pessoaNova);

        Assertions.assertEquals(1, pessoaService.listarPessoas().size());
        Assertions.assertEquals(pessoaNova.getNome(),pessoaService.listarPessoas().get(0).getNome());
        Assertions.assertEquals(pessoasNovas, pessoaService.listarPessoas());
    }

    @DisplayName("2- deveria deletar pessoa")
    @Test
    void deveriaDeletarPessoa(){
        Pessoa pessoa = TestHelper.criarPessoa1();
        pessoaService.criarPessoas(pessoa);
        pessoaService.deletarPessoas(pessoa);

        Assertions.assertEquals(0,pessoaService.listarPessoas().size());
    }

}
