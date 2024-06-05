import java .util.*;
 class pair{
    public int min;
    public int max;
 }
 class Main{
    static pair getMinMax(int arr[],int n)
    {
        pair minmax= new pair();
        Arrays.sort(arr);
        minmax.min=arr[0];
        minmax.max=arr[n-1];
        return minmax;
    }
    public static void main(String[] args)
    {
        int arr[]={1000,11,445,676,43453};
        int arr_size=arr.length;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
    } 
 }