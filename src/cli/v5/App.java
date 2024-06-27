package cli.v5;

import cli.v3.command.Command;
import cli.v4.ui.Menu;

public abstract class App {
    Menu menu;

    public App() {}

    public void init(int menuSize) {
        menu = new Menu(menuSize);
        createMenu(menu);
    }

    public void createMenu(Menu menu) {
    }

    public void run() {
        // init(5); 제거
        while (true) {
            menu.printMenu();
            Command command = menu.getSeclet();
            command.execute();
        }
    }
}
