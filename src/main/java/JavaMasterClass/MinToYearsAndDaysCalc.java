package JavaMasterClass;

public class MinToYearsAndDaysCalc {
    public static void main(String[] args) {
        printYearsAndDays(525600);

    }

    public  static void  printYearsAndDays(long minutes){
        if (minutes <0){
            System.out.println("invalid value");
        }else{
            long year = minutes/525600;
            long day = (minutes/525600)/1440;
            System.out.println(minutes+" min = "+year+" y "+day+" d ");
        }


    }
}

/*
1 hour = 60
1 day = 24 hours
1 year = 365
 */