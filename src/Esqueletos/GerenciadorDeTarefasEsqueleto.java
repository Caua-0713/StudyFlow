package Esqueletos;

import Classes.Tarefas;

public interface GerenciadorDeTarefasEsqueleto {
    
    public void adicionarTarefa(Tarefas t);
    public void editarTarefa(Tarefas t);
    public void excluirTarefa(Tarefas t);
    public void listarTarefas();
    public void historicotarefas();


}
