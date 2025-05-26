package questao16.emprestimo_livros.models;

import java.time.LocalDate;
import java.util.Objects;

public class Emprestimo {
   private Livro livro;
   private Pessoa pessoa;
   private LocalDate data_vencimento;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, Pessoa pessoa, LocalDate data_vencimento) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.data_vencimento = data_vencimento;
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

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(livro, that.livro) && Objects.equals(pessoa, that.pessoa) && Objects.equals(data_vencimento, that.data_vencimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro, pessoa, data_vencimento);
    }
}
