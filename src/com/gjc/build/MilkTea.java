package com.gjc.build;


/**
 * 要生产的东西
 */
public class MilkTea {

    private String type; // 类型
    private String size; // 大中小
    private boolean ice; // 冰块

    private MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.ice = builder.ice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }


    // 建造者 ，对自己母类进行建造各个参数 ，且通过链式的形式
    public static class Builder {

        private String type;
        private String size;
        private boolean ice;

        public Builder() {
        }


        public Builder type(String type) {
            this.type = type;
            return this;

        }


        public Builder size(String size) {
            this.size = size;
            return this;
        }


        public Builder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }
    }


    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", ice=" + ice +
                '}';
    }
}
