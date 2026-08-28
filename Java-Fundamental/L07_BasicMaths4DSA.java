package JavaFundamental;
public class L07_BasicMaths4DSA {

    //#1. Print Digits
    static void printDigits(int num){
    while(num!=0){
    int digit = num%10;
    System.out.println(digit);
    num=num/10;
    }
    }

    //#2. Count Digits
    static int countDigits(int num){
        int count=0;
        while(num!=0){
            // int digit = num%10;         //uncomment this
            count++;
            num=num/10;
        }
        return count;
    }

    //#3. Sum of Digits
    static int sumDigits(int num){
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }

    //#4. Reverse a Number
    static int reverseNum(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }

    //#5.Palindrome Number
    static boolean isPalindrome(int num){
        int orignal = num;
        int rev=0;
        while(num!=0){
            int digit =num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(orignal!=rev){
            System.out.println("its not Palindrome");
            return false;
        }
        System.out.println("Its Palindrome");
        return true;
    }

    //#6. Prime Number
    static boolean isPrime(int num){

         for(int i=2;i*i<=num;i++){
            if(num%i==0){
                    // System.out.println("Not a Prime Number");
                    return false;
                }
         }
            // for(int i=2;i<=num-1;i++){
            //     if(num%i==0){
            //         System.out.println("Not a Prime Number");
            //         return false;
            //     }
            //    }
        // System.out.println("It is Prime Number");
        return true;
    }

    //#7. GCD of Number (HCF)
    static int gcd(int a, int b){
        
        
        while(b!=0){
            int oldB= b;
            b=a%b;
            a=oldB;
        }
        int ans= a;
        return ans;

        //   while (a!=0){
        //     int oldA = a;
        //     a=b%a;
        //     b=oldA;
        //   }
        //   return b;

        // while(b==0){
        //     return a;
        // }
        // return gcd(b,a%b);

        //  while(a==0){
        //      return b;
        //  }
        // return gcd(b%a,a);
    }

    //#8. LCM of Number
    static int lcm(int a,int b){
        int ans= (a*b)/gcd(a,b);
        return ans;
    }

    //#9. Armstrong Number
    static boolean armstrong(int num){
        int orignalNum=num;
        int ans=0;
        while(num!=0){
            int digit=num%10;
            digit = digit*digit*digit;
            ans=ans+digit;
            num=num/10;
        }
        if(orignalNum!=ans){
            System.out.println("Not Armstrong");
            return false;
        }
        System.out.println("It is Armstrong");
        return true;
    }

    //#10. Find all Divisors or Perfect Number
    static boolean perfectNumber(int num){
        int sum =1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                int firstFactor=i;
                int secondFactor =  num /i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }

    //#11. Print all Prime from 1 to N
    static void primeNumber(int n){
        for(int num=2;num<=n;num++){
            boolean primeNum = isPrime(num);
            if(primeNum == true){
                System.out.println(num);
            }
        }
        }

    public static void main(String[] args) {

// --1-- Print Digits

    // int num = 53127;
    // printDigits(num);

// --2-- Count Digits
   
    // int num=53127;
    // int ans=countDigits(num);
    // System.out.println(ans);

// --3-- Sum of Digits

    //  int num = 53127;
    //  int ans = sumDigits(num);
    //  System.out.println(ans);
       
// --4-- Reverse a Number

    //   int num =251;
    //   int ans=reverseNum(num);
    //   System.out.println(ans);

// --5-- Palindrome Number
   
    //    int num = 900009;
    //    boolean ans = isPalindrome(num);
    //    System.out.println(ans);

// --6-- Prime Number
       
        // int num = 11;
        // System.out.println(isPrime(num));

// --7-- GCD of Number (HCF)

    //   System.out.println(gcd(14, 12));

// --8-- LCM of Number 
 
    //   System.out.println(lcm(6,8));

// --9-- Armstrong Number

    //    int num =153;
    //    System.out.println(armstrong(num));

// --10-- Find all Divisors or Perfect Number

    // int num =6;
    // System.out.println(perfectNumber(num));

// --11-- Print all Prime from 1 to N

       int n=100;
       primeNumber(n);

//    //----End----
    }
}