package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestion {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,1,2,7,9,2,3,5,7};
		addArrE(arr);

	}
	public static void addArrE(int arr[])
	
	{
		List<Integer> list=new ArrayList<Integer>();
		int size=arr.length;
		
		int start=0;
		int count=0;
		if (size>=1)
		{
			count=1;;
			
		}
		while(start+count<=size )
		{
			int sum=0;
			  System.out.println(start+" "+start+count);
		   for (int i=start; i<start+count; i++)
		   {
			  sum=sum+arr[i];
			  System.out.println(sum);
			
		   }
		   list.add(sum);
		   
		   //put the start after count
		   
		   start=count+start;
		   count++;
		   
			
		}
		System.out.println(list);
	}

}
