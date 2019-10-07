import java.util.*;
class bottle 
{
	public static void main(String[] args) 
	{
		int n=0,i=0,j=0,count=0;
		
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
		if(n<100000&&n>=1)
		{
		count=n;
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(i=0;i<n;i++)
			{
			b[i]=sc.nextInt();
			if(b[i]>=1&&b[i]<=Math.pow(10,18))
				a[i]=b[i];
			}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[j]>a[i])
				{
                 count--;
				break;
				}
			}
		}

		System.out.println(count);
		}
	}
}
