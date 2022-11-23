package com.example.doctor;

import java.util.ArrayList;

public class Demo {

	
	public static  ArrayList<Integer> al = new ArrayList<>();
	
	public void m1() {
		for(int i=0; i<10000000; i++) {
			al.add(i);
			System.out.println(al.get(i));
		}
		System.out.println(al);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo =new Demo();
		demo.m1();
        System.out.println("hi");
	}

}
