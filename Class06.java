package Java14;
import java.io.*;
public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			char data[]=new char[128]; 
			FileReader fr=new FileReader("c:\\java\\train.txt"); 
			int num=fr.read(data); 
			String str=new String(data,0,num); 
			System.out.println("Characters read= "+num); 
			System.out.println(str); 
			fr.close(); 
		} 
		catch(IOException e) { 
		}
	}

}
