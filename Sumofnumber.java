package guvi;

import java.util.Scanner;

public class Sumofnumber {
public static void main(String[] args) {
	//Scanner in=new Scanner(System.in);
Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	
	int b=a,sum=0;
	int c=a,d;
	int len=0;
	while(a>0){
		a=a/10;
		++len;
	}
	int g=1;
	while(b>0){
		d=b%10;
		b=b/10;
		sum=sum+d*g;
		++g;
	}
	System.out.println(sum);

}

}




