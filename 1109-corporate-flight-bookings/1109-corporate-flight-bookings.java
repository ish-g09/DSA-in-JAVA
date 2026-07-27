class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[]result=new int[n];
        int diff[]=new int[n];
        for(int book[]:bookings){
            for(int i=book[0];i<=book[1]; i++){
                diff[i-1]+=book[2];
            }
        }
        return diff;
        
    }
}