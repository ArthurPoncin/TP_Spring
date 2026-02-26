package fr.epsi.helloworld.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    private ClassB classB;

    @Autowired
    public ClassA(ClassB classB) {
        this.classB = classB;
        System.out.println("ClassA instance created");
    }
}
