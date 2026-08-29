package JavaFundamental;
import java.util.Scanner;

public class L06_StringsBasic{

    static boolean isPalindrome(String str){

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse+ch;  
        }

        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = reverse.charAt(i);
            if(ch1!=ch2){
                return false;
            }
        }
    return true;
    }

    
    public static void main(String[] args) {
        
    // String first_Name = "Deepak";
    // String last_Name = new String("Tyagi");
    // System.out.println(first_Name+" "+last_Name);

    // String str = "Deepak";

    // //length of string
    // System.out.println(str.length());

    // // access of characters
    // System.out.println(str.charAt(0));
    // System.out.println(str.charAt(3));
    // System.out.println(str.charAt(5));

    //Strings are Immutable ---

    //Compare Strings 

    // String name1= "Deepak";
    // String name2= "DEEPAK";

    // if(name1.equalsIgnoreCase(name2)){
    //     System.out.println("Both are Equal");
    // }
    // else{ System.out.println("Not Equal");}

    //Taking String input

    Scanner sc = new Scanner (System.in);

  
    // System.out.println("whats your name :");
    // String fullName = sc.nextLine();      //full line
    //  System.out.println(fullName);

    //  System.out.println("whats your name :");
    // String name = sc.next();             //single word
    // System.out.println(name);

    // Common String Methods ---

    // --1-- Print each Character of the String

        // String str = "Deepak";

        // for(int i=0;i<str.length();i++){
        // System.out.println(str.charAt(i));
        // }

    // --2-- Count length of String without length()
         
        // String str = "Deepak";

        // char arr[]= str.toCharArray();
        // int ans=arr.length;
        // System.out.println(ans);

    // --3-- Count Vowels in a String

        //    String str = "Deepak";

        //    int count =0;
        //    for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if (ch == 'A' || ch=='E' || ch == 'I' || ch=='O' || ch == 'U' || ch=='a' || ch == 'e' || ch=='i' || ch == 'o' || ch=='u'){
        //         count++;
        //     }
        //    }
        //    System.out.println("Total Vowels: "+count);

    // --4-- Reverse a String

        //    String str = "Deepak";

        //    String reverse = "";

        //    for(int i=str.length()-1;i>=0;i--){
        //     char ch = str.charAt(i);
        //     reverse = reverse + ch;
        //    }
        //    System.out.println("Reverse :"+reverse);

    // --5-- Check String is a Palindrome or not

            //  String str = "racecar";

            //  System.out.println(isPalindrome(str));

            // String str = "racecar";

            // String reverse ="";

            //  boolean isboolean = true;

            // for(int i=str.length()-1;i>=0;i--){
            //     char ch = str.charAt(i);
            //     reverse =reverse +ch;
            // }

            // if(str.equals(reverse)){
            //     System.out.println("Its palindrome");
            // }
            // else{System.out.println("Its not");}

        //     for(int i=0;i<str.length();i++){
        //         char ch1 = str.charAt(i);
        //         char ch2 = reverse.charAt(i);
        //         if(ch1!=ch2){
        //             isboolean = false;
        //         }
        //     }
           
        //  if(isboolean){
        //     System.out.println("its palindrome");
        //  }
        //  else{System.out.println("Its not");}
            
            sc.close();

        
       //   ----End---
    }
}
