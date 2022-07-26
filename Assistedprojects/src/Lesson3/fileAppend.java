

package Lesson3;

import java.io.*;


public class fileAppend {

	public static void main(String[] args) {
		modifyFile("\"C:\\Javafsd\\javademos\\filehandling.txt\"");
		System.out.println("done");
	}

	static void modifyFile(String filePath) {
		File fileToBeModified = new File(filePath);
		FileWriter writer = null;
		try {
			writer = new FileWriter(fileToBeModified);
			writer.write("Welcomee");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}