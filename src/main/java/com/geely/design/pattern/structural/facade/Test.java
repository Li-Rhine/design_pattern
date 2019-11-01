package com.geely.design.pattern.structural.facade;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 15:36 2019/11/1
 */
public class Test {

    public static void main(String[] args) {
        PointGift pointGift = new PointGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointPaymentService(new PointPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointGift);
    }
}
