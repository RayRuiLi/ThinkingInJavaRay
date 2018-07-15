package com.ray.thinkinginjava.annotation;

@Signature
@Car
@Car
public class AnnotationSample {

    /**
     * Annotations have a number of uses, among them:
     * Information for the compiler — Annotations can be used by the compiler to detect errors or suppress warnings.
     * Compile-time and deployment-time processing — Software tools can process annotation information to generate code, XML files, and so forth.
     * Runtime processing — Some annotations are available to be examined at runtime.
     */

    public static void main(String[] args) {
        test(1);
        test(null);

//        System.out.println(AnnotationSample.class.getAnnotation(Signature.class).name());
    }

    public static void test(Integer a) {
        System.out.println(a);
    }

}


