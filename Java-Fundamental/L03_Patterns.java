package JavaFundamental;
public class L03_Patterns{
    public static void main(String[] args) {
        

     // Pattern 1 (Solid Square Pattern) ---
    
     int n=4;
     for (int row =1;row<=n;row++){
         for(int col =1;col<=n;col++){
             System.out.print("* ");
         }
         System.out.println();
     }
    

     // Pattern 2 (Solid Rectengular Pattern) ---

     int n=3;
     for(int row =1;row<=n;row++){
         for(int col =1;col<=5;col++){
             System.out.print("* ");
         }
         System.out.println();
     }


     // Pattern 3 (Solid Right-Angle Triangle Pattern) ---

     int n =5;
     for(int row=1;row<=n;row++){
         for(int col=1;col<=row;col++){
             System.out.print("* ");
         }
         System.out.println();
     }


     // Pattern 4 (Solid Rhombus Pattern) ---

       int n =5;
        for(int row=1;row<=n;row++){
          for(int col=1;col<=n-row;col++){
              System.out.print(" ");
          }
          for(int col=1;col<=n;col++){
              System.out.print("* ");
          }
          System.out.println();
        }



    
      // Pattern 5 (Inverted Right-Angle Triangle Pattern) ---
    
      int n=5;

      for(int row=1;row<=n;row++){
          for(int col=1;col<=n-row+1;col++){
              System.out.print("* ");
          }
          System.out.println();
      }


    
    // Pattern 6 (Solid Pyramid Pattern) ---

     int n=5;
     for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
            System.out.print(" ");
        }
        for(int col=1;col<=(2*row)-1;col++){
            System.out.print("*");
        }
        System.out.println();
     }


    // Pattern 7 (Inverted Pyramid Pattern) ---

     int n=4;
     for(int row=1;row<=n;row++){
        for(int col=1;col<=row-1;col++){
            System.out.print(" ");
        }
        for(int col=1;col<=(2*n)-(2*row)+1;col++){
            System.out.print("*");
        }
        System.out.println();
     }


    // Pattern 8 (Hollow Rectangle) ---

    int n=4;
    for(int row=1;row<=n;row++){
        for(int col=1;col<=6;col++){
            if(row==1 || row==n ){
                System.out.print("*"); }
                else{
                    if(col==1 || col==6){
                        System.out.print("*");
                    }
                    else{System.out.print(" ");}
                }
        }
        System.out.println();
     }

    
    // Pattern 9 (Hollow Traiangle) ---

    int n=5;
    for(int row=1;row<=n;row++){
        if (row==1 || row==2 || row==n ){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }  
        }
        else{
            System.out.print("*");
            for(int col=1;col<=(row-2);col++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }


    // Pattern 10 (Hollow Pyramid) ---

    int n=5;
    for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
            System.out.print(" ");
        }
        if (row==1 || row==n){
            for(int col=1;col<=(2*row)-1;col++){
                System.out.print("*");
            }
        }
        else{
            System.out.print("*");
            for(int col=1;col<=(2*row)-3;col++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
    

    // Pattern 11 (Solid Diamond) ---

    int n=4;

    for(int row =1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
            System.out.print(" ");
        }
        for(int col=1;col<=(2*row)-1;col++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int row=1;row<=n;row++){
        if(row==1){
                continue;
            }
        for(int col=1;col<=row-1;col++){
            System.out.print(" ");
        }
        for(int col=1;col<=(2*n)-2*row+1;col++){
            System.out.print("*");
        }
        System.out.println();
    }


    // Pattern 12 (Hollow Diamond) ---
     
    int n=4;
    for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
            System.out.print(" ");
        }
        if(row==1){
            System.out.print("*");
        }
        else{
             System.out.print("*");
            for(int col=1;col<=(2*row)-3;col++){
                System.out.print(" ");
            }
            System.out.print("*");
       }
       System.out.println();
    }
       //part 2
      for(int row=1;row<=n;row++){
        if(row==1){
          continue;
        }
        for(int col=1;col<=row-1;col++){
                System.out.print(" ");
            }
        if(row==2 || row==3 ){
         System.out.print("*");
            for(int col=1;col<=(n*2)-(2*row)-1;col++){
                System.out.print(" ");
            }
            System.out.print("*");
          }
        else{
            System.out.print("*");
        }
          System.out.println();  
        }



      // Pattern 13 (Butterfly Pattern) ---

      int n=4;

      for(int row=1;row<=n;row++){
        //part1(a)
        for(int col=1;col<=row;col++){
            System.out.print("*");
        }
        //part1(b)
        for(int col=1;col<=(2*n)-(2*row);col++){
          System.out.print(" ");
        }
        //part1(c)
        for(int col=1;col<=row;col++){
          System.out.print("*");
        }
        System.out.println();
      }

      for(int row=1;row<=n;row++){
        //part2(a)
        for(int col=1;col<=(n-row)+1;col++){
          System.out.print("*");
        }
        //part2(b)
        for(int col=1;col<=(2*row)-2;col++){
          System.out.print(" ");
        }
        //part2(c)
        for(int col=1;col<=(n-row)+1;col++){
          System.out.print("*");
        }
        System.out.println();
      }


      // Pattern 14 (number-triangle) ---

      int n=5;

      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
          System.out.print(col);
        }
        System.out.println();
      }


      //Pattern 15 (counting-triangle) ---

      int n=5;
      int count=1;

      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
          System.out.print(count+" ");
          count ++;
        }
        System.out.println();
      }


      // Pattern 16 (alphabatical-triangle) ---

      int n=5;

      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
          int a = col;
          int b = ('A' - 1);
          int ans = a+b;
          char chor = (char)ans;
          System.out.print(chor);
        }
        System.out.println();
      }


      // Pattern Extra (counting-alpha-triangle) ---

      int n=5;
      char alpha ='A';
      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
          System.out.print(alpha);
          alpha++;
        }
        System.out.println();
      }


      // Pattern 17 (EDCBA-triangle) ---

      int n=5;

      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
          int a = n-col;
          int b = ('A');
          int ans = a+b;
          char chor = (char)ans;
          System.out.print(chor);
        }
        System.out.println();
      }
        
    
      // Pattern 18 (Hourglass Pattern) ---

      int n=4;
      //part1
      for(int row=1;row<=n;row++){
        for(int col=1;col<=row-1;col++){
          System.out.print(" ");
        }
        for(int col=1;col<=(2*n)-(2*row)+1;col++){
          System.out.print("*");
        }
        System.out.println();
      }
       //part2
      for(int row=1;row<=n;row++){
        if(row==1){
          continue;
        }
        else{
        for(int col=1;col<=n-row;col++){
          System.out.print(" ");
        }
        for(int col=1;col<=(2*row)-1;col++){
          System.out.print("*");
        } }
        
        System.out.println();
      }


      // Pattern 19 (Pyramid-numberic) ----

      int n=4;
      for(int row=1;row<=n;row++){
        //p1
        for(int col=1;col<=n-row;col++){
          System.out.print(" ");
        }
        //p2
        for(int col=1;col<=row;col++){
          System.out.print(col);
        }
        //p3
        int value =row-1;
        for(int col=1;col<=row-1;col++){
          System.out.print(value);
          value--;
          
        }
        System.out.println();
      }


      // Pattern 20 (Pyramid-numberic-02) ----

      int n=4;

      for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
          System.out.print(" ");
        }
        for(int col=1;col<=(2*row)-1;col++){
          System.out.print(row);
        }
        
        System.out.println();
      }


      // pattern 21 (Pyramid-Alphabetic) ----

      int n=4;

      for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++){
          int a= col;
          int b= ('A'-1);
          int ans = a+b;
          char fin_ans= (char)ans;
          System.out.print(fin_ans);
        }
        
        int x= row;
            int y= ('A'-2);
            int z= x+y;
            char toPrint= (char)z;
        for(int col=1;col<=row-1;col++){
            
            System.out.print(toPrint);
            toPrint--;
        }
        System.out.println();
      }


        // -- END--
    }
}
