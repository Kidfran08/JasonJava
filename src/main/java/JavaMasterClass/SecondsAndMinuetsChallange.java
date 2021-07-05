package JavaMasterClass;

public class SecondsAndMinuetsChallange {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minuets, long seconds){
        if ((minuets<0) || ((seconds <0 )|| (seconds >59))){
           return "invlaid value";


        }
         long hours = minuets/60;
         long remaingMin= minuets%60;
         return hours + " h " + remaingMin+ " M " + seconds+" s ";


    }
    private static  String getDurationString(long seconds){
        if (seconds<0){
            return "invalid value";
        }

        long min = seconds /60;
        long remainsec= seconds%60;

        return getDurationString(min,remainsec);

    }
}
