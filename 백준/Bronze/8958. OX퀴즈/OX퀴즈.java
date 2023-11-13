import java.util.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	
	    int TC = Integer.parseInt(sc.nextLine());
	
	
	    for(int i=0; i<TC; i++) {
		    String ox;
		    if(i == TC-1) {
			    ox = sc.next();
		    } else {
			    ox = sc.nextLine();
		    }
		
		    int cnt = 0;
		    int sum = 0;
		    //System.out.println("i :" + i);
		
		    for(int j=0; j<ox.length(); j++) {
			    //System.out.println("charAt "+ j + ":" +ox.charAt(j));
			    if(ox.charAt(j)=='O') {
				    cnt++;
			    }else {
				    cnt = 0;
			    }
			    sum += cnt;
		    }
		    System.out.println(sum);
		    //System.out.println("뒤의 i" + i);
		
	    }
    }
}