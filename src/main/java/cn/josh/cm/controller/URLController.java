package cn.josh.cm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Josh.Wang
 * @Description:URLcontroller
 * @Date: Created in 15:46 2018/6/27
 * @Modified By:
 */
@Controller
public class URLController {

    @RequestMapping(value = "/cm/success")
    public String success()throws Exception{
        return "/success";
    }

    @RequestMapping(value = "/cm/index")
    public String index()throws Exception{
        return "/index";
    }
}
