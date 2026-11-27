class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        return Math.max(
            robliner(nums,0,n-2),
            robliner(nums,1,n-1)
        );
    }
    public int robliner(int nums[],int s, int e){
        int prev1=0,prev2=0;
        for(int i=s;i<=e;i++){
            int c=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=c;
        }
        return prev1;
        }
    }
        

        
    
