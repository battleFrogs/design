package com.gjc.intermediary;

/**
 * 中介者模式
 */
public class Test {

    public static void main(String[] args) {

        Group group = new Group();
        Player player1 = new Player(group);
        Player player2 = new Player(group);
        Player player3 = new Player(group);
        Player player4 = new Player(group);
        player1.change(10);
        player2.change(5);
        player3.change(-2);
        player4.change(-13);

        System.out.println(player1.money + "," + player2.money + "," + player3.money + "," + player4.money + ",");

    }


}
