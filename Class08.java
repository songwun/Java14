package Java14;
import java.io.*;
public class Class08 {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr1=new FileReader("c:\\java\\aaa.txt"); 
		FileReader fr2=new FileReader("c:\\java\\bbb.txt"); 
		FileWriter fw=new FileWriter("c:\\java\\ccc.txt"); 
		BufferedReader bfr1=new BufferedReader(fr1); 
		BufferedReader bfr2=new BufferedReader(fr2); 
		BufferedWriter bfw=new BufferedWriter(fw); 
		String str; 
		while((str=bfr1.readLine())!=null) { 
			bfw.write(str); 
			bfw.newLine(); 
		} 
		while((str=bfr2.readLine())!=null) { 
			bfw.write(str); 
			bfw.newLine(); 
		} 
		 
		bfw.flush(); 
		fw.close(); 
		fr1.close(); 
		fr2.close();
	}

}
