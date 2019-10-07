import java.util.*;
class war 
{
	public static void main(String[] args) 
	{
		int n,i,j,q,s1,s2,a,b,d,k,l;
		
		Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();
		q=sc.nextInt();
		int x1[]=new int[q];
		int x2[]=new int[q];
		int y1[]=new int[q];
		int y2[]=new int[q];
		for(i=0;i<q;i++)
		{
			x1[i]=sc.nextInt();
			y1[i]=sc.nextInt();
			x2[i]=sc.nextInt();
			y2[i]=sc.nextInt();
			
		}
		    s1=sc.nextInt();
			s2=sc.nextInt();
			Arrays.sort(x1);
			Arrays.sort(y1);
			Arrays.sort(x2);
			Arrays.sort(y2);

			for(i=0;i<q;i++)
		{
				if((s1-x1[i])<min))
					minx=x1[i];
				if((s2-x2[i]<min))
					miny=x2[i];
		}

			
	}
}
