package com.java.codes;
import java.util.Random;

public class ShuffleArrayElements 
{
	public static void main(String[] args) 
	{
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = numbers.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) 
        {
            int j = rand.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        System.out.println("Shuffled array:");
        for (int num : numbers) 
        {
            System.out.print(num + " ");
        }
	}
}

