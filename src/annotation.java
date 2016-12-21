//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  
int value(); 
String value1();
}  
  
//Applying annotation  
class Hello{  
@MyAnnotation(value=10,value1="Pranita")  
public void sayHello(){System.out.println("hello annotation");}  
}  
  
//Accessing annotation  
class anotation1{  
public static void main(String args[])throws Exception{  
  
Hello h=new Hello();  
Method m=h.getClass().getMethod("sayHello");  
  
MyAnnotation m1=m.getAnnotation(MyAnnotation.class);  
System.out.println("value is: "+m1.value()); 
System.out.println("name is: "+m1.value1());
}}  