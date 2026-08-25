package Esqueletos;

import Classes.Tarefas;

public interface GerenciadorDeTarefasEsqueleto {
    
    public void adicionarTarefa(Tarefas t);
    public void editarTarefa(Tarefas t);
    public void excluirTarefa(Tarefas t);
    public void listarTarefas(Tarefas t);
    public void historicoDetarefas(Tarefas t);


}
