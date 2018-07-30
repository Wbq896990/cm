package cn.josh.cm.po;

/**
 * @Author: Josh.Wang
 * @Description:订单包装对象
 * @Date: Created in 14:16 2018/6/12
 * @Modified By:
 */
public class OrdersQueryVo {

    private Orders orders;
    private OrdersCustom ordersCustom;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrdersCustom getOrdersCustom() {
        return ordersCustom;
    }

    public void setOrdersCustom(OrdersCustom ordersCustom) {
        this.ordersCustom = ordersCustom;
    }
}
