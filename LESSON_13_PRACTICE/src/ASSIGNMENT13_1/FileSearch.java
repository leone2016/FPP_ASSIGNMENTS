package ASSIGNMENT13_1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/**
//PSEUDO-CODE
boolean searchForFile(Object file, Object startDir) {
	Object[] fileSystemObjects =
						startDir.getContents();
	for(Object o: fileSystemObjects) {
		//base case
		if(isFile(o) && isSameFile(o,f)) {
			return true;
		}

		if(isDirectory(o)) {
			searchForFile(file, o);
		}
	}
	//file not found in startDir
	return false;
}
*/
public class FileSearch {
	static boolean found = false;
	static String discoveredText = null;

	public static boolean searchForFile(String filename, String startDir) {
		File dir = new File(startDir);

		if (!dir.exists() || !dir.isDirectory()) {
			return false;
		}

		for (File file : dir.listFiles()) {
			if (file.isFile() && file.getName().equals(filename)) {
				try {
					discoveredText = new String(Files.readAllBytes(file.toPath()));
					System.out.println(discoveredText);
					return true;
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			}

			if (file.isDirectory()) {
				if (searchForFile(filename, file.getAbsolutePath())) {
					return true;
				}
			}
		}

		return false;
	}
	
	

}
