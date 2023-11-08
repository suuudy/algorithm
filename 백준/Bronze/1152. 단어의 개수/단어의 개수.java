import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine().trim();
		String words[] = str.split(" ");
		
		if(words[0].equals("")) {
			System.out.println(words.length-1);
		} 
		else if(words.length == 0) {
			System.out.println(0);
		}
		
		else {
			System.out.println(words.length);
		}
    }
}