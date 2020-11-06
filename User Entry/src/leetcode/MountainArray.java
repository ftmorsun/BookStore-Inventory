package leetcode;

public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] myNum = {1,2,3,4,5,3,1};
	        int target1= 3;
	        
	        int found=-1;

	        int length=myNum.length;
	        int low=0;
	        int high=length-1;
	        int count=0;
	        while (low<high && count<length)
	        {
	        	int middle;
	            //find middle
	        	if (high-low==1)
	        		middle=low;
	        	else
	        		middle=(high-low)/2;
	            
	            System.out.println("low:" + low+"  "+"high: "+high+ "middle: "+middle);
	            //pind peak
	            int current=myNum[middle];
	            System.out.println(current+ "  "+target1);
	            if (current>target1)
	            {
	                high = middle;
	               
	            }
	           
	            else if (current<target1)
	            {
	                low= middle + 1;
	                
	            }
	            else if (current==target1) {
	            	found=middle;
	                break;
	            }
	           
	      
	            //System.out.println(found);
	            count++;
	        }
	                
	        System.out.println(found);
	}

}
