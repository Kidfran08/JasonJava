package JavaMasterClass;

public class TeenNumberCheck {
    public static void main(String[] args) {
        boolean isteen1= hasTeen(22,23,34);
        System.out.println(isteen1);

        boolean wasteen= isTeen(13);
        System.out.println(wasteen);
    }
    public static boolean hasTeen(int num1, int num2,int num3){
        if (num1>=13 && num1<=19 || num2>=13 &&  num2<=19 || num3>=13 && num3<=19 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isTeen(int Number1){
        if (Number1>=13 && Number1<=19){
            return true;
        }else{
            return false;
        }
    }
}
