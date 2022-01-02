package Java14;
import java.io.*; 
public class Class11 {

	public static void main(String args[]) throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("c:\\java\\number.txt"); 
		byte data[]=new byte[fi.available()]; 
		int count=0; 
		 
		fi.read(data); 
		String str=new String(data); 
		System.out.println(str); 
		 
		char arr[]=str.toCharArray(); 
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='\r') 
				count++; 
		}
		
		System.out.println((count+1)+" lines read"); 
		fi.close(); 
	}

}
