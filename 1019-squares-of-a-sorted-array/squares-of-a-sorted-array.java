class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> pos =  new ArrayList<>();
        List<Integer> neg =  new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg.add(nums[i]*nums[i]);
            }
            else{
                pos.add(nums[i]*nums[i]);
            }
        }
        Collections.reverse(neg);

        int[] res = new int[nums.length];

        int i = 0;
        int j=0;
        int id=0;

        while(i<neg.size()&&j<pos.size()){
            if(neg.get(i)<=pos.get(j)){
                res[id]=neg.get(i);
                i++;
            }
            else{
                res[id]=pos.get(j);
                j++;
            }
            id++;
        }
        while (i < neg.size()) {
            res[id] = neg.get(i);
            i++;
            id++;
        }

        while (j < pos.size()) {
            res[id] = pos.get(j);
            j++;
            id++;
        } 
        return res;
    }
}