package cli.v2;

public class App {
    int studentNum = 0;
    int[] scores = null;

    Menu menu;

    public App() {
        menu = new Menu();
    }

    private void analize() {
        int max = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            max = (max < scores[i]) ? scores[i] : max;
            sum += scores[i];
        }
        avg = (double) sum / studentNum;
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }

    public void getStudentNum() {
        studentNum = Input.getInt("학생수> ");
        scores = new int[studentNum];
    }

    public void getScores() {
        for(int i = 0; i < scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }

    public void printScore(){
        for(int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]> " + scores[i]);
        }
    }

    public void exit() {
        run();
    }

    public void excuteCommand(int selectNo) {
        if(selectNo == 1) {
            getStudentNum();
        } else if(selectNo == 2) {
            getScores();
        } else if(selectNo == 3) {
            printScore();
        } else if(selectNo == 4) {
            analize();
        } else if(selectNo == 5) {
            exit();
        }
    }
    public void run() {
        while(true) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            excuteCommand(selectNo);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
