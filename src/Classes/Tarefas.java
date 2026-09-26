package Classes;

public class Tarefas {

    private String nomeTarefa;
    private Boolean statusTarefa;
    private String descricao;

    public Tarefas(String titulo, String descricao) {
        this.setNomeTarefa(titulo);
        this.statusTarefa = false;
        this.setDescricao(descricao);
    }

    // getters e setters

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setStatusTarefa(Boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public Boolean getStatusTarefa() {
        return statusTarefa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}