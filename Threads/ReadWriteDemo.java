import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadWriteJob implements Runnable{
	private String fileName;
	ReadWriteJob(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void run() {
		// Read and Write
		System.out.println("JOb Start.. .. "+Thread.currentThread().getName());
		try {
			FileInputStream fi = new FileInputStream("E:\\TestingFileHandling\\abcd.dat");
			FileOutputStream fo = new FileOutputStream("e:\\TestingFileHandling\\"+fileName);
			int singleByte = fi.read();
			while(singleByte!=-1){
				fo.write(singleByte);
				singleByte = fi.read();
			}
			fi.close();
			fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("JOb End.. .. "+Thread.currentThread().getName());
		
		
	}
	
}
public class ReadWriteDemo {

	public static void main(String[] args) {
		ReadWriteJob job1 = new ReadWriteJob("Temp1.dat");
		ReadWriteJob job2 = new ReadWriteJob("Temp2.dat");
		ReadWriteJob job3 = new ReadWriteJob("Temp3.dat");
		Thread worker1 = new Thread(job1,"Worker1");
		Thread worker2 = new Thread(job2,"Worker2");
		Thread worker3 = new Thread(job3,"Worker3");
		worker1.start();
		worker2.start();
		worker3.start();
		

	}

}
