package com.ray.thinkinginjava.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 *
 */
@Documented
@Target(ElementType.TYPE)
@Inherited
public @interface Signature {
    String name() default "Ray Li";
    String team() default  "Personal Test";
    String project() default "Thinking In Java";
}
