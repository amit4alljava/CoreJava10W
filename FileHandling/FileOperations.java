import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOperations {
	
	public static void fileCopier(String sourcePath,String dest) throws IOException{
		long startTime = System.currentTimeMillis();
		final int EOF = -1;
		File file = new File(sourcePath);
		if(file.exists()){
		FileInputStream fi = new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(fi,99999);
		FileOutputStream fo = new FileOutputStream(dest);
		BufferedOutputStream bo = new BufferedOutputStream(fo,99999);
		int singleByte = bi.read();
		while(singleByte!=EOF){
			//System.out.print((char)singleByte);
			bo.write(singleByte);
			singleByte = bi.read();
			
		}
		bi.close();
		bo.close();
		fi.close();
		fo.close();
		System.out.println("File Copy Done...");
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		}
	}
	
	public static void readFile(String filePath) throws IOException{
		final int EOF = -1;
		File file = new File(filePath);
		if(file.exists()){
		FileInputStream fi = new FileInputStream(file);
		int singleByte = fi.read();
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte = fi.read();
		}
		fi.close();
		}
	}
	
	public static boolean writeFile(String filePath, String data) throws IOException{
		FileOutputStream fout = new FileOutputStream(filePath,true);
		fout.write(data.getBytes());
		fout.close();
		return true;
	}

	public static void main(String[] args) throws IOException {
		fileCopier("E:\\TestingFileHandling\\abcd.dat", "E:\\TestingFileHandling\\xyz.dat");
		//readFile("D:\\JavaWeekEnd10to12\\FileHandling\\src\\FileOperations.java");
		//writeFile("E:\\TestingFileHandling\\Sample.txt", "Hello How are You");

	}

}
