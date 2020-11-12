package com.gjc.responsibility;

public class NormalProgrammer extends Programmer {

    @Override
    void handle(Bug bug) {
        if (bug.value > 20 && bug.value <= 50) {
            solve(bug);
        } else if (next != null) {
            next.handle(bug);
        }
    }

    private void solve(Bug bug) {
        System.out.println("普通程序员解决一个难度为" + bug.value + "的bug");
    }
}
