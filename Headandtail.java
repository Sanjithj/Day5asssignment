package com.bridgelabzz;
import java.util.Random;

public class Headandtail
    {
	 	   public String chanceFunc()
	   {
	      Random r = new Random();
	      int chance = r.nextInt(2);
	      if (chance == 1)
	      {
	         return"tails";
	      } 
	      else
	      {
	         return"heads";
	      }
	   } 
	}
class demo
	
	{
	
	   public static void main(String[] args) {
	      Headandtail h = new Headandtail();
	      int heads = 0;
	      int tails = 0;
	      int chances = 10;
	      for (int i = 1; i<= chances; i++) {
	         if (h.chanceFunc().equals("tails")) {
	            tails++;
	         } else {
	            heads++;
	         }
	      }
	      System.out.println("Chances = " + chances);
	      System.out.println("Heads: " + heads);
	      System.out.println("Tails: " + tails);
	   }
	}
	
