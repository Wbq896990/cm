package cn.josh.cm.mapper;

import cn.josh.cm.po.OrdersCustom;
import cn.josh.cm.po.OrdersQueryVo;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单mapper接口
 * @Date: Created in 16:05 2018/6/12
 * @Modified By:
 */
public interface OrdersMapperCustom {
    List<OrdersCustom> findOrdersList(OrdersQueryVo ordersQueryVo)throws Exception;

    List<OrdersCustom> findSpecialOrdersList(OrdersQueryVo ordersQueryVo) throws Exception;
}
