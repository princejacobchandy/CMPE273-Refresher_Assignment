package javaRefresher;

class Thread1 extends Thread {
	public void show()
	{
		for(int i=1; i<=100; i++)
		{
		if((i%2)==0)
		{
		System.out.println("Even Number Queue: " + i);
		}
		/*try {
			Thread.sleep(1000);
				}
			catch(Exception e) {
				System.out.println(e);
				}*/
		}
	}
	
	@Override
	public void run()
	{
		show();
	}
}

