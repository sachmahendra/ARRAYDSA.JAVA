import java.util.Scanner;   
public class Input 
{   
public static void main(String[] args)   
{   
Scanner sc = new Scanner(System.in);   
System.out.print("Input a character: ");  
// reading a character   
   
String str= sc.nextLine();   
//prints the character   
System.out.println("You have character "+str);   
}   
}  