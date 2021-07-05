package JavaMasterClass;

public class LeapYear {
    public static void main(String[] args) {
        boolean check = IsLeapYear(2000);
        System.out.println(check);
    }

    public static boolean IsLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            } else if (year < 1 || year > 9999) {
                return false;
            } else {
                return false;
            }

        }
    return false;
    }

    }


    // public static boolean isLeapYear(int year){
//        if( year>=1 && year<=9999){
//            if( (year %400==0)||(year%100 !=0 && year%4==0))
//                return true;
//        }
//        else
//            return false;
//        return false;
//      }
//   }