package Json;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str= "AAAABBKKACDDDDWWWWBDD";
        String Expected = "";

        for (int i = 0; i < str.length(); i++) {
            int num =0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j))
                num++;

            }
            Expected = str.charAt(i)+""+num;
            str=str.replace(""+str.charAt(i), "");
            i=1;
            System.out.println(Expected);

        }


    }
}
