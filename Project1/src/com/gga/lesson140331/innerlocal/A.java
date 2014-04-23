package com.gga.lesson140331.innerlocal;

public class A implements I, X {

	@Override
	public void doIt() {
			System.out.println("did it");
	}
	

//	@Override
//	public void getImplementorOfI() {
//		return this;
//
//	}


//	@Override
//	public void getImplementorOfI() {
//		
//		public void doIt() {
//		}
//		
//		
//	}
    
	public I getImplementorOfI() {
		return this;
	}

}
