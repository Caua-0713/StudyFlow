package Esqueletos;
import java.util.ArrayList;

//classe abstrata para os métodos da classe tarefas que vai ser implementada a frente
public abstract class TarefasAbstract implements GerenciadorDeTarefasEsqueleto{
    
    private String nomeTarefa;
    private boolean statusTarefa;
    private String descricao;

    

    public TarefasAbstract(String titulo, boolean status, String descricao){

        this.setNomeTarefa(titulo);
        this.setStatusTarefa(status = false);
        this.setDescricao(descricao);


    }

     public void adicionarTarefa(){


     }




    public void editarTarefa(){


    }


    
    public void excluirTarefa(){


    }




//getts e setts

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public boolean isStatusTarefa() {
        return statusTarefa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
