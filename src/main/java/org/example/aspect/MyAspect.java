package org.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* org.example.beans.Library.someLibraryMethod(..))")
    public void beforeSomeLibraryMethod() {
        System.out.println("Before calling someLibraryMethod");
    }

    @After("execution(* org.example.beans.Library.someLibraryMethod(..))")
    public void afterSomeLibraryMethod() {
        System.out.println("After calling someLibraryMethod");
    }
}
