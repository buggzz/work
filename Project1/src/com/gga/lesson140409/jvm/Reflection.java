package com.gga.lesson140409.jvm;

public class Reflection {

	public static void main(String[] args) {
		Object a = new A();
		
		Class clazz = a.getClass();
		
		System.out.println(clazz.getName());
		
		System.out.println(clazz.isAssignableFrom(B.class));
		System.out.println(clazz.isAssignableFrom(B.class));
		
		System.out.println(A.class.isAssignableFrom(A.class));
		
		System.out.println(B.class.isAssignableFrom(A.class));
		System.out.println(A.class.isAssignableFrom(B.class));
		System.out.println(A.class.isAssignableFrom(Object.class));

		System.out.println(Object.class.isAssignableFrom(A.class));
		System.out.println(Object.class.isAssignableFrom(B.class));
		
		System.out.println(clazz.isInstance(a));
		
		try {
			A c = (A) clazz.newInstance();
			System.out.println(c.getClass().getName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class b = Class.forName("com.gga.lesson140409.jvm.B");
			Object obj = b.newInstance();
			System.out.println(obj.getClass().getSimpleName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
