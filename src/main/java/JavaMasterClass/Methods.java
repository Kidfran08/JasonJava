package JavaMasterClass;

public class Methods {
    public static void main(String[] args) {
        int highscore = caculateScore(true,800,5,100);
        System.out.println("Your final score was "+ highscore);

        highscore= caculateScore(true,10000,8,200);
        System.out.println("Your final score was "+ highscore);


       int highscorepostion = CalculateHighScorePostion(1500);
       DisplayHighScorePostion("Jake", highscorepostion);

        highscorepostion = CalculateHighScorePostion(900);
        DisplayHighScorePostion("Take", highscorepostion);

        highscorepostion = CalculateHighScorePostion(400);
        DisplayHighScorePostion("kelly", highscorepostion);

        highscorepostion = CalculateHighScorePostion(50);
        DisplayHighScorePostion("Joe", highscorepostion);

        highscorepostion = CalculateHighScorePostion(1000);
        DisplayHighScorePostion("Dicks", highscorepostion);

        highscorepostion = CalculateHighScorePostion(500);
        DisplayHighScorePostion("dol", highscorepostion);

        highscorepostion = CalculateHighScorePostion(100);
        DisplayHighScorePostion("Less", highscorepostion);


    }
    public static int caculateScore(boolean gameover,int score,int levelCompleted,int bonus){

        if (gameover){
            int finalscore = score + (levelCompleted * bonus);
            finalscore +=2000;

            return finalscore;
        }
        return -1;
        }

        public static void DisplayHighScorePostion(String PlayersName,int HighScorePostion){
            System.out.println(PlayersName +" manged to get into postion "
            +HighScorePostion + " on the high score table");

        }
        public static int CalculateHighScorePostion(int playerscore){

//        if (playerscore>=1000){
//           return 1;
//        }else if(playerscore>=500 ){
//            return 2;
//            }else if (playerscore>=100 ){
//            return 3;
//        }else{
//            return 4;

            int postion =4;// assuming postion 4 will be returend
            if (playerscore >=1000){
                postion=1;
            }else if (playerscore>=500){
                postion = 2;
            }else if (playerscore>= 100){
                postion=3;
            }
            return  postion;
        }
}

