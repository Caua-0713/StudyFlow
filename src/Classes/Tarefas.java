package Classes;

public class Tarefas extends ControleTarefas{
    
    private String nomeTarefa;
    private boolean statusTarefa;
    private String descricao;




    public Tarefas(String titulo, boolean status, String descricao) {
        
        this.setNomeTarefa(titulo);
        statusTarefa = false;
        this.setDescricao(descricao);
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
