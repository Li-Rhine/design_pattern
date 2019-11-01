package com.geely.design.pattern.structural.facade;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 15:05 2019/11/1
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private ShippingService shippingService = new ShippingService();

//    public void setQualifyService(QualifyService qualifyService) {
//        this.qualifyService = qualifyService;
//    }
//
//    public void setPointPaymentService(PointPaymentService pointPaymentService) {
//        this.pointPaymentService = pointPaymentService;
//    }
//
//    public void setShippingService(ShippingService shippingService) {
//        this.shippingService = shippingService;
//    }


    public void giftExchange(PointGift pointGift){
        if (qualifyService.isAvailable(pointGift)){
            //资格校验通过
            if (pointPaymentService.pay(pointGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功，订单号是："+shippingOrderNo);
            }
        }
    }
}
