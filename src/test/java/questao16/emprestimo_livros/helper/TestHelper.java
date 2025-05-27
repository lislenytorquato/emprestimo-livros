package questao16.emprestimo_livros.helper;

import questao16.emprestimo_livros.model.Emprestimo;
import questao16.emprestimo_livros.model.Livro;
import questao16.emprestimo_livros.model.Pessoa;

import java.time.LocalDate;
import java.util.List;

public class TestHelper {

    public final static Long ID_1 = 1L;
    public final static Long ID_2 = 2L;
    public final static String TITULO_1 = "Titulo do livro";

    public final static String AUTOR_1 = "Marta Santos";

    public final static String TITULO_2 = "Outro Titulo do Livro";

    public final static String AUTOR_2 = "Jonas Paulo";

    public final static String NOME_1 = "João Soares";

    public final static String NOME_2 = "Maria Silva";

    public final static LocalDate DATA_VENC1 = LocalDate.of(2025,5,20);

    public final static LocalDate  DATA_VENC2 = LocalDate.of(2025,5,30);

    public static Pessoa criarPessoa1(){
        return new Pessoa(ID_1,NOME_1);
    }

    public static Pessoa criarPessoa2(){
        return new Pessoa(ID_2, NOME_2);
    }
    public static Livro criarLivro1(){
        return new Livro(ID_1, TITULO_1,AUTOR_1);
    }
    public static Livro criarLivro2(){
        return new Livro(ID_2,TITULO_1, AUTOR_2);
    }
    public static Emprestimo criarEmprestimo1(){
        Livro livro1 = criarLivro1();
        Pessoa pessoa1 = criarPessoa1();
        return new Emprestimo(ID_1, livro1,pessoa1,DATA_VENC1);
    }
    public static Emprestimo criarEmprestimo2(){
        Livro livro2 = criarLivro2();
        Pessoa pessoa2 = criarPessoa2();
        return new Emprestimo(ID_1, livro2,pessoa2,DATA_VENC2);
    }
}
