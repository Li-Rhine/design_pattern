package com.geely.design.pattern.structural.proxy;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:17 2019/11/8
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    public int saveOrder(Order order) {
        //spring会自己注入，课程中就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
