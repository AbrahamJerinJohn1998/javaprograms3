import java.util.Scanner;
class  InvalidPanException extends Exception{
public InvalidPanException(String str){
    super(str);
}
}
public class PancardValidity {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.next();
        System.out.println("Enter Pan Card Number:");
        String pancardno=sc.next();
        String n1= String.valueOf(name.charAt(0));
        String p1= String.valueOf(pancardno.charAt(4));
        try {
            if(n1.equalsIgnoreCase(p1) && pancardno.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
                System.out.println("You have a valid Pancard");
            }
            else {
                throw new InvalidPanException("Pancard is invalid");
            }
        }
        catch (InvalidPanException p1){
            System.out.println("Exception Caught"+p1.getMessage());
        }
    }
}
