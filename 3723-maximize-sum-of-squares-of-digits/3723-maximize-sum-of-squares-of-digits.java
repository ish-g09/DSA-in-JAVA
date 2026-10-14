class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(9*num<sum) return "";
        StringBuilder str=new StringBuilder();
        for(int i=0; i<num; i++){
            if(sum>=9){
                str.append("9");
                sum-=9;
            }
            else{
                str.append(sum);
                sum-=sum;
                
            }
            if(sum==0){
                while(i<num-1){
                    str.append("0");
                    i++;
                }
                break;
            }

        }
        return str.toString();
    }
}