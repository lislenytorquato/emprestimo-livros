package questao16.emprestimo_livros.model;

import java.time.LocalDate;
import java.util.Objects;

public class Emprestimo {
   private Long id;
   private Livro livro;
   private Pessoa pessoa;
   private LocalDate dataVencimento;

    public Emprestimo() {
    }

    public Emprestimo(Long id, Livro livro, Pessoa pessoa, LocalDate dataVencimento) {
        this.id = id;
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataVencimento = dataVencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(id, that.id) && Objects.equals(livro, that.livro) && Objects.equals(pessoa, that.pessoa) && Objects.equals(dataVencimento, that.dataVencimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, livro, pessoa, dataVencimento);
    }
}
