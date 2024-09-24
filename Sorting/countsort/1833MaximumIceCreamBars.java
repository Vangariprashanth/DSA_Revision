public class 1833MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        int max = Arrays.stream(costs).max().getAsInt();
        int[] arr = new int[max+1];
        for(int cost: costs){
          arr[cost]++;
        } 
        int index = 0; 
        for(int i=0;i<arr.length;i++){
              while(arr[i]>0){
                  costs[index]=i;
                  index++;
                  arr[i]--;
              }
        }
        int sum = 0;
        int i=0;
        for(i=0;i<costs.length;i++){
              if(sum+costs[i]<=coins){
                  sum+=costs[i];
              }
              else{
                  return i;
              }
        }
          return i;
  
  
      }
}
