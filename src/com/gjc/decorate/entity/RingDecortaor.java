package com.gjc.decorate.entity;

/**
 * 装饰模式
 */
public class RingDecortaor implements IBeauty {

    // 给原来的我添加上装饰
    private final IBeauty me;

    public RingDecortaor(IBeauty me) {
        this.me = me;
    }

    @Override
    public int getBeautyValue() {
        return me.getBeautyValue() + 20;
    }
}
