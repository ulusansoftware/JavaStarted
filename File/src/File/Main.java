package File;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("kod.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		String val = "Ulusan Software ! ";

		FileWriter fWriter = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(val);
		bWriter.write("\n Java Dersleri");
		bWriter.close();

		FileReader fReader = new FileReader(file);
		String line;

		BufferedReader bReader = new BufferedReader(fReader);

		while ((line = bReader.readLine()) != null) {
			System.out.println(line);
		}

		bReader.close();
	}

}
