public class AlunoGraduacao extends Aluno{

    public boolean verificarAprovacaoAlunoGraduacao(){
        float media = (getNota1()+getNota2())/2;
        if(media >= 7.0){
            return true;
        }
        else{
            return false;
        }
    }

}
