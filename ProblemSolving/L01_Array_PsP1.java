package ProblemSolving;
public class L01_Array_PsP1 {

    //     ------- Array Problem Solving (Part 1) -------

    // #1. Find the average of array elements --
    static double getaverage(int arr[]){
        double sum =0;
        for(int i : arr){
            sum+=i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    // #2. Multiply each element of array by 10 --
   static int[] mult_10(int arr[]){
    int size = arr.length;
    int newArray[] = new int[size];

    for(int i=0;i<size;i++){
        int element = arr[i];
        int newElement = element *10;
        newArray[i]= newElement;
    }
    return newArray;
   }

    // #3. Search for an element in an array (Linear Search)
    static int linearSearch(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
        return i;
            }
        }
        return -1;
    }

    // # 4. Find the maximum element in  an array --
    static int maxElement(int arr[]){
        int max = arr[0];
        for(int element : arr){
            if( element > max) {
                max = element;
            }
        }
        return max;
    }

    //h.w. math.max()

    // #5. Return Sum of +ve and -ve numbers  --
    static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posSum+=arr[i];
            }
            else{
                negSum+=arr[i];
            }             
        }
        int ans[] = {posSum,negSum};
        return ans;
    }

    // #6. Count the Number of Zeroes and One --
    static int[] getZeroOneCount(int arr[]){
        int zeroes =0;
        int ones =0;
        for(int i:arr){
            if(i==0){
                zeroes++;
            }
            else{
            ones++;}
        }
        int ans[]= {zeroes,ones};
        return ans;
    }

    // #7. Find first Unsorted Element in Array --
    static int fstUnsortElement(int arr[]){

        for(int i=0;i<arr.length;i++){
           if(arr[i+1]<=arr[i]){
            return arr[i+1];
           }
        }
        return -1;
    }

    public static void main(String[] args) {

    // 1.
    // int arr[]= {2,4,1,3};
    // System.out.println(getaverage(arr));

    // 2.
    // int arr[]={2,4,1,3};
    // int ans[]= mult_10(arr);
    // for(int i:ans){
    //     System.out.println(i);
    // }

    //3.
    // int arr[]= {2,6,7,8};
    // int target = 8;
    // System.out.println(linearSearch(arr,target));

    // 4. 
    // int arr[]= {1,2,3,8,6,4,7};
    // System.out.println("Maximum Element :"+maxElement(arr));

    //5.
    // int arr[]= {2,-4,5,-2,-3,3,-3};
    // int ans[]= getposnegNum(arr);
    // System.out.println("Positive Sum :"+ ans[0]);
    // System.out.println("Negative Sum :"+ ans[1]);

    //6.
    // int arr[] = {0,0,1,1,0,1,1,0,1};
    // int ans[] = getZeroOneCount(arr);
    // System.out.println("Zeroes Count :"+ans[0]);
    // System.out.println("Ones Count :"+ans[1]);

    //7.
    // int arr[] = {2,3,5,4,9};
    // System.out.println(fstUnsortElement(arr));


        // --- End ---  
    }
}