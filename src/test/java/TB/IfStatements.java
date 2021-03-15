package TB;

public class IfStatements {


    public static void main(String[] args) {

        boolean gameOver = false;
        int score = 5;
        int levelCompleted = 3;
        int bonus = 20;


        if (gameOver){
            System.out.println("your final score is " + (score*levelCompleted +bonus));
        } else if (!gameOver){
            System.out.println("Game isn't over, your score is " + bonus);
        }


    }


}
