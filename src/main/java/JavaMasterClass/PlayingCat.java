package JavaMasterClass;

public class PlayingCat {
    public static void main(String[] args) {
        boolean isthecatplaying= isCatPlaying(true,10);
        System.out.println(isthecatplaying);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer  && (temperature < 25 || temperature >35)){
            return false;
        }else{
            return  summer &&(temperature>=25 && temperature <=45);
            }

        }
        }



