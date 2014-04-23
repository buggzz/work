package com.gga.lesson140303;

public class ComplexState {
   private int state1;
   private int state2;
   
   public void setState(int state) {
	   state1 = state;
	   state2 = state >> 1;
   }
   
   public boolean setState2 (int state) {
	   if (state > state1) {
		   return false;
	   } else {
		   state2 = state;
		   return true;
	   }
   }
}
