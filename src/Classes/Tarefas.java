package Classes;

import Esqueletos.GerenciadorDeTarefasEsqueleto;

public abstract class Tarefas implements GerenciadorDeTarefasEsqueleto{
    
    private String nomeTarefa;
    private boolean statusTarefa;
    private String descricao;

    public void Tarefa(String titulo, boolean status, String descricao){

        this.setNomeTarefa(titulo);
        this.setStatusTarefa(status = false);
        this.setDescricao(descricao);

    }

    public abstract void editarTarefa();

    











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
