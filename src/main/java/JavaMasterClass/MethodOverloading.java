package JavaMasterClass;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore(" Tim ", 500);
        System.out.println(" New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double cac = calcFeetAndInchesToCentimeters(6,-13);
        if (cac<0.0) {
            System.out.println("invalid P");
        }
        calcFeetAndInchesToCentimeters(157);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player" + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("unamed player scored  " + score + " points");
        return score * 1000;


    }

    public static int calculateScore() {
        System.out.println("no name player score ");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invaid feet or inches ");
            return -1;
        }

        double Centimenters = (feet * 12) * 2.54;
        Centimenters += inches * 2.54;
        System.out.println(feet + " feet," + inches + " inches = " + Centimenters + " cm");
        return Centimenters;


    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches<0){
            return -1;
        }
        double feet = (int) inches /12;
        double remaininches= (int) inches % 12;
        System.out.println(inches + " inches" +feet+"feet"+remaininches);
        return calcFeetAndInchesToCentimeters(feet,remaininches);

  }
}

