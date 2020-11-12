package com.gjc.visit;

import com.gjc.visit.entity.Mike;
import com.gjc.visit.entity.Restaurant;

/**
 * 访问者模式
 * 两者对象的 交互互换。 被访者都会被调用其访问者方法， 其内部实现是否需要的
 */
public class Test {

    public static void main(String[] args) {


        Mike mike = new Mike();
        Restaurant restaurant = new Restaurant();
        restaurant.welcome(mike);

    }


}
