//https://leetcode.com/problems/height-checker/?envType=problem-list-v2&envId=counting-sort&difficulty=EASY
import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int max = Arrays.stream(heights).max().getAsInt();
        int min = Arrays.stream(heights).min().getAsInt();
        int res[] = new int[heights.length];
        int[] array = new int[max+1];
        for(int i=0;i<heights.length;i++){
            array[heights[i]]++;
        }
        int index = 0;

        for(int i=0;i<array.length;i++){
            while(array[i]>0){
                res[index] =i;
                index+=1;
                array[i]-=1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(res));
        int count = 0;
        for(int i = 0;i<heights.length;i++){
            if(heights[i] != res[i]) {count++;}
        }
        return count;
    }
}