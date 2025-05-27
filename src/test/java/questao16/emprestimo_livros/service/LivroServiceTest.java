package questao16.emprestimo_livros.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import questao16.emprestimo_livros.helper.TestHelper;
import questao16.emprestimo_livros.model.Livro;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class LivroServiceTest {

    @InjectMocks
    LivroService livroService;

    @DisplayName("1- deveria criar livro")
    @Test
    void deveriaCriarLivro(){
        Livro livroNovo = TestHelper.criarLivro1();
        List<Livro> livrosNovos = List.of(livroNovo);
        livroService.criarLivros(livroNovo);
        Assertions.assertEquals(livrosNovos, livroService.listarLivros());
    }

    @DisplayName("2- deveria deletar livro")
    @Test
    void deveriaDeletarLivro(){
        Livro livroNovo = TestHelper.criarLivro1();
        livroService.criarLivros(livroNovo);
        livroService.deletarLivros(livroNovo);
        Assertions.assertEquals(0,livroService.listarLivros().size());
    }

}
