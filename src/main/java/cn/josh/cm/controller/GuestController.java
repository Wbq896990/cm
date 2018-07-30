package cn.josh.cm.controller;

import cn.josh.cm.po.GuestCustom;
import cn.josh.cm.po.GuestQueryVo;
import cn.josh.cm.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
    public ModelAndView queryGuest(String phone) throws Exception{
        //将页面取得的phone属性设置到guestQueryVo中
        GuestQueryVo guestQueryVo = new GuestQueryVo();
        GuestCustom guestCustom = new GuestCustom();
        guestCustom.setPhone(phone);
        guestQueryVo.setGuestCustom(guestCustom);

        //调用service查询数据库
        List<GuestCustom> guestCustomList = guestService.findGuestList(guestQueryVo);
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
    public String updateGuest(Model model,Integer id)throws Exception{
        //调用客户service，根据客户id获取客户信息
        GuestCustom guestCustom = guestService.findGuestById(id);
        /*ModelAndView modelAndView = new ModelAndView();
        //将客户信息放到ModelAndView
        modelAndView.addObject("guestCustom",guestCustom);
        //客户信息修改页面
        modelAndView.setViewName("/guest/updateGuest");*/
        model.addAttribute("guestCustom",guestCustom);
        return "/guest/updateGuest";
    }

    /**
     * @Author: Josh.Wang
     * @Param: * @param null
     * @Description:修改客户信息提交controller方法
     * @Date: Created in 17:20 2018/6/6
     * @Modified By:
    */
    @RequestMapping(value = "/updateGuestSubmit", method = {RequestMethod.POST})
    public String updateGuestSubmit(Integer id, GuestCustom guestCustom ) throws Exception{
        guestService.updateGuestById(id,guestCustom);
        //ModelAndView modelAndView = new ModelAndView();
        //将客户信息放入modelandview中
        //modelAndView.setViewName("/success");
        return "forward:queryGuest.action";
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id删除客户信息Controller方法
     * @Date: Created in 16:42 2018/6/11
     * @Modified By:
    */
    @RequestMapping(value = "/deleteGuest", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView deleteGuestById(Integer id)throws Exception{
        guestService.deleteGuestById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param: * @param null
     * @Description:预新增客户
     * @Date: Created in 13:40 2018/6/12
     * @Modified By:
    */
    @RequestMapping(value = "/preInsertGuest", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView preInsertGuest()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/guest/insertGuest");
        return modelAndView;
    }

    /**
     * @Author: Josh.Wang
     * @Param:guestCustom客户信息
     * @Description:添加新客户
     * @Date: Created in 13:24 2018/6/12
     * @Modified By:
    */
    @RequestMapping(value = "/insertGuest", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView insertGuest(GuestCustom guestCustom)throws Exception{
        guestService.insertGuest(guestCustom);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }
}
