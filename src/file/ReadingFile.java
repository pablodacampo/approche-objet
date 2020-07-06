package file;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class ReadingFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/PabTemp/Projects/Diginamic/04. Java/Object Oriented/recensement population 2016.csv");
			List<String> lines = FileUtils.readLines(file, "UTF-8");
			for (String line : lines) {
				System.out.println(line);
			}
			System.out.println("Number of lines : " + lines.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
