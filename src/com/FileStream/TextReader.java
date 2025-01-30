package com.FileStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class TextReader {
	public void writeToFile(String text) throws IOException {
		FileWriter writer= new FileWriter("mytxtfile.txt");
		writer.write(text);
		writer.flush();
		writer.close();
	}
	public String readFromFile() throws FileNotFoundException, IOException{
		FileReader reader = new FileReader("mytxtfile.txt");
		char[] cstr= new char[20];
		reader.read(cstr);
		return new String(cstr);
	}

	public static void main(String[] args) {
		TextReader txt= new TextReader();
		try {
			txt.writeToFile("Hello from program");
			String str= txt.readFromFile();
			System.out.println(str);
			}
		catch(IOException e) {
			
		}

	}

}
