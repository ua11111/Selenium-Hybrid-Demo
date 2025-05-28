package Com28Minutes;

import java.util.ArrayList;

public class Unique2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,5,5,5,8,4,9,8,0,4};
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
					
				{
					
					k++;
				}
			System.out.println(a[i]);
			System.out.println(k);
			
			}
			
		}
	}

}
