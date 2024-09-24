import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort{
    public static void CountSort(int[] array){
        if(array == null || array.length <= 1){
            return; 
        }
        int n= array.length;
        int max = array[0];
        for(int num: array){
            if(num>max){
                max=num;
            }
        }
        int[] countArray =  new int[max+1];
        for(int i=0;i<n;i++){
            countArray[array[i]] = countArray[array[i]]+1;
        }
        int index = 0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                array[index] = i;
                countArray[i] -=1; 
                index+=1;
            }
        }
    }
    public static void countSortHash(int[] array){
        if(array == null || array.length<=1){
            return;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        Map<Integer,Integer> map = new HashMap<>();
            for(int num:array){
                map.put(num, map.getOrDefault(num,0)+1);
            }
            int index = 0;
            for(int i=min;i<=max;i++){
                int count = map.getOrDefault(i,0);
                for(int j=0;j<count;j++){
                    array[index] = i;
                    index+=1;
                }
            }
    }
    public static void main(String args[]){
        int array[] = {6,3,10,9,2,4,9,7};
        countSortHash(array);
        // countSort(array);
        System.out.println(Arrays.toString(array));
    }
}