package guvi;

import java.util.Scanner;

public class Sortingpro {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
	 String num1=in.nextLine();
	int num=Integer.parseInt(num1);       
     int r;
     int a[]=new int[10];
     int b;
     int i=0; 
     while(num>0)
     {    	   
  	   r=num%10;
  	   a[i]=r;
  	   num=num/10;
  	   i++;    	   
     }       
     for( i=0;i<num1.length();i++)
     {    
  	   for(int j=i+1;j<num1.length();j++)
  	   {
  	   if(a[i]>a[j])
  	   {
  		   b=a[i];
  		  a[i]=a[j];
  		  a[j]=b;    		   
  	   }
  	   } 
  	   System.out.println(a[i]);
     } 
     System.out.println("Enter the number of digits to delete");
     int k=in.nextInt();
    for(int j=0;j<num1.length()-k;j++)
     {
  	   System.out.print(a[j]);
     }
	}}