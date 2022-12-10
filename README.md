# JavaTech8InAction
Skip to content

Java and Platform Independence
Build once, Run anywhere
Java is one of the most popular platform independent languages. Once we compile a java program and build a jar, we can run the jar (compiled java program) in any Operating System where a JVM is installed.
What is ByteCode?
The executable instructions are different in different operating systems. So, there are different JVM s for different operating systems. A JVM for windows is different from a JVM for mac.
JDK vs JVM VS JRE
JVM
Virtual machine that run the Java bytecode.
Makes java portable.
JRE
JVM + Libraries + Other Components (to run applets and other java applications)
JDK
JRE + Compilers + Debuggers
Classloaders and Types
A Java program is made up of a number of custom classes (written by programmers like us) and core classes (which come pre-packaged with Java). When a program is executed, JVM needs to load the content of all the needed class. JVM uses a ClassLoader to find the classes.
System Class Loader : Loads all classes from CLASSPATH
Extension Class Loader : Loads all classes from extension directory
Bootstrap Class Loader : Loads all the Java core files
When JVM needs to find a class, it starts with System Class Loader. If it is not found, it checks with Extension Class Loader. If it not found, it goes to the Bootstrap Class Loader. If a class is still not found, a ClassNotFoundException is thrown.
Language Basics
Why do we need Wrapper Classes?
Example 1
A wrapper class wraps (encloses) around a data type and gives it an object appearance
Wrapper: Boolean,Byte,Character,Double,Float,Integer,Long,Short
Primitive: boolean,byte,char ,double, float, int , long,short
Examples of creating wrapper classes are listed below.
Integer number = new Integer(55);//int;
Integer number2 = new Integer("55");//String
Float number3 = new Float(55.0);//double argument
Float number4 = new Float(55.0f);//float argument
Float number5 = new Float("55.0f");//String
Character c1 = new Character('C');//Only char constructor
Boolean b = new Boolean(true);
Reasons
null is a possible value
use it in a Collection
Object like creation from other types.. like String
Are instances of Wrapper Classes Immutable?
What is Immutability?
Wrapper classes are final and immutable.
What is Auto Boxing?
	// Auto Boxing
	Integer ten = 10;//new Integer(10);
	ten++;// allowed. Java does had work behind the screen for us
Boxing and new instances - Auto Boxing helps in saving memory by reusing already created Wrapper objects. However wrapper classes created using new are not reused.
		// Two wrapper objects created using new are not same object
		Integer nineA = new Integer(9);
		Integer nineB = new Integer(9);
		System.out.println(nineA == nineB);// false
		System.out.println(nineA.equals(nineB));// true

		// Two wrapper objects created using boxing are same object
		Integer nineC = 9;
		Integer nineD = 9;
		System.out.println(nineC == nineD);// true
		System.out.println(nineC.equals(nineD));// true
Strings
Are String's immutable?
		//Strings are immutable
		String str3 = "value1";
		str3.concat("value2");
		System.out.println(str3); //value1
		
		//The result should be assigned to a new reference variable (or same variable) can be reused.
		String concat = str3.concat("value2");
		System.out.println(concat); //value1value2
Where are string literals stored in memory?
All strings literals are stored in "String constant pool". If compiler finds a String literal,it checks if it exists in the pool. If it exists, it is reused. Following statement creates 1 string object (created on the pool) and 1 reference variable.

String str1 = "value"; 
However, if new operator is used to create string object, the new object is created on the heap. Following piece of code create 2 objects.

//1. String Literal "value" - created in the "String constant pool"
//2. String Object - created on the heap
String str2 = new String("value");
String vs StringBuffer vs StringBuilder
Immutability : String
Thread Safety : String(immutable), StringBuffer
Performance : StringBuilder (especially when a number of modifications are made.)
