package Json;

public class ReverString {
    public static void main(String[] args) {
        String Name = "Brett Hull";
        String Rev= "";
        for (int i = Name.length()-1; i >=0; i--) {
            Rev += Name.charAt(i);

        }
        System.out.println(Rev);
    }
}
