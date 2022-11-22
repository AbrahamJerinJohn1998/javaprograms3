import java.util.Scanner;

public class substringAll {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Substrings of "+s+" are: ");
        int len=s.length();
        for(int i=0;i<len;i++){
            System.out.println(s.substring(i,len));
            for (int j=0;j<i;j++){
                System.out.println(s.substring(j,i));

            }
        }
    }
}
