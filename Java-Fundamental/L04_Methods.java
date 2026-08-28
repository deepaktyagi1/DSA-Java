package JavaFundamental;
public class L04_Methods {

  // declarations
        
    //eg1(void - no parameter)
    static void print2Table(){
        for(int i=1;i<=10;i++){
            System.out.println(2*i);
        }
    }
     
    // eg2(void - parameter)
    static void sum(int x,int y){
        System.out.println(x+y);
    }

    //eg3
    static void multiplication(int a,int b){
       int ans= a*b;
       System.out.println(ans);
    }

    //eg4( non void - parameter)
    static int adding(int x,int y){
        int sum = x+y;
        return sum;
    }

    //eg5
    static void solve(){
        System.out.println("Hey");
        int ans= add(1,2);
        System.out.println(ans);
        System.out.println("Bye Bye");
    }

    //eg 5(b)
    static int add(int a,int b){
        System.out.println("Hello");
        int ans= a+b;
        return ans;
        // System.out.println("Deepak");
    }

    //eg 6
    static int add(int a,int b , int c){
        int ans= a+b+c;
        return ans;
    }
    
    public static void main(String[] args) {

        System.out.println("START"); 

        // print2Table();
        // sum(5,10);
        // multiplication(5, 10);
        //    System.out.println("Hi");
        //    solve();
        //    System.out.println("Bye");

        //   int result = adding(5,10);

        int ans1= add(1,2);
        System.out.println(ans1);

        int ans2=add(1,2,3);
        System.out.println(ans2);

        //   System.out.println(result);

        System.out.println("END");
    }  
}