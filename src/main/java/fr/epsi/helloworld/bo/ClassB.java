package fr.epsi.helloworld.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
    private ClassA classA;

    @Autowired
    @Lazy
    public ClassB(ClassA classA) {
        this.classA = classA;
        System.out.println("ClassB instance created");
    }
}
