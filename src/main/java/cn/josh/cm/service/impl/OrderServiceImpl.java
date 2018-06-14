package cn.josh.cm.service.impl;

import cn.josh.cm.mapper.OrderMapper;
import cn.josh.cm.mapper.OrderMapperCustom;
import cn.josh.cm.po.Order;
import cn.josh.cm.po.OrderCustom;
import cn.josh.cm.po.OrderQueryVo;
import cn.josh.cm.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单service实现类
 * @Date: Created in 15:58 2018/6/12
 * @Modified By:
 */
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapperCustom orderMapperCustom;
    @Autowired
    private OrderMapper orderMapper;

    /**
     * @Author: Josh.Wang
     * @Param:orderQueryVo 参数，order包装对象
     * @Description:按条件查询订单列表方法
     * @Date: Created in 12:46 2018/6/13
     * @Modified By:
    */
    @Override
    public List<OrderCustom> findOrderList(OrderQueryVo orderQueryVo) throws Exception {
        return orderMapperCustom.findOrderList(orderQueryVo);
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id查找订单信息
     * @Date: Created in 15:33 2018/6/13
     * @Modified By:
    */
    @Override
    public OrderCustom findOrderById(Integer id) throws Exception {
        Order order = orderMapper.selectByPrimaryKey(id);
        OrderCustom orderCustom = new OrderCustom();
        BeanUtils.copyProperties(order,orderCustom);
        return orderCustom;
    }


    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id，更新订单信息
     * @Date: Created in 15:33 2018/6/13
     * @Modified By:
    */
    @Override
    public void updateOrderById(Integer id, OrderCustom orderCustom) throws Exception {
        orderCustom.setId(id);
        orderMapper.updateByPrimaryKey(orderCustom);
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id删除订单
     * @Date: Created in 15:34 2018/6/13
     * @Modified By:
    */
    @Override
    public void deleteOrderById(Integer id) throws Exception {
        orderMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Author: Josh.Wang
     * @Param:orderCustom
     * @Description:新建订单
     * @Date: Created in 15:35 2018/6/13
     * @Modified By:
    */
    @Override
    public void insertOrder(OrderCustom orderCustom) throws Exception {
        orderMapper.insert(orderCustom);
    }
}
