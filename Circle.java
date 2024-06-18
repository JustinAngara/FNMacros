package com.fortnitetestcheats.main;

import java.util.ArrayList;
import java.util.List;

public class Circle {
	public static List[] DrawMeACircle(int posX, int posY, int radius) {
		List xArr = new ArrayList<Integer>();
		List yArr = new ArrayList<Integer>();
		
		for (int i = 0;i <= posX + radius; i++) {
	       for (int j = 1;j <=posY + radius; j++) {
	            int xSquared = (i - posX)*(i - posX);
	            int ySquared = (j - posY)*(j - posY);
	            if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
	                xArr.add(xSquared);
	                yArr.add(ySquared);
	            } 
	        }
	    }
		
		List[] arr = new List[2];
		arr[0] = xArr;
		arr[1] = yArr;
		return arr;
		
	}
	public static void main(String[] args) {
		HandleMouseOutput ho = new HandleMouseOutput();
		List[] test = DrawMeACircle(1280, 720, 5);
		for(int i = 0; i<test[0].size();i++) {
			int x = (int) test[0].get(i);
			int y = (int) test[1].get(i);
			ho.mouseMove(x,y);
		}
	}
}
