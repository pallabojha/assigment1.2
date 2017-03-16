/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Chake {
    public static void main(String[] args) {
		int a=20;
		int b=10;
		
		
		b= a-- - --a;
		System.out.println("the result B is:" +b+"\n");
		int c=a--;
		System.out.println("the result C is:" +c+"\n");
		int d=a>>2;
		System.out.println("the result D is:" +d+"\n");
		int e=a&b;
		System.out.println("the result e is:" +e);

	}
}
