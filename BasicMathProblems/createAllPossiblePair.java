// Write a Java program to create all possible pair.
class possiblePair {
    //Function to print all possible pair
    public static void pospair(int[] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j){
                    System.out.println(arr[i] + " " + arr[j]);
                    
                }
            }
        }
    }
    //Driver class
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        pospair(arr,n);
    }
}