public class Aluno extends Pessoa{
    private float nota1;
    private float nota2;
    private String matricula;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public String getMatricula() {
        return matricula;
    }

    public String setMatricula(String matricula) {
        return this.matricula = matricula;
    }

    public boolean verificarAprovacaoAluno(){
        float media = (this.nota1 + this.nota2)/2;
        if(media >= 5.0){
            return true;
        }
        else{
            return false;
        }
    }
}
