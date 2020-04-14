package kim.spe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author charlie
 * @date 2020/4/14 - 8:12
 * @description
 */
@Controller
@RequestMapping(path = "/anno")
public class AnnoController  {

    @RequestMapping(path = "/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("testRequestParam is "+ username);
        return "success";
    }

    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody String user){
        System.out.println("testRequestBody is "+ user);
        return "success";
    }

    @RequestMapping(path = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name =
    "sid") String id){
        System.out.println("testPathVariable is "+ id);
        return "success";
    }
}
