import Classes.Tarefas;
import Classes.ControleTarefas;
import Classes.Usuario;
import Classes.MenuUsuario;

public class App {
    public static void main(String[] args) throws Exception {

        MenuUsuario menu = new MenuUsuario();
        Usuario user = menu.menuCadastro();
        menu.menuPrincipal(user);
    }
}
