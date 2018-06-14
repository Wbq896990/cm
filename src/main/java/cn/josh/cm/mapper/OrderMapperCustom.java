package cn.josh.cm.mapper;

import cn.josh.cm.po.OrderCustom;
import cn.josh.cm.po.OrderQueryVo;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单mapper接口
 * @Date: Created in 16:05 2018/6/12
 * @Modified By:
 */
public interface OrderMapperCustom {
    List<OrderCustom> findOrderList(OrderQueryVo orderQueryVo)throws Exception;
}
