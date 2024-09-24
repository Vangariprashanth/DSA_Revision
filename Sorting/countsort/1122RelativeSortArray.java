//https://leetcode.com/problems/relative-sort-array/description/?envType=problem-list-v2&envId=counting-sort&difficulty=EASY
public class 1122RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Arrays.stream(arr1).max().getAsInt();
        int[] arr = new int[max+1];
        for(int i=0;i<arr1.length;i++){
            arr[arr1[i]]++;
        }
        int[] res = new int[arr1.length];
        int index = 0;
        for(int i=0;i<arr2.length;i++){
            while(arr[arr2[i]]>0){
                res[index]=arr2[i];
                index+=1;
                arr[arr2[i]]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                res[index]=i;
                index+=1;
                arr[i]--;
            }
        }

        return res;
    }
}
