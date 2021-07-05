package JavaMasterClass;

import javax.jws.soap.SOAPBinding;
import java.util.stream.Stream;

public class FreqencyOfCharacters {

    public static void main(String[] args) {
         String freek = frequencyOfChars1("AAABBCDD");
        System.out.println(freek);


    }

    public static String frequencyOfChars1(String str){

        String expectedResult ="";

        int j =0;
        while (j<str.length()){
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)== str.charAt(j)){
                    count++;
                }

            }
            expectedResult += str.charAt(j) + "" + count;
            str =str.replace("" + str.charAt(j),"");
        }
        return  expectedResult;
    }
}
