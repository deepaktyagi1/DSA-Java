package JavaFundamental;
public class L02_Loops {

    public static void main(String[] args) {
        
     //   ---FOR Loop---

     //example 1 (counting 1 to 5)
    for(int i=1; i<=5;i++){
        System.out.println(i);
    }

    //example 2
    for(int i=1; i<=5;i++){
        System.out.println("Deepak Tyagi");
    }

    //example 3 (odd no.)
    for(int i=1;i<=10;i+=2){
        System.out.println(i);
    }

    //example 4 (even no.)
    for(int i=2;i<=10;i+=2){
        System.out.println(i);
    }

    //example 5 (Nested Loop)
    for (int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //example 6 (Nested Loop)
    for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            System.out.println("i = "+i + ", j = "+j);
        }
    }



    //   ---BREAK And CONTINUE Keywords

    //example 1 (Break)
    for(int i=1;i<=10;i++){
        if(i==5){
            break;
        }
        System.out.println(i);
    }

    //example 2 (Continue)
    for(int i=1;i<=10;i++){
        if (i==5){
            continue;
        }
        System.out.println(i);
    }



    //   ---WHILE Loop---

    //example 1 (counting 1 to 5)
    int i=1;
    while(i<=5){
        System.out.println(i);
        i++;
    }

    //example 2 (Nested Loop)
    int i=1;
    while(i<=3){
        int j=1;
        while(j<=3){
            System.out.print("* ");
            j++;
        }
        System.out.println();
        i++;
    }

    //example 3 (Nested Loop)
    int i=1;
    while(i<=3){
        int j=1;
        while(j<=3){
            System.out.println("i = "+i + ", j = "+j);
            j++;
        }
    i++;
    }


    //   --- DO-WHILE Loop---

    //example 1 (counting 1 to 5)
    int i=1;
    do{
        System.out.println(i);
        i++;
    }
    while(i<=5);

    //example 2 
    int i=1;
    do{
        System.out.println("Deepak Tyagi");
        i++;
    }
    while(i<0);


        // -- END --
    }
}
