package com.FileStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Readerwriter {
	public void writeToFile(String data) throws IOException {
		FileWriter write= new FileWriter("mybufferfile.txt");
		BufferedWriter buffer= new BufferedWriter(write);
		buffer.write(data);
		buffer.flush();
		write.close();
	}
	public String readFromFile() throws FileNotFoundException, IOException{
		FileReader reader = new FileReader("mybufferfile.txt");
		BufferedReader buffer = new BufferedReader(reader);
		char[] cstr= new char[20];
		buffer.read(cstr);
		return new String(cstr);
	}

	public static void main(String[] args) {
		Readerwriter obj= new Readerwriter();
		try {
			obj.writeToFile("Hello to buffer and file");
			String data= obj.readFromFile();
			System.out.println(data);
			}
		catch(FileNotFoundException e) {
			
		}
        catch(IOException e) {
			
		}

	}

}
