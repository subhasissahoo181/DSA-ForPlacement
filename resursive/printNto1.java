//N to 1 without loop

public class Solution
{
    public static int[] rec(int[] array, int n, int i){
        if(n > 0){
            array[i] = n;
            rec(array,n-1, i+1);

        }
        
        return array;
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int i=0;
        int[] array = new int[x];
        return rec(array, x,i);
    }
}

