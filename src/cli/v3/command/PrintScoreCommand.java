package cli.v3.command;

import cli.v3.domain.StudentScores;

public class PrintScoreCommand implements Command{
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();

        for (int i=0; i<scores.length; i++) {
            System.out.println("Score[" + i + "]: " + scores[i]);
        }
    }
}
