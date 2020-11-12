package com.gjc.iteration;

import com.gjc.iteration.entity.MyList;

/**
 * 迭代模式
 */
public class Test {

    public static void main(String[] args) {

        MyList myList = new MyList();
        while (myList.hasNext()) {
            String next = myList.next();
            System.out.println(next);
        }


    }

}
