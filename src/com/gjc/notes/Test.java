package com.gjc.notes;

/**
 * 备忘录模式 ,回到某个时刻
 */
public class Test {

    public static void main(String[] args) {

        Player player = new Player();

        // 存档
        Note note = player.saveState();

        // 打Boss
        player.fightBoss();

        player.restoreState(note);

        System.out.println(player);

    }


}
