import java.util.Scanner;
class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String s){
        super(s);
    }
}
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String s){
        super(s);
    }
}
public class shortlongexception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        int len=str.length();
        try {
            if(len>20){
                throw new ExceptionLineTooLong("The input is too long");
            }
            else if (len<10) {
                throw new ExceptionLineTooShort("The input is too short");
            }
            else{
                System.out.println("Entered string have specified length");
            }
        }
        catch (ExceptionLineTooLong e1){
            System.out.println("Exception Caught "+e1.getMessage());
        }
        catch (ExceptionLineTooShort e2){
            System.out.println("Exception Caught "+e2.getMessage());
        }
    }
}
