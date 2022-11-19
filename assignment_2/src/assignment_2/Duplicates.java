package assignment_2;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		 boolean flag = false;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Kindly enter the lenght of the array :");
		 int l= scan.nextInt();
		 int[] a = new int[l];
		
		 System.out.println("Kindly enter the values");
		 
		 for(int i=0; i<a.length;i++) {
		
			 a[i]=scan.nextInt();

	}
		 System.out.println("Values entered are : ");
		 for(int i=0; i<a.length;i++) {
				
			 System.out.println(a[i]);
		
	}
		 System.out.println("Duplicate elements are :");
		 for(int k=0; k<a.length;k++){
			 
			 for(int j=k+1;j<a.length;j++) {
				 if(a[k]==a[j] && k!=j) {
					 System.out.println(a[j]);
					 flag = true;
					 
				 }
			 }
			 
		 }
		 if (flag == false)
		 System.out.print("None");

}
	
}
