package lab17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public static void writeToFile(String country, int pop) {
		String fileName = "countries.txt";
		Path path = Paths.get(fileName);
		File file = path.toFile();
		Country USA = new Country(country, pop);
		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				System.out.println("File was created successfully");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Something went wrong");
			}
		} else {
			System.out.println("File already exists!");
		}

		try {
			PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
			output.println(USA);
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Shits broke");
		}
	}

	public static void readFromFile() {
		String file = "countries.txt";
		Path filePath = Paths.get(file);

		File f = filePath.toFile();
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);

				line = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found...");

		} catch (IOException e) {
			System.out.println("Something crazy happened -- call someone who can help!");

		}
	}
}
