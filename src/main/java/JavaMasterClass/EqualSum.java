package JavaMasterClass;

public class EqualSum {
    public static void main(String[] args) {
        boolean Sum = hasEqualSum(1,1,2);
        System.out.println(Sum);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num1 + num2 ==num3){
            return true;
        }else{
            return false;
        }
    }
}
