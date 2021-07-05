package JavaMasterClass;

public class AreaCalculator {

    public static void main(String[] args) {

       double d = area(5.0);
        System.out.println(d);

        double d2 = area(5.0,4.0);
        System.out.println(d2);

    }

    public static double area(double radius){
        if (radius<0){
            return  -1.0;
        }
        double r = radius;
        double square = Math.pow(radius,2);
        double circleArea = square * Math.PI;
        return circleArea;
    }
    public  static double area(double x, double y){
        if ((x<0) || (y<0)){
            return -1;
        }

        double rectangleArea = x*y;
        return rectangleArea;
    }

}
