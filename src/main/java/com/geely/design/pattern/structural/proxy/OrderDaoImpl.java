package com.geely.design.pattern.structural.proxy;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:19 2019/11/7
 */
public class OrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
