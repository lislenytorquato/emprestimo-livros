package questao16.emprestimo_livros.service;

import questao16.emprestimo_livros.model.Emprestimo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoService {

    List<Emprestimo> emprestimos = new ArrayList<>();
    List<Emprestimo> emprestimosAtrasados = new ArrayList<>();

    public void criarEmprestimo(Emprestimo emprestimoNovo){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(emprestimoNovo.getId());
        emprestimo.setPessoa(emprestimoNovo.getPessoa());
        emprestimo.setLivro(emprestimoNovo.getLivro());
        emprestimo.setDataVencimento(emprestimo.getDataVencimento());
        emprestimos.add(emprestimo);
    }
    public void deletarEmprestimo(Emprestimo emprestimoASerDeletado){
        emprestimos.remove(emprestimoASerDeletado);
    }
    public List<Emprestimo> listarEmprestimos(){
        return emprestimos;
    }
    public List<Emprestimo> listarEmprestimosAtrasados(){
        emprestimos.forEach(emprestimo -> {
            if (LocalDate.now().isAfter(emprestimo.getDataVencimento())){
                emprestimosAtrasados.add(emprestimo);
            }
        });
        return emprestimosAtrasados;
    }
}
