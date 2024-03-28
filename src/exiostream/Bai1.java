package exiostream;

import java.io.File;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		String path;
		System.out.println("nhap duong dan file: ");
		Scanner sc = new Scanner(System.in);
		path = sc.next();
		File f = new File(path);
		System.out.println("kich co file: "+ f.length());
	}
}
