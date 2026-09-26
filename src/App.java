import Classes.Tarefas;
import Classes.ControleTarefas;
public class App {
    public static void main(String[] args) throws Exception {
        
    ControleTarefas controle = new ControleTarefas();
Tarefas t1 = new Tarefas("Estudar", "Rever conteúdo em Java");
controle.adicionarTarefa(t1);


controle.listarTarefas();


    }
}
