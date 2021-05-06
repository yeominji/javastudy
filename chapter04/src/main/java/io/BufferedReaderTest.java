package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			// 기반 스트림
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			String line = null;

			int index = 0;
			while ((line = br.readLine()) != null) {
				index++;
				System.out.print(index);
				System.out.print(":");
				System.out.print(line);
				System.out.print("\n");
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}