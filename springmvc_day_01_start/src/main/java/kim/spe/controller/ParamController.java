package kim.spe.controller;

import kim.spe.domain.Account;
import kim.spe.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;

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

    @RequestMapping(path = "/saveUser")
    public String saveUser(User user){
        System.out.println("testParam");
        System.out.println(user);
        return "success";
    }

    @RequestMapping(path = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testServlet");
        System.out.println(request);
        HttpSession httpSession = request.getSession();
        System.out.println(httpSession);
        ServletContext servletContext = httpSession.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }
}
