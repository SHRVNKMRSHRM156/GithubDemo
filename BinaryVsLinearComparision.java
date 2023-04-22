package day6;
import java.util.Arrays;
public class BinaryVsLinearComparision {

	public static void main(String[] args) {
		int y[]= new int[50];
		for(int i=0; i<50; i++)
		{
			y[i]= (int)(Math.random()*100);
			System.out.print(" "+y[i]);
		}
			
		Arrays.sort(y);
		int s= y[(int)(Math.random()*50)];
		
		System.out.println("\nNumber to be searched is "+s);
		System.out.println("===========================Linear Search==========================");
		for(int i=0; i<y.length; i++)
		{
			if (y[i] == s)
			{
				System.out.println("Found. Number of Iterations: "+(i+1));
				break;
			}
		}
		
		System.out.println("============================Binary Search==========================");
		int f=0;
		int l= y.length -1;
		
		for (int i=0; f<=l; i++)
		{
			int mid= (f+l)/2;
			
			if(y[mid]==s)
			{
				System.out.println("Record Found. Number of Iterations: "+(i+1));
				break;
			}
			else if(y[mid]<s)
			{
				f=mid+1;
			}
			else
			{
				l=mid-1;
			}
		}
		if (f>l) System.out.println("Record Not Found");
	}

	}
