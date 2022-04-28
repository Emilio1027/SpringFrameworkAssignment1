package org.Assignment1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {
/*
Use XML to configure the spring container to achieve DI (Dependency injection),
later use Java Annotations and Java Configuration methods.
Beans are created in 2 ways, one is by using the
BenFactory(limited),the other one is using the
ApplicationContext(Larger enterprise applications)
 */

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = (Student) context.getBean("Student"); student.getId();
        System.out.println(student);;

    }
}
