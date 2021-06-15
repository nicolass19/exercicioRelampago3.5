public class AlunoEnsinoMedio extends Aluno{

    public boolean verificarAprovacaoAlunoEnsinoMedio(){
        float media = (getNota1()+getNota2())/2;
        if(media >= 6.0){
            return true;
        }
        else{
            return false;
        }
    }

}
