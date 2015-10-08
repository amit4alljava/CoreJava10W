import java.io.File;
import java.io.IOException;


public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("E:\\TestingFileHandling\\aa\\bb\\cc\\dd\\ee");
		//dir.mkdir();
		dir.mkdirs();
		/*File file = new File("E:\\TestingFileHandling\\Test.mp3");
		if(file.exists()){
		System.out.println(file.getPath());
		System.out.println(file.isHidden());
		System.out.println(file.canWrite());
		file.setReadOnly();
			file.delete();
		
		}
		else{
		boolean isFileCreate = file.createNewFile();
		
		if(isFileCreate){
		System.out.println("File Created");
		}
		}*/
	}

}
