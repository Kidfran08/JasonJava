package JavaMasterClass.Swtich;

import java.util.Locale;

public class Swtich1 {
    public static void main(String[] args) {
        int value=3;
        if (value==1){
            System.out.println("Value was 1");
        }else if (value ==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not 1 or 2");
        }

        int switchValue =1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3,4 ,or 5");
                System.out.println("Acuatally was a " +switchValue);
                break;

            default:
                System.out.println("Was not 1 , 2, 3 ,4 or 5");
                break;
        }

        System.out.println("==============================================");

        char LetterValue ='B';

        switch (LetterValue){
            case 'A':
                System.out.println("A WAS found");
                break;

            case 'B':
                System.out.println("B was found ");
                break;
            case 'C':
                System.out.println("C found ");
                break;
            case 'D':
                System.out.println("D found ");
                break;
            case 'e':
                System.out.println("E found");
                break;

            default:
                System.out.println("Not  Found ");
        }

        System.out.println("====================================");

        String month ="JAn";
        switch (month.toLowerCase()){
            case "Jan":
                System.out.println("Januaray");
                break;
            case "Feb":
                System.out.println("Febuary");
                break;
            default:
                System.out.println("no way");
        }
    }
}
