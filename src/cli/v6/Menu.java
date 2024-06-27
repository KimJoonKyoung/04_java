package cli.v6;

import cli.v2.Input;
import cli.v3.command.Command;
import cli.v4.ui.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menus;

    public Menu() {
        menus = new ArrayList<>();
    }

    public void add(MenuItem item) {
        menus.add(item);
    }

    public void printMenu() {
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<menus.size();i++) {
            System.out.printf("%d.%s |", i+1, menus.get(i).getTitle());
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
        // 올바른 범위 인지 체크
        return menus.get(selectNo-1).getCommand();
    }
}
