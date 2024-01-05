// Write a Java program to check wheather a key is present or not
//linear search
class linearSearch {
    //Function
    public static boolean search(int[] arr, int n, int key){
        for(int i=0; i<n; i++){
           if(arr[i] == key)
               return true;
           
        }
        return false;
    }
    //Driver class
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int n = arr.length;
        if(search(arr,n,key)){
            System.out.println("The Number is present in the array!");
        }
        else{
            System.out.println("The Number is not present in the array");
        }
    }
}