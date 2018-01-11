package javalearn;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/**
 * When Retention is set to RUNTIME, the java reflection mechanism could correctly
 * get the annotation class from any annotated elements.
 * 如果去掉Retention这一行，用反射就得不到该注解。
 */
public @interface LearnTest {

}
