import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void retornarNomeAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Nicolas");
        assertEquals("Nicolas",aluno.getNome());
    }

    @Test
    void retornarMatricula() {
        Aluno aluno = new Aluno();
        aluno.setMatricula("20208548");
        assertEquals("20208548",aluno.getMatricula());
    }

    @Test
    void verificarAprovacaoAluno() {
        Aluno aluno = new Aluno();
        aluno.setNota1(6.0f);
        aluno.setNota2(5.0f);
        assertEquals(true, aluno.verificarAprovacaoAluno());
    }
}