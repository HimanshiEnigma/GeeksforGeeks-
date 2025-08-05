
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
          ArrayList<Integer> res =new ArrayList<>();
        int n=arr.length;
        for(int s=0;s<n;s++){
            int sum=0;
            for(int e=s;e<n;e++){
                sum+=arr[e];
                if(sum==target){
                    res.add(s+1);
                    res.add(e+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
}
