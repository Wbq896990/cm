package cn.josh.cm.service;

import cn.josh.cm.po.OrdersCustom;
import cn.josh.cm.po.OrdersQueryVo;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单service接口
 * @Date: Created in 15:57 2018/6/12
 * @Modified By:
 */
public interface OrdersService {
    //按条件查询订单记录
    List<OrdersCustom> findOrdersList(OrdersQueryVo ordersQueryVo)throws Exception;
    //根据id查询订单信息
    OrdersCustom findOrdersById(Integer id)throws Exception;
    //根据id更新订单信息
    void updateOrdersById(Integer id, OrdersCustom ordersCustom)throws Exception;
    //根据id删除订单
    void deleteOrdersById(Integer id)throws Exception;
    //新增订单
    void insertOrders(OrdersCustom ordersCustom)throws Exception;
}
