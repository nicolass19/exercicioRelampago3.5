import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void retornarNomeAlunoEnsinoMedio() {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNome("Nicolas Moraes");
        assertEquals("Nicolas Moraes", alunoEnsinoMedio.getNome());
    }

    @Test
    void retornarMatricula() {
        Aluno aluno = new Aluno();
        aluno.setMatricula("20208548");
        assertEquals("20208548",aluno.getMatricula());
    }

    @Test
    void verificarAprovacaoAlunoEnsinoMedio() {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio.setNota1(8.0f);
        alunoEnsinoMedio.setNota2(9.0f);
        assertEquals(true, alunoEnsinoMedio.verificarAprovacaoAlunoEnsinoMedio());
    }
}