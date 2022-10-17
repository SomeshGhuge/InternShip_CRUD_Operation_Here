package ByType;

public class Info {
	/*
	ByType-
	In this case, spring framework attempts to find out a bean in the 
	configuration file, whose bean id (policy) is matching with the
	 property type (categories.java private Policy policy) to be wired.  
	 If a bean found with class as property type then that class object 
	 will be injected into that property by calling setter injection.
	 
	   
	If no class found then that property remains un-wired, but never throws
	 any exception just like before.
	 
	 
	 Internal working of byType:--->
	 
     We called categories from Test.java [line number 14], then it will
      navigate to spring.xml file and check the bean id as categories, 
      also read the autowire=byType, so spring container will checks for
       the bean id with class attribute policy in xml file then navigate
        to Categories.java and check the policy type whether it is exactly
         matching then inserts policy objects into categories.
         
        Test.java we used to type cast to get our output.

Note- if we change bean id=p in spring.xml and select autowire=”byType”
 then wont get any error but in case of byName it will get error.

	 
*/

}
