import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void retornarNomeProfessor() {
        Professor professor = new Professor();
        professor.setNome("Marco Araujo");
        assertEquals("Marco Araujo", professor.getNome());
    }

    @Test
    void retornarTituloProfessor() {
        Professor professor = new Professor();
        professor.setNome("Doutor em computação");
        assertEquals("Doutor em computação", professor.getNome());
    }
}