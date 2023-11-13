import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    int C = sc.nextInt();
	    String mul = Integer.toString(A * B * C);
	    //System.out.println(mul);
	    for(int i=0; i<=9; i++) {
		    int cnt = 0;
		    for(int j=0; j<mul.length(); j++) {
			    if(i == Character.getNumericValue(mul.charAt(j)) ) {
				    cnt++;
				    //System.out.println("mul: :"+mul.charAt(i));
			    }
		    }
		    System.out.println(cnt);
	    }
    }
}