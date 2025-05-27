package questao16.emprestimo_livros.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import questao16.emprestimo_livros.helper.TestHelper;
import questao16.emprestimo_livros.model.Emprestimo;

import java.time.Clock;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EmprestimoServiceTest {

    @InjectMocks
    EmprestimoService emprestimoService;

    @Mock
    Clock clock;

    @DisplayName("1- deveria criar um emprestimo")
    @Test
    void deveriaCriarUmEmprestimo() {
        Emprestimo emprestimo1 = TestHelper.criarEmprestimo1();
        Emprestimo emprestimo2 = TestHelper.criarEmprestimo2();

        List<Emprestimo> emprestimosNovos = List.of(emprestimo1, emprestimo2);

        emprestimoService.criarEmprestimo(emprestimo1);
        emprestimoService.criarEmprestimo(emprestimo2);

        assertEquals(2, emprestimoService.listarEmprestimos().size());

        assertEquals(emprestimosNovos.get(0).getId(), emprestimoService.listarEmprestimos().get(0).getId());
        assertEquals(emprestimosNovos.get(0).getPessoa(), emprestimoService.listarEmprestimos().get(0).getPessoa());
        assertEquals(emprestimosNovos.get(0).getLivro(), emprestimoService.listarEmprestimos().get(0).getLivro());
        assertEquals(emprestimosNovos.get(0).getDataVencimento(), emprestimoService.listarEmprestimos().get(0).getDataVencimento());

        assertEquals(emprestimosNovos.get(1).getId(), emprestimoService.listarEmprestimos().get(1).getId());
        assertEquals(emprestimosNovos.get(1).getPessoa(), emprestimoService.listarEmprestimos().get(1).getPessoa());
        assertEquals(emprestimosNovos.get(1).getLivro(), emprestimoService.listarEmprestimos().get(1).getLivro());
        assertEquals(emprestimosNovos.get(1).getDataVencimento(), emprestimoService.listarEmprestimos().get(1).getDataVencimento());

        assertEquals(emprestimosNovos, emprestimoService.listarEmprestimos());


    }

    @DisplayName("2- deveria deletar um emprestimo")
    @Test
    void deveriaDeletarUmEmprestimo() {
        Emprestimo emprestimo1 = TestHelper.criarEmprestimo1();
        Emprestimo emprestimo2 = TestHelper.criarEmprestimo2();

        List<Emprestimo> emprestimosNovos = List.of(emprestimo1, emprestimo2);

        emprestimoService.criarEmprestimo(emprestimo1);
        emprestimoService.criarEmprestimo(emprestimo2);

        emprestimoService.deletarEmprestimo(emprestimo1);
        emprestimoService.deletarEmprestimo(emprestimo2);

        assertEquals(0, emprestimoService.listarEmprestimos().size());

    }

    @DisplayName("3- deveria retornar emprestimos atrasados")
    @Test
    void deveriaRetornarEmprestimosAtrasados() {
        Emprestimo emprestimo1 = TestHelper.criarEmprestimo1();
        Emprestimo emprestimo2 = TestHelper.criarEmprestimo2();

        List<Emprestimo> emprestimosNovos = List.of(emprestimo1, emprestimo2);

        emprestimoService.criarEmprestimo(emprestimo1);
        emprestimoService.criarEmprestimo(emprestimo2);

        LocalDate data = LocalDate.of(2025,5,26);
        assertEquals(1,emprestimoService.listarEmprestimosAtrasados(data).size());
        assertEquals(emprestimo1.getId(),emprestimoService.listarEmprestimosAtrasados(data).get(0).getId());

        }

}
