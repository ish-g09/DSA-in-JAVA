class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int monthArr[]=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int arriveM=(int)Integer.parseInt(arriveAlice.substring(0,2));
        int arriveD=(int)Integer.parseInt(arriveAlice.substring(3,5));
        int BarriveM=(int)Integer.parseInt(arriveBob.substring(0,2));
        int BarriveD=(int)Integer.parseInt(arriveBob.substring(3,5));
        int leaveM=(int)Integer.parseInt(leaveAlice.substring(0,2));
        int leaveD=(int)Integer.parseInt(leaveAlice.substring(3,5));
        int BleaveM=(int)Integer.parseInt(leaveBob.substring(0,2));
        int BleaveD=(int)Integer.parseInt(leaveBob.substring(3,5));
        int days=0;
        int aliceA=arriveD;
        int aliceL=leaveD;
        int bobA=BarriveD;
        int bobL=BleaveD;
        for(int i=0; i<arriveM-1; i++)
            aliceA+=monthArr[i];
        for(int i=0; i<BarriveM-1; i++)
            bobA+=monthArr[i];
        for(int i=0; i<leaveM-1; i++)
            aliceL+=monthArr[i];
        for(int i=0; i<BleaveM-1; i++)
            bobL+=monthArr[i];
        int start=Math.max(aliceA,bobA);
        int end=Math.min(aliceL,bobL);
        if(end>=start) return end-start+1;
        return 0;
    }
}