package JavaMasterClass.ForLoop;

public class ForLoop1 {

    public static void main(String[] args) {
        System.out.println("10,000 AT 2% Interest = " + calculateInterset(10000.0,2.0));

        for (int i=0;i<5;i++){
            System.out.println("Loop "+ i + " Hello");

        }
    }

    public static double calculateInterset(double amount, double InterstRate){
        return (amount*(InterstRate/100));
    }
}
