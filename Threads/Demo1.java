// How to Create a Job
// 1. implements Runnable interface
// 2. extends Thread Class

class Account
{
	static void transaction(){
		System.out.println("Transaction Start..."+Thread.currentThread().getName());
		for(int i = 1; i<=5 ; i++){
			System.out.println("Processing.... "+i+" "+Thread.currentThread().getName());
		}
		System.out.println("Transaction Complete "+Thread.currentThread().getName());
	}
}
class Job implements Runnable{
	Account ac = new Account();
	@Override
	public  void run()
	{
		// Logic for MultiThreading
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println("Enter Pin No  "+Thread.currentThread().getName());
		System.out.println("Reading A/C Details "+Thread.currentThread().getName());
		System.out.println("A/C NO is "+Thread.currentThread().getName());
		System.out.println("Balance is "+Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			System.out.println("Transaction Start..."+Thread.currentThread().getName());
			for(int i = 1; i<=5 ; i++){
				System.out.println("Processing.... "+i+" "+Thread.currentThread().getName());
			}
			System.out.println("Transaction Complete "+Thread.currentThread().getName());
		}
		/*synchronized (ac) {
				ac.transaction();
		}*/
		/*synchronized (Account.class) {
			Account.transaction();
	}*/
		
	}
}
public class Demo1 {

	public static void main(String[] args) throws Exception{
		// Worker Create
		Job job = new Job();
		Thread worker1 = new Thread(job,"worker1");
		//Job job2 = new Job();
		Thread worker2 = new Thread(job,"worker2");
		worker1.setPriority(Thread.MAX_PRIORITY);
		//Thread.MIN_PRIORITY
		//Thread.NORM_PRIORITY
		//worker1.setDaemon(true);
		worker1.start();
		
		worker2.start();
		
		

	}

}
