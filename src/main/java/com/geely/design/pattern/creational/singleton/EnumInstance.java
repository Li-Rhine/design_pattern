package com.geely.design.pattern.creational.singleton;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:07 2019/10/25
 */
public enum EnumInstance {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("Geely Print Test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
