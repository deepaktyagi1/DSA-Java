package JavaFundamental;
import java.util.Scanner;
public class L05_ArraysBasic{

    // static int linear(brr,target){
    // for(int i=0;i<brr.length;i++){
    //     if (brr[i]== target){
    //     }
    //    }
    // }

    public static void main(String[] args) {
        
    // declaration
    // int arr[];

     // allocation
    // arr= new int [3];
     
     // initialisation
     //int brr[] = {10,20,30,40,50};

    //  System.out.println(brr[0]);
    //  System.out.println(brr[1]);
    //  System.out.println(brr[2]);\

    //Traversing--

    //int n= brr.length;
    // for(int i=0;i<brr.length;i++){
    //     System.out.println(brr[i]);
    // }

    // For Each Loop
    // for(int val: brr){
    //     System.out.println(val);
    // }

    //Taking Input in Array

    // Scanner sc = new Scanner (System.in);
    // System.out.println("Enter your array values: ");
     
    // for(int i=0;i<arr.length;i++){
    //     arr[i]= sc.nextInt();
    // }

    // System.out.println("This is your array-");

    // for(int van : arr){
    //     System.out.println(van);
    // }

    Scanner sc= new Scanner (System.in);

// -1- Total Sum of elements of an Array 
    // int [] trr= new int [5];

    // System.out.println("Enter Your Values : ");
    
    // for(int i=0;i<trr.length;i++){
    //     trr[i]= sc.nextInt();
    // }

    // int sum=0;

    // for(int i=0;i<trr.length;i++){
    //     sum=sum+trr[i];
    // }
    // System.out.println("Your Sum is : "+sum);

// -2- Total Multiplication of elements of an Array
    //   int []trr= new int [5];

    //   System.out.println("Enter your values : ");

    //   for(int i=0;i<trr.length;i++){
    //     trr[i]= sc.nextInt();
    //   }

    //   int ans=1;
    //   for(int i=0;i<trr.length;i++){
    //     ans=ans*trr[i];
    //   }
    //   System.out.println("your Multiplication is "+ ans);

// -3- Find maximum value in Array
    //    int brr[]= new int[5];

    //    System.out.println("Enter Your values : ");

    //    for(int i=0;i<brr.length;i++){
    //     brr[i]= sc.nextInt();
    //    }
    //     int max= brr[0];

    //     for(int i=0;i<brr.length;i++){
    //         if(brr[i]>max){
    //             max= brr[i];
    //         }
    //     }
    //     System.out.println("Maximum Value is: "+ max);

// -4- Find minimum value in Array
    //    int brr[]= new int[5];

    //    System.out.println("Enter Your Values:");

    //    for(int i=0;i<brr.length;i++){
    //     brr[i]=sc.nextInt();
    //    }

    //    int min= brr[0];

    //    for(int i=0;i<brr.length;i++){
    //     if(brr[i]<min){
    //         min= brr[i]; }
    //    }
    //    System.out.println("Minimum value is :"+ min);

// -5- Linear Search in Array
    //   int brr[]= new int[5];

    //    System.out.println("Enter Your Values:");

    //    for(int i=0;i<brr.length;i++){
    //     brr[i]=sc.nextInt();
    //    }

    //    System.out.println("Enter to Search : ");
    //    int target = sc.nextInt();


//  ---2D Array---

// declartion
//    int arr[][]; 

// allocation
    // arr = new int[3][4];

//Initialization
    // int [][]brr= {{1,2},{3,4},{5,6},{7,8}};

//    System.out.println(brr[1][2]);

   //Traversing

//    for(int i=0;i<brr.length;i++){
//     for(int j=0;j<brr[i].length;j++){
//         System.out.print(brr[i][j]+" ");
//     }
//          System.out.println();
//    }

// int brr[][] = new int[3][4];

// Taking Input in 2D Array 

//      for(int i=0;i<brr.length;i++){
//         for(int j=0;j<brr[i].length;j++){
//             brr[i][j] = sc.nextInt();
//         }
//      }

//      for(int i=0;i<brr.length;i++){
//     for(int j=0;j<brr[i].length;j++){
//         System.out.print(brr[i][j]+" ");
//     }
//          System.out.println();
//    }

// # Practice Problems

// --1-- Total sum of elements in 2D Array
     
//    int drr[][]= new int[2][3];

//     System.out.println("Enter Values:");
   
//    for(int i=0;i<drr.length;i++){
//     for(int j=0;j<drr[i].length;j++){
//         drr[i][j] = sc.nextInt();
//     }
//    }

//    int sum=0;

//    for (int i=0;i<drr.length;i++){
//     for(int j=0;j<drr[i].length;j++){
//         sum=sum+drr[i][j];
//     }
//    }
//    System.out.println("Total Sum : "+sum);

   // --2-- Total multiplication of elements in 2D Array

//    int drr[][]= new int[2][3];

//    System.out.println("Enter Values:");
   
//    for(int i=0;i<drr.length;i++){
//     for(int j=0;j<drr[i].length;j++){
//         drr[i][j] = sc.nextInt();
//     }
//    }

//    int ans=1;

//    for (int i=0;i<drr.length;i++){
//     for(int j=0;j<drr[i].length;j++){
//         ans=ans*drr[i][j];
//     }
//    }
//    System.out.println("Total Multiplication : "+ans);

// --3-- Find maximum value in 2D Array

    // int drr[][]= new int [2][3];

    // System.out.println("Enter Values:");

    // for(int i=0;i<drr.length;i++){
    //     for(int j=0;j<drr[i].length;j++){
    //         drr[i][j]= sc.nextInt();
    //     }
    // }

    // int max= drr[0][0];

    // for(int i=0;i<drr.length;i++){
    //     for(int j=0;j<drr[i].length;j++){
    //         if(drr[i][j]>max){
    //             max=drr[i][j];
    //         }
    //     }
    // }
    // System.out.println("Maximum Value : "+max);

// --4--Find minimum value in 2D Array

    // int drr[][]= new int[2][3];

    // System.out.println("Enter Values : ");

    // for(int i=0;i<drr.length;i++){
    //     for(int j=0;j<drr[i].length;j++){
    //         drr[i][j]= sc.nextInt();
    //     }
    // }

    // int min= drr[0][0];

    // for(int i=0;i<drr.length;i++){
    //     for(int j=0;j<drr[i].length;j++){
    //         if(drr[i][j]<min){
    //             min=drr[i][j];
    //         }
    //     }
    // }
    // System.out.println("Minimum Value : "+min);

        sc.close();

        
       //  ---End---
    }   
}
