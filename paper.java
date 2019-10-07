import java.util.Scanner;

class paper 
{
	public static void main(String[] args) 
	{
      int x=0,y=0,z=0,s=0,m=0,c=0,pro=0,i=0,k=0;
	  double l=0.0,mul=0.0,res=0.0;
	  String w=" ",p=" ";
	  Scanner sc=new Scanner(System.in);
	  x=sc.nextInt();
	  s=sc.nextInt();
	  y=sc.nextInt();
	  m=sc.nextInt();
	  z=sc.nextInt();
	  c=sc.nextInt();
	  w=sc.nextLine();
	  p=sc.nextLine();
	  System.out.println(x*y*z);
	  k=s+m+c;
	  l=k/3.0;
	  pro=1;
	  for(i=x;i>1;i--)
		  pro=pro*i;
	  mul=1;
	  for(i=1;i<=s;i++)
		  mul=mul*i;
	  res=pro/mul;
	  System.out.println(res);
	  
      pro=1;
	  for(i=(y-m);i>1;i--)
		  pro=pro*i;
	  res*=pro;
       System.out.println(res);
      pro=1;
	  for(i=(z-c);i<z;i++)
		  pro=pro*i;
	  res*=pro;

	  System.out.println(res+1);

	  

	}
}
