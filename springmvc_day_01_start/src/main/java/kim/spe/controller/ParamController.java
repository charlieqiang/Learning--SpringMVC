package kim.spe.controller;

import kim.spe.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author charlie
 * @date 2020/4/13 - 21:01
 * @description
 */
@Controller
@RequestMapping(path = "/param")
public class ParamController {

    @RequestMapping(path = "/testParam")
    public String testParam(String username){
        System.out.println("testParam");
        System.out.println("you name is "+username);
        return "success";
    }

    @RequestMapping(path = "/saveAccount")
    public String testParam(Account account){
        System.out.println("testParam");
        System.out.println(account);
        return "success";
    }

}
