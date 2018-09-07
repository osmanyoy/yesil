package com.yapikredi.training.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileMain {
	public static void main(String[] args) {
		File myFile = new File("file1.txt");
		byte[] bytes = new byte[1024];
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(myFile);
			int read = fileInputStream.read(bytes);
			System.out.println(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (Exception e2) {
				}
			}
		}

		try {
			FileReader fileReader = new FileReader(myFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String readLine = null;
			do {
				readLine = bufferedReader.readLine();
				System.out.println(readLine);
			} while (readLine != null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			List<String> readAllLines = Files.readAllLines(Paths.get("file1.txt"));
			System.out.println("----------------");
			System.out.println(readAllLines);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
