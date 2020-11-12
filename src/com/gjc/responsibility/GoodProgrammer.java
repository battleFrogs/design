package com.gjc.responsibility;

public class GoodProgrammer extends Programmer {


    @Override
    void handle(Bug bug) {
        if (bug.value > 50 && bug.value <= 100) {
            solve(bug);
        } else if (next != null) {
            next.handle(bug);
        }
    }

    private void solve(Bug bug) {
        System.out.println("优秀程序员解决一个难度为" + bug.value + "的bug");

    }
}
