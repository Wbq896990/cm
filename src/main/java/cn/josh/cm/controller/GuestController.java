package cn.josh.cm.controller;

import cn.josh.cm.po.GuestCustom;
import cn.josh.cm.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:客户handler
 * @Date: Created in 17:34 2018/6/5
 * @Modified By:
 */
@Controller
//窄化请求映射，在这里配置一个请求的根路径，这样，前端访问时就是要访问根路径+子路径。
// 如queryGuest，现在就必须变成/guest/queryGuest
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    /**
     * @Author: Josh.Wang
     * @Param: * @param null
     * @Description:查询客户列表controller方法
     * @Date: Created in 17:09 2018/6/6
     * @Modified By:
    */
    //method属性限制页面请求方法，限定必须是post或者get请求。这样做是为了安全考虑
    @RequestMapping(value = "/queryGuest" , method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView queryGuest() throws Exception{
        //调用service查询数据库
        List<GuestCustom> guestCustomList = guestService.findGuestList(null);
        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //将数据库查询到的数据填充ModelAndView，从jsp页面可以通过guestCustomList取数据
        modelAndView.addObject("guestCustomList", guestCustomList);
        modelAndView.setViewName("/guest/guestList");

        //返回ModelAndView
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param: * @param null
     * @Description:客户信息修改controller方法
     * @Date: Created in 17:11 2018/6/6
     * @Modified By:
    */
    @RequestMapping(value = "/updateGuest" ,method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView updateGuest(Integer id)throws Exception{
        //调用客户service，根据客户id获取客户信息
        GuestCustom guestCustom = guestService.findGuestById(id);
        ModelAndView modelAndView = new ModelAndView();
        //将客户信息放到ModelAndView
        modelAndView.addObject("guestCustom",guestCustom);
        //客户信息修改页面
        modelAndView.setViewName("/guest/updateGuest");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param: * @param null
     * @Description:修改客户信息提交controller方法
     * @Date: Created in 17:20 2018/6/6
     * @Modified By:
    */
    @RequestMapping(value = "/updateGuestSubmit", method = {RequestMethod.POST})
    public ModelAndView updateGuestSubmit(Integer id ) throws Exception{

       // guestService.updateGuestById(guestCustom.getId(),guestCustom);
        ModelAndView modelAndView = new ModelAndView();
        //将客户信息放入modelandview中
        modelAndView.setViewName("/success");
        return modelAndView;
    }
}
