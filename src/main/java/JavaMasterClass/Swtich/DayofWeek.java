package JavaMasterClass.Swtich;

public class DayofWeek {
    public static void main(String[] args) {
      DayoftheWeek(-1);
      DayoftheWeek(2);
      DayoftheWeek(3);
      DayoftheWeek1(5);
    }

    public static void DayoftheWeek(int day){

        //int Day= 1;

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;


            case 4:
                System.out.println("Wensday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }


    }

    public static void DayoftheWeek1(int  DayTo){

        //int DayTo = 7;

        if (DayTo==1){
            System.out.println(" Its Monday");
        }else if (DayTo==2){
            System.out.println("Its tuesday");
        }else if (DayTo==3){
            System.out.println("Its a Wensday");
        }else if (DayTo==4){
            System.out.println("Its a thrusday");
        }else if (DayTo==5){
            System.out.println("tgif its friday");
        }else if (DayTo==6){
            System.out.println(" Satruday cartoons! ");
        }else if (DayTo==7){
            System.out.println("Sunday funday");
        }else{
            System.out.println("No day no way ");
        }

    }
}
