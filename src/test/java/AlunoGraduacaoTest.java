import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {


    @Test
    void retornarNomeAlunoGraduacao() {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNome("Nicolas Moraes");
        assertEquals("Nicolas Moraes", alunoGraduacao.getNome());
    }

    @Test
    void retornarMatricula() {
        Aluno aluno = new Aluno();
        aluno.setMatricula("20208548");
        assertEquals("20208548",aluno.getMatricula());
    }

    @Test
    void verificarAprovacaoAlunoGraduacao() {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao.setNota1(3.0f);
        alunoGraduacao.setNota2((5.0f));
        assertEquals(false, alunoGraduacao.verificarAprovacaoAlunoGraduacao());
    }
}