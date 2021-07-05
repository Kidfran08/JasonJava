package JavaMasterClass;

public class DecimalComparator {

    public static void main(String[] args) {
        boolean arethey = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(arethey);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = (int) (num1 * 1000);
        num2 = (int) (num2 * 1000);

        if (Math.round(num1) == Math.round(num2)) {
            return true;
        } else {
            return false;
        }

    }
}
