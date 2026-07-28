class MedianFinder {
    
    ArrayList<Integer>arr;
    public MedianFinder() {
        arr=new ArrayList<>();
    }
    
    public void addNum(int num) {
        
        int index=Collections.binarySearch(arr,num);
        if(index<0){
            index=-(index+1);
        }
        arr.add(index, num);
    }
    
    public double findMedian() {
        
        int size=arr.size();
        if(size%2!=0) return (double)(arr.get(size/2));
        else{
            int a1=arr.get(size/2);
            int a2=arr.get(size/2-1);
            return (double)(a1+a2)/2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */