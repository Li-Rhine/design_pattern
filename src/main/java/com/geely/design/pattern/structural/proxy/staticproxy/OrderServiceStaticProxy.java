package com.geely.design.pattern.structural.proxy.staticproxy;

import com.geely.design.pattern.structural.proxy.IOrderService;
import com.geely.design.pattern.structural.proxy.Order;
import com.geely.design.pattern.structural.proxy.OrderServiceImpl;
import com.geely.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:29 2019/11/8
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    int saveOrder(Order order){
        beforeMethod();
        iOrderService = new OrderServiceImpl();

        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter +"】 处理数据");

        //设置dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        afterMethod();
        return iOrderService.saveOrder(order);
    }


    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 before code");
    }
}
