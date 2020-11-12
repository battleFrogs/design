package com.gjc.responsibility;

// 责任链模式
public class Test {


    public static void main(String[] args) {

        NewbieProgrammer newbieProgrammer = new NewbieProgrammer();
        NormalProgrammer normalProgrammer = new NormalProgrammer();
        GoodProgrammer goodProgrammer = new GoodProgrammer();

        Bug easy = new Bug(20);
        Bug middle = new Bug(50);
        Bug hard = new Bug(100);

        newbieProgrammer.setNext(normalProgrammer);
        normalProgrammer.setNext(goodProgrammer);

        newbieProgrammer.handle(easy);
        newbieProgrammer.handle(middle);
        newbieProgrammer.handle(hard);
    }

}
