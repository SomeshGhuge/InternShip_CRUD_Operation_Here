package Dependency_on;
//Dependency-on
//If one bean has a dependency on another bean called as depends-on concepts.

//Why?
//If class A is depends on B, class B depends on class c then
//we should go for dependency on concepts.Note- Mutual dependency
//is not allowed here 

public class A {
	public A() {
		System.out.println("A Object");
	}

}
