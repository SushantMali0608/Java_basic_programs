package patterns;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*****
//****
//***
//**
//*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows number");
		int rows = sc.nextInt();
		System.out.println("Enter column number");
		int cols = sc.nextInt();
		for (int i = 0; i < rows; i++)
		{
			for (int j=0;j<cols; j++) {
				System.out.print("* ");
			}
			cols=cols-1;
			System.out.println();
		}

	}

}
