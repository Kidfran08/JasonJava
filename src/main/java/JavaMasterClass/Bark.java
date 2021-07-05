package JavaMasterClass;

public class Bark {
    public static void main(String[] args) {
     boolean wokeup=shouldWakeUp(true,1);
     boolean wake1=shouldWakeUp(false,2);
        System.out.println(wake1);
    }

    public static boolean shouldWakeUp(boolean barking,int hourofDay){
      if (hourofDay<0 || hourofDay>23){
          return false;
      }else if (barking &&(hourofDay<=7 || hourofDay>=23)){
          return true;
      }else{

      }
      return false;
    }
}
