package cn.josh.cm.po;

/**
 * @Author: Josh.Wang
 * @Description:订单包装对象
 * @Date: Created in 14:16 2018/6/12
 * @Modified By:
 */
public class OrderQueryVo {

    private Order order;
    private OrderCustom orderCustom;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderCustom getOrderCustom() {
        return orderCustom;
    }

    public void setOrderCustom(OrderCustom orderCustom) {
        this.orderCustom = orderCustom;
    }
}
