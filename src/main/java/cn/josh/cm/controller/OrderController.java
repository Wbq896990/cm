package cn.josh.cm.controller;

import cn.josh.cm.po.OrderCustom;
import cn.josh.cm.po.OrderQueryVo;
import cn.josh.cm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:订单controller类
 * @Date: Created in 12:51 2018/6/13
 * @Modified By:
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * @Author: Josh.Wang
     * @Param:orderQueryVo订单包装类
     * @Description:订单controller查询列表方法
     * @Date: Created in 14:56 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/queryOrder", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView queryOrder(OrderQueryVo orderQueryVo)throws Exception{
        List<OrderCustom> orderCustomList = orderService.findOrderList(orderQueryVo);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orderCustomList", orderCustomList);
        modelAndView.setViewName("/order/orderList");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id查询订单controller信息方法
     * @Date: Created in 15:58 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/updateOrder", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView updateOrder(Integer id)throws Exception{
        OrderCustom orderCustom = orderService.findOrderById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orderCustom", orderCustom);
        modelAndView.setViewName("/order/updateOrder");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:id,orderCustom
     * @Description:根据id将订单信息更新controller方法
     * @Date: Created in 16:06 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/updateOrderSubmit",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView updateOrderSubmit(Integer id, OrderCustom orderCustom)throws Exception{
        orderService.updateOrderById(id, orderCustom);
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
    @RequestMapping(value = "/deleteOrder", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView deleteOrder(Integer id)throws Exception{
        orderService.deleteOrderById(id);
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
    @RequestMapping(value = "/preInsertOrder", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView preInsertOrder()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/order/insertOrder");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:orderCustom
     * @Description:新建订单contr方法
     * @Date: Created in 16:13 2018/6/13
     * @Modified By:
    */
    @RequestMapping(value = "/insertOrder", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView insertOrder(OrderCustom orderCustom)throws Exception{
        orderService.insertOrder(orderCustom);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }
}
