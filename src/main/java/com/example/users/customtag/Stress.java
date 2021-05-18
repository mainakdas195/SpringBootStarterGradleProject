package com.example.users.customtag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

/**
 * This tag can be used either in Class or method level
 * We can use more than one Tag for a custom annotation then it will be sub grouped
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("non-functional")
@Tag("stress")
public @interface Stress {
	
}
