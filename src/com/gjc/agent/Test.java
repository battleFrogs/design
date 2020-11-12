package com.gjc.agent;

import com.gjc.agent.entity.IPerson;
import com.gjc.agent.entity.Person;
import com.gjc.agent.entity.PersonProxy;

public class Test {

    public static void main(String[] args) {

        PersonProxy personProxy = new PersonProxy();
        personProxy.eat();
        personProxy.sleep();

    }

}
