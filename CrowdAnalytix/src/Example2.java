import java.util.Arrays;
import java.util.Scanner;

public class Example2 {
	 public static int[] removeDuplicateElements(int arr[]){
      int n = arr.length;
      int[] temp = new int[n];
      int j = 0;
      for (int i=0; i<n-1; i++){
         if (arr[i] != arr[i+1]){
            temp[j++] = arr[i];
         }
      } 
      temp[j++] = arr[n-1];    	     
      return temp;
		 
		
	    }
	public static int maxInArray( int arr[])
	{		
		int max= arr[0];
		for(int i= 1; i< arr.length;i++)
		{
			if(arr[i]>  max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static int minInArray(int  arr[])
	{
		int min = arr[0];
		for(int i=1; i< arr.length ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void convert_to_decs(int arr[])
	{
		System.out.print("Sorted in descending order: ");
		 for(int i = arr.length- 1 ; i>=0;i--)
		  	{
		  		System.out.print(arr[i]+",");
		  	}
		 //System.out.print(Arrays.toString (arr));	
		
	}
	
	
	public static void  sum_of_all_elements(int arr[])
	{
		int sum  =0;
		for(int i= 0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum value :"+ sum);
		
	}
	
	
	
	public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array: 0 < N <= 10");
	      int n = s.nextInt();
	      int [] elements = new int[n];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<n; i++ ) {
	    	  elements[i] = s.nextInt();
	      }

	      System.out.println(Arrays.toString(elements));   
	   
	      
	      
	      Arrays.sort(elements);
	      int[] result = removeDuplicateElements(elements);
	      
	      System.out.print("Array without the duplicates : ");
	      for (int i=0; i<result.length; i++)  {
	          if(result[i] != 0){
	             System.out.print(result[i]+" ");
	          }        
	       }
	      
	      System.out.println();
	      
	      int max =  maxInArray(elements);
	      System.out.print("Max value : "+max);
	      
	      
	      
	      System.out.println();
	      
	      int min =  minInArray(elements);
	      System.out.println("Min value : "+min);
	      
	      
	     // System.out.println(Arrays.toString(elements)); 
	      
	      convert_to_decs(elements);
	      
	      System.out.println();
	      sum_of_all_elements(elements);     
	      
	     
	      
	      
	      
	      
	      
	      
	      
	      
	      
	     
	}
}
