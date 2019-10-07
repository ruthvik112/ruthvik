import java.util.Scanner;
class date 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x[]=new int[12],max[]=new int[12],i=0,k=0,p=0,l=0;
		int  s=0;
		for(i=0;i<12;i++)
			x[i]=sc.nextInt();
         for(i=0;i<12;i++)
		{
			 max[i]=0;
			 if((i+1)<12)
			{
			 if(x[i+1]>x[i])
				 max[i]=x[i+1];
			}
		}
		for(i=0;i<12;i++)
			System.out.print(max[i]);

	}
}
