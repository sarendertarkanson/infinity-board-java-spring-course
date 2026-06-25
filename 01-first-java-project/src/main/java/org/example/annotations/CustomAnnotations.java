package org.example.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();

    String date() default "unknown";
}

@Author(name = "John Doe")
class Project {

    public void start() {
        System.out.println("The project has started");
    }

}

public class CustomAnnotations {
    public static void main(String[] args) {
        Class<Project> projectClass = Project.class;

        if (projectClass.isAnnotationPresent(Author.class)) {
            Author author = projectClass.getAnnotation(Author.class);
            System.out.println(author.name());
            System.out.println(author.date());
        }
    }
}
