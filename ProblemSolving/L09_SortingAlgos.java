package ProblemSolving;

public class L09_SortingAlgos {

    //     ------- Sorting Algorithms -------

    // #1. Bubble Sort --
    static void bubbleSort(int arr[]){

        int n = arr.length-1;

        for(int i =0; i<=n;i++){
            for(int j= 0;j<=n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // #2. Selection Sort --
    static void selectionSort(int arr[]){

        int n = arr.length;
 
        for(int i =0;i<n-1;i++){
            int minIndex = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // #3. Insertion Sort --
    static void insertionSort(int arr[]){

        int n = arr.length;

        for(int i = 1;i<n;i++){
            int current= i;
            int prev = i-1;
            int currValue = arr[i];

            while(prev>=0 && currValue<arr[prev]){
              arr[prev+1] = arr[prev];   //shift
              prev--;
            }
            arr[prev+1]= currValue;
        }
    }

    public static void main(String[] args) {

        //1.
        // int arr[] = {5,6,3,1};
        // bubbleSort(arr);
        // for(int val: arr){
        //     System.out.println(val);
        // }

        //2.
        // int arr[] = {5,6,4,1,3};
        // selectionSort(arr);
        // for(int val: arr){
        //     System.out.println(val);
        // }
     
        //3.
        int arr[] = {4,1,5,2,3};
        insertionSort(arr);
        for(int val: arr){
            System.out.println(val);
        }
        
        
        // -- End --
    }
}