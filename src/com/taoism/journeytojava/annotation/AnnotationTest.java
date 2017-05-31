package com.taoism.journeytojava.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Date: 2017-05-27
 * Time: 17:05
 * Author: cf
 * -----------------------------
 */

public class AnnotationTest {


    @NewAnnotation
    public static void main(String[] args) {
        try {

            Method method1 = AnnotationTest.class.getMethod("main", String[].class);


            Annotation[] annotations1 = method1.getAnnotations();
            for (Annotation annotation : annotations1) {
                System.out.println(annotation.annotationType());
            }


            Class<?> threadClazz = Class.forName("com.taoism.journeytojava.annotation.AnnotationTest");
            Method method2 = threadClazz.getMethod("main", String[].class);

                        Annotation[] annotations2 = method2.getAnnotations();
            for (Annotation annotation : annotations2) {
                System.out.println(annotation.annotationType());
            }


            AnnotationTest annotationTest = new AnnotationTest();
            Method method3 = annotationTest.getClass().getMethod("main", String[].class);

            Annotation[] annotations3 = method3.getAnnotations();
            for (Annotation annotation : annotations3) {
                System.out.println(annotation.annotationType());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @NewAnnotation
    public static void hello() {

    }

}
