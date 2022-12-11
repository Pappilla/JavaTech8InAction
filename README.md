# JavaTech8InAction
Java is one of the most popular object oriented programming language. 
Java buzz words/features are: SSPORAPMIHDD

Simple
Secure
Portable
Object-oriented
Robust
Architecture-neutral (or) Platform Independent
Multi-threaded
Interpreted
High performance
Distributed
Dynamic

1.Simple means java program structure is simple and easy to understand. 

language C and object-oriented programming concepts are similar to C++. In a java programming language, many complicated features like pointers, operator overloading, structures, unions, etc. have been removed. One of the most useful features is the garbage collector it makes java more simple.

2.Secure
Java is said to be more secure programming language because it does not have pointers concept, java provides a feature "applet" which can be embedded into a web application. The applet in java does not allow access to other parts of the computer, which keeps away from harmful programs like viruses and unauthorized access.

3.Portable
Portability is one of the core features of java which enables the java programs to run on any computer or operating system. For example, an applet developed using java runs on a wide variety of CPUs, operating systems, and browsers connected to the Internet.

4.Object-oriented
Java is said to be a pure object-oriented programming language. In java, everything is an object. It supports all the features of the object-oriented programming paradigm. The primitive data types java also implemented as objects using wrapper classes, but still, it allows primitive data types to archive high-performance.

5.Robust
Java is more robust because the java code can be executed on a variety of environments, java has a strong memory management mechanism (garbage collector), java is a strictly typed language, it has a strong set of exception handling mechanism, and many more.

6.Architecture-neutral (or) Platform Independent
Java has invented to archive "write once; run anywhere, any time, forever". The java provides JVM (Java Virtual Machine) to to archive architectural-neutral or platform-independent. The JVM allows the java program created using one operating system can be executed on any other operating system.

7.Multi-threaded
Java supports multi-threading programming, which allows us to write programs that do multiple operations simultaneously.

8.Interpreted
Java enables the creation of cross-platform programs by compiling into an intermediate representation called Java bytecode. The byte code is interpreted to any machine code so that it runs on the native machine.

9.High performance
Java provides high performance with the help of features like JVM, interpretation, and its simplicity.

10.Distributed
Java programming language supports TCP/IP protocols which enable the java to support the distributed environment of the Internet. Java also supports Remote Method Invocation (RMI), this feature enables a program to invoke methods across a network.

11.Dynamic
Java is said to be dynamic because the java byte code may be dynamically updated on a running system and it has a dynamic memory allocation and deallocation (objects and garbage collector).
Java and Platform Independence
Build once, Run anywhere


What is ByteCode?
The executable instructions are different in different operating systems like windows, linux. So, there are different JVM s for different operating systems. A JVM for windows is different from a JVM for mac.
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

Datatypes:
Java programming language has a rich set of data types. The data type is a category of data stored in variables. In java, data types are classified into two types and they are as follows.

Primitive Data Types
Non-primitive Data Types

primitive data types includes byte, short, int, long, float, double  --> 0, char, and boolean(false/true).

non-primitive data types are String, Array, List, Queue, Stack, Class, Interface, etc.


‐---------------


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
