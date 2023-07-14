package gayathri;

import java.util.Scanner;

public class MAX {

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				int ar[]=new int[3];
				int count=0;
				int max=Integer.MIN_VALUE;
				for(int m=0;m<3;m++) 
				{
					ar[m]=sc.nextInt();
						
				}
				
				for(int m=0;m<3;m++) 
				{
					
				if(ar[m]>max)
				{
				max=ar[m];
					}
				}
					for(int m=0;m<3;m++) 
					{
						
					
					if(ar[m]==max) 
					{
						count++;
					}
					
					
				}
				
					System.out.println(3-count);
	}

}
