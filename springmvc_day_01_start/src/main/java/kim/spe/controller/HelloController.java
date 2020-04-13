package kim.spe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author charlie
 * @date 2020/4/13 - 11:32
 * @description controller
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/helloworld")
    public String sayHello(){
        System.out.println("Hello");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("HelloComment");
        return "success";
    }
}
