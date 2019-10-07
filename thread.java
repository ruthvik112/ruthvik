class m1 extends Thread
{
	int i=0;
	public void run(){
		try{
		for(i=0;i<2;i++)
		{

			System.out.println("good morning");
			Thread.sleep(3000);
		}
	}
	catch(InterruptedException e){
		System.out.println("interrupted");
	}
	}

}
class m2 extends Thread
{
	int i=0;
	public void run(){
		try{

		for(i=0;i<2;i++)
		{
			Thread.sleep(1000);
			System.out.println("hello");
			//Thread.sleep(2000);
		}
	}
	catch(InterruptedException e){
		System.out.println("interrupted");
	}
	}

}
class m3 extends Thread
{
	int i=0;
	public void run(){
		try
		{
	
		for(i=0;i<2;i++)
		{
			Thread.sleep(2000);
			System.out.println("welcome");
			//Thread.sleep(3000);
		}
}
	   catch(InterruptedException e){
		System.out.println("interrupted");
	   }
}
}


class thread 
{
	public static void main(String[] args) 
	{

		m1 t1=new m1();
		m2 t2=new m2();
		m3 t3=new m3();
		t1.start();
		//t1.sleep(100);
		t2.start();
		//t2.sleep(200);
		t3.start();
		//t3.sleep(300);
	}
}
