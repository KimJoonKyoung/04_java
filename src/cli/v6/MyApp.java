package cli.v6;

import cli.v3.command.AnalizeCommand;
import cli.v3.command.GetScoresCommand;
import cli.v3.command.InitScoresCommand;
import cli.v3.command.PrintScoreCommand;
import cli.v4.ui.MenuItem;

public class MyApp extends App{
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);
        menu.add(new MenuItem("학생수", new InitScoresCommand()));
        menu.add(new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(new MenuItem("분석", new AnalizeCommand()));
    }

    public static void main(final String[] args) {
        App app = new MyApp();
        app.run();
    }
}
