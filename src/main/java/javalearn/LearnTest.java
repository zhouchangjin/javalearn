package javalearn;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/**
 * When Retention is set to RUNTIME, the java reflection mechanism could correctly
 * get the annotation class from any annotated elements.
 * ���ȥ��Retention��һ�У��÷���͵ò�����ע�⡣
 */
public @interface LearnTest {

}
