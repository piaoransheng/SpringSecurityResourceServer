package lhc.web.controller;

import lhc.util.SecurityUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author lhc
 * @Date 2020-09-24 17:33
 **/
@Controller
@RequestMapping("/api")
public class TestController {

    @ResponseBody
    @GetMapping("/test1")
    public String test1() {
        System.out.println("调用了资源服务的tes1t方法");
        Object principal = SecurityUtil.getPrincipal();
        System.out.println("principal信息" + principal);
        return "调用了资源服务的test1方法";
    }

    @ResponseBody
    @GetMapping("/test2")
    public String test2() {
        System.out.println("调用了资源服务的test2方法");
        return "调用了资源服务的test2方法";
    }
}