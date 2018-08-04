package cn.josh.cm.controller;

import cn.josh.cm.po.OrdersCustom;
import cn.josh.cm.po.OrdersQueryVo;
import cn.josh.cm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单controller类
 * @Date: Created in 12:51 2018/6/13
 * @Modified By:
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    /**
     * @Author: Josh.Wang
     * @Param:ordersQueryVo订单包装类
     * @Description:订单controller查询列表方法
     * @Date: Created in 14:56 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/queryOrders", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView queryOrders(String phone)throws Exception{
        OrdersQueryVo ordersQueryVo = new OrdersQueryVo();
        OrdersCustom ordersCustom = new OrdersCustom();
        ordersCustom.setPhone(phone);
        ordersQueryVo.setOrdersCustom(ordersCustom);
        List<OrdersCustom> ordersCustomList = ordersService.findOrdersList(ordersQueryVo);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ordersCustomList", ordersCustomList);
        modelAndView.setViewName("/orders/ordersList");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:ordersQueryVo订单包装类
     * @Description:查询保养超过90天的车辆信息controller方法
     * @Date: Created in 12:55 2018/8/4
     * @Modified By:
    */
    @RequestMapping(value = "/findSpecialOrdersList")
    public ModelAndView queryOrdersByDays()throws Exception{
        List<OrdersCustom> ordersCustomList = ordersService.findSpecialOrdersList(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ordersCustomList",ordersCustomList);
        modelAndView.setViewName("/orders/specialOrdersList");
        return modelAndView;
    }
    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id查询订单controller信息方法
     * @Date: Created in 15:58 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/updateOrders", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView updateOrders(Integer id)throws Exception{
        OrdersCustom ordersCustom = ordersService.findOrdersById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ordersCustom", ordersCustom);
        modelAndView.setViewName("/orders/updateOrders");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:id,ordersCustom
     * @Description:根据id将订单信息更新controller方法
     * @Date: Created in 16:06 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/updateOrdersSubmit",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView updateOrdersSubmit(Integer id, OrdersCustom ordersCustom)throws Exception{
        ordersService.updateOrdersById(id, ordersCustom);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id删除订单controller方法
     * @Date: Created in 16:08 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/deleteOrders", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView deleteOrders(Integer id)throws Exception{
        ordersService.deleteOrdersById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param: * @param null
     * @Description:预新增订单controller方法
     * @Date: Created in 16:11 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/preInsertOrders", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView preInsertOrders()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/orders/insertOrders");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:ordersCustom
     * @Description:新建订单contr方法
     * @Date: Created in 16:13 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/insertOrders", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView insertOrders(OrdersCustom ordersCustom)throws Exception{
        ordersCustom.setDate(new Date());
        ordersService.insertOrders(ordersCustom);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }
}
