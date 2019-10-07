class lex 
{
	public static void main(String[] args) 
	{
		String s[]=new String["ruthvik","raa","faizan","prem"],temp="";
		int i=0,count=0,k=0;
		for(i=0;i<s.length-1;i++)
		{
         for(j=i+1;j<s.length;j++)
			{
		k=s[j].compareTo(s[i]);
		if(k>0){
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
			}
		}
		for(i=0;i<s.length;i++)
			System.out.println(s[i]);





	}
}
