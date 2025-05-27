package questao16.emprestimo_livros.service;

import questao16.emprestimo_livros.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroService {

   private List<Livro> livros = new ArrayList<>();

    public void criarLivros(Livro livroNovo){
        Livro livro = new Livro();
        livro.setId(livroNovo.getId());
        livro.setTitulo(livroNovo.getTitulo());
        livro.setAutor(livroNovo.getAutor());
        livros.add(livro);
    }
    public void deletarLivros(Livro livroASerDeletado){
        livros.remove(livroASerDeletado);
    }
    public List<Livro> listarLivros(){
        return livros;
    }
}
