package cn.josh.cm.service.impl;

import cn.josh.cm.mapper.OrdersMapper;
import cn.josh.cm.mapper.OrdersMapperCustom;
import cn.josh.cm.po.Orders;
import cn.josh.cm.po.OrdersCustom;
import cn.josh.cm.po.OrdersQueryVo;
import cn.josh.cm.service.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单service实现类
 * @Date: Created in 15:58 2018/6/12
 * @Modified By:
 */
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapperCustom ordersMapperCustom;
    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * @Author: Josh.Wang
     * @Param:ordersQueryVo 参数，orders包装对象
     * @Description:按条件查询订单列表方法
     * @Date: Created in 12:46 2018/6/13
     * @Modified By:
    */
    @Override
    public List<OrdersCustom> findOrdersList(OrdersQueryVo ordersQueryVo) throws Exception {
        return ordersMapperCustom.findOrdersList(ordersQueryVo);
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id查找订单信息
     * @Date: Created in 15:33 2018/6/13
     * @Modified By:
    */
    @Override
    public OrdersCustom findOrdersById(Integer id) throws Exception {
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        OrdersCustom ordersCustom = new OrdersCustom();
        BeanUtils.copyProperties(orders,ordersCustom);
        return ordersCustom;
    }


    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id，更新订单信息
     * @Date: Created in 15:33 2018/6/13
     * @Modified By:
    */
    @Override
    public void updateOrdersById(Integer id, OrdersCustom ordersCustom) throws Exception {
        ordersCustom.setId(id);
        ordersMapper.updateByPrimaryKey(ordersCustom);
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id删除订单
     * @Date: Created in 15:34 2018/6/13
     * @Modified By:
    */
    @Override
    public void deleteOrdersById(Integer id) throws Exception {
        ordersMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Author: Josh.Wang
     * @Param:ordersCustom
     * @Description:新建订单
     * @Date: Created in 15:35 2018/6/13
     * @Modified By:
    */
    @Override
    public void insertOrders(OrdersCustom ordersCustom) throws Exception {
        ordersMapper.insert(ordersCustom);
    }
}
