import java.util.Scanner;

public class multipleLineCheck {
    public static void main(String[] args){
        int vowel=0,i,lin=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String s=sc.next();
        String[] line=s.split("\\n+");
        String[] word=s.split("\\s+");
        System.out.println("Number of lines is: "+line.length);
        System.out.println("Number of words is: "+word.length);
        String s1=s.toLowerCase();
        for(i=0;i<s.length();i++){
            char v1=s1.charAt(i);
            if(v1=='a' || v1=='e' || v1=='i' || v1=='o' || v1=='u'){
                vowel++;
            }
        }
        System.out.println("Number of vowels:"+vowels);
    }
}
