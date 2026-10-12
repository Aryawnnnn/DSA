class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = accounts[0][0];
        for(int i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
           rich = Math.max(rich,sum);
        }
        return rich;
    }
}