import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<N; i++) {
			String str = bf.readLine();
			
			String[] arr = str.split(" ");
			String answer = "";
			
			for(int j=arr.length-1; j>=0; j--) {
				answer += arr[j] + " ";
			}
			
			System.out.println("Case #" + (i+1) + ": " +answer);
        }
    }
}