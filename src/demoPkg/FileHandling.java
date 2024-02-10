package demoPkg;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");   //file connection
		File f = new File("./TestData/file.properties");
		
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("automation"));
		System.out.println(prop.get("url"));
		
	}

	public static void writedata() throws Exception
	{
		File f = new File("./TestData/abc.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is the forth line of the data");
		fw.flush();  //save
		fw.close();
		
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");   //file connection
		File f = new File("./TestData/xyz.txt");
		
		FileReader fr = new FileReader(f);
		
		int i = fr.read();  //116
		
		while(i!=-1)  
		{
			System.out.print((char)i);  //th
			
			i = fr.read();  //104
			
		}
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		FileHandling.readprop();
	}
}
