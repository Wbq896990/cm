package cn.josh.cm.service;

import cn.josh.cm.po.OrderCustom;
import cn.josh.cm.po.OrderQueryVo;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单service接口
 * @Date: Created in 15:57 2018/6/12
 * @Modified By:
 */
public interface OrderService {
    //按条件查询订单记录
    List<OrderCustom> findOrderList(OrderQueryVo orderQueryVo)throws Exception;
    //根据id查询订单信息
    OrderCustom findOrderById(Integer id)throws Exception;
    //根据id更新订单信息
    void updateOrderById(Integer id, OrderCustom orderCustom)throws Exception;
    //根据id删除订单
    void deleteOrderById(Integer id)throws Exception;
    //新增订单
    void insertOrder(OrderCustom orderCustom)throws Exception;
}
