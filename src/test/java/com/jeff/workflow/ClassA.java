package com.jeff.workflow;

public class ClassA {
    private ClassB classB;

    public ClassA(ClassB classB){
        this.classB = classB;
    }

    public void doSomeThing(){
        classB.exec();
        System.out.println("do something here");
    }
}
