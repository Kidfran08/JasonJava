package JavaMasterClass;

public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes/1024;
            int myRemainder= kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megabytes + "MB and  "
                     + myRemainder+ " KB");
        }
    }
}
// 1MB=1024KB