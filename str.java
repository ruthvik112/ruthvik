import java.util.Scanner;
class str
{public static void main(String[] args)
  {int n=0,q=0,k=0,count=0,i=0,j=0;
    String s="";
    BufferedReader sc=new Scanner(System.in);
    n=sc.nextInt();
	s=new BufferedReader
	s=s.toLowerCase();
    q=sc.nextInt();
	int a[]=new int[q];
	for(i=0;i<q;i++)
		a[i]=sc.nextInt();
    for(i=0;i<q;i++)
    {count=0;
      k=a[i];
      for(j=0;j<k-1;j++)
      {if(s.charAt(j)==s.charAt(k-1))
          count++;}
      System.out.println(count);
	  System.out.println();
    }
  }
}