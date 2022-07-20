package email;
import java.util.Scanner;
public class EmailArray {
	public static void main(String[] args){ 
	      String[] strArray = new String[6];
	      strArray[0]= "abc@gmail.com";
	      strArray[1]= "123@gmail.com"; 
	      strArray[2]= "zyx@gmail.com"; 
	      strArray[3]= "abcd@gmail.com"; 
	      strArray[4]= "895@gmail.com";
	      strArray[5]= "548@gmail.com"; 
	      
	        boolean found = false;
	        int index = 0;
	        
	        Scanner Str=new Scanner(System.in);
	        System.out.println("Enter the Email ID:");
	        String a= Str.nextLine(); 
	       for (int i = 0; i <strArray.length; i++) {
	       if(a.equals(strArray[i])) {
	            index = i; found = true; 
	            }
	        }
	       if(found)
	          System.out.println("\n" +a +" found at the index "+index);
	        else
	          System.out.println("\n" +a +" not found in the array");
	 
	    }
	}