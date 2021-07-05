package JavaMasterClass;

public class CodeBlocksAndIfElse {
    public static void main(String[] args) {
        boolean gameover = true;
        int score= 800;
        int levelCompleted=5;
        int bouns=100;

       /* if (score<5000 && score>1000) {
            System.out.println("your score was less then 5000 but greater then 1000");
        }else if(score<1000){
            System.out.println("your score was less then 1000");
        }else{
            System.out.println("got here");
        }*/

        if (gameover){
            int finalscore = score + (levelCompleted * bouns);
            finalscore +=1000;
            System.out.println("Your final score was "+ finalscore);
        }

       score = 10000;
       levelCompleted = 8;
       bouns=200;

       if (gameover){
           int SecondFinalScore = score +(levelCompleted* bouns);
           System.out.println("your final score was "+ SecondFinalScore);
       }



    }
}
