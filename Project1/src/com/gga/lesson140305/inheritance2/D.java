package com.gga.lesson140305.inheritance2;

import com.gga.lesson140305.C;

public class D extends C {
     C c = new C();
     
     public void doIt() {
    	 changeState();
     }
     
     public int getState() {
    	 return _state;
     }
     
     public static void main(String[] args) {
    	 D d = new D();
    	 System.out.println(d.getState());
    	 d.doIt();
    	 System.out.println(d.getState());
     }
     
}
