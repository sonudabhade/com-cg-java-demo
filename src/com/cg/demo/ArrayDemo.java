// for loop- fix number of iterations
// while loop - zero or more iterations
//do while loop- one or more iterations

// for = array elements, string, collection, streams
/*int [] arr = new int[10];
for (int i = 0; i< arr.length; i++)*/

/*While/do while = user inputs
 * 
 */

package com.cg.demo;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");

		int size = sc.nextInt();

		int[] arr = new int[size];
		int[] arr2 = {10, 20,30};

		System.out.println(arr.length);
		System.out.println(arr2);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter elements:");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}