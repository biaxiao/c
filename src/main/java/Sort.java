import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,5,6,5,4,9,17,13,7,23,27,27,18,19};
        //quickSort(arr,0,arr.length-1);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left ,int right){
        if(left<right){
            int i=left,j=right,x=arr[left];
            while (i<j){
                while (i<j && arr[j]>=x){
                    j--;
                }
                if(i<j){
                    arr[i++]=arr[j];
                }
                while(i<j && arr[i] <= x){
                    i++;
                }
                if(i<j){
                    arr[j--]=arr[i];
                }
            }
            arr[i]=x;
            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
        }
    }

    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int current= arr[i];
            int preIndex=i-1;
            while (preIndex>=0 && current<arr[preIndex]){
                arr[preIndex+1]=arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1]=current;
        }

    }
}
