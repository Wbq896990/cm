package cn.josh.cm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Josh.Wang
 * @Description:URLcontroller
 * @Date: Created in 15:46 2018/6/27
 * @Modified By:
 */
@Controller
@RequestMapping("/cm")
public class URLController {

    @RequestMapping(value = "/success")
    @ResponseBody
    public String success()throws Exception{
        return "/success";
    }

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index()throws Exception{
        return "/index";
    }
}
