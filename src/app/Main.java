package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.println("Method Name: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
            }
            System.out.println("-----------------------------");
        }
    }
}