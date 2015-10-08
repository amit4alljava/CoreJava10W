import java.io.File;
import java.util.Date;


public class DirCommandDemo {

	public static void main(String[] args) {
		File file = new File("E:\\TestingFileHandling");
		/*String allFiles[] = file.list();
		for(String f : allFiles){
			System.out.println(f);
		}*/
		String type = "";
		int fileCounter = 1;
		File allFiles[] = file.listFiles();
		for(File f : allFiles){
			Date date = new Date(f.lastModified());
			if(f.isDirectory()){
				type="<DIR>";
			}
			else
			if(f.isFile()){	
				type="<FILE>";
				//f.delete();
				File newFile = new File("E:\\TestingFileHandling\\Virus"+fileCounter+".virus");
				fileCounter++;
				f.renameTo(newFile);
			}
			System.out.println(type+" "+f.getName()+" "+f.getPath()+" "+date);
			
		}
		

	}

}
