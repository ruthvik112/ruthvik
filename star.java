class star 
{
	public static void main(String[] args) 
	{
		int j=0,k=0,i=0;
		for( i=0;i<3;i++)
		{
			for(k=0;k<=i;k++)
				{
					System.out.print(" ");
				}
			for( j=4;j>i;j--)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0;i<7;i++)
			System.out.print(" ");
        System.out.print("*");
		System.out.println();

		for( i=0;i>3;i++)
		{
			for(k=4;k>=i;k--)
				{
					System.out.print(" ");
				}
			for( j=2;j<=4;j++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
