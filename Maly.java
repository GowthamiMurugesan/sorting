package guvi;

import java.util.Scanner;

public class Maly {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	int n=s.length();
	char ch;
	String op=" ";
	for(int i=0;i<n;i++)
	{
		ch=s.charAt(i);
		if(ch!=' ')
		{
			op=op+ch;
			s=s.replace(ch, ' ');
		}

	}
	System.out.println(op);
}

}


