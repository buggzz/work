package com.gga.lesson140428.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class A {
	
	@MyAnno(str = "Example")
	@What(description = "This is second annotation")
	@That("hello")
	@Marker
	
    public static void myMethod() {
    	Class clazz = A.class;
    	try {
			Method method = clazz.getMethod("myMethod");
			MyAnno anno = method.getAnnotation(MyAnno.class);
			System.out.println("Str = " + anno.str() + ", val = " + anno.val());
			
			for (Annotation annotation : method.getAnnotations()) {
				System.out.println(annotation);
			}
			
			System.out.println("marker annotation present = " + method.isAnnotationPresent(Marker.class));
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
    }
	
	public static void main(String[] args) {
		myMethod();
	}
	
	
}
