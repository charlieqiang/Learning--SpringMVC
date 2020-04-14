package kim.spe.controller;

import kim.spe.domain.User;
import kim.spe.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.UUID;

/**
 * @author charlie
 * @date 2020/4/14 - 9:13
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){
        User user = new User();
        user.setUname("char");
        user.setAge(20);
        user.setDate(new Date());
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){

        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUname("hellochar");
        user.setAge(20);
        user.setDate(new Date());
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;

    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println(user);
        //respond
        user.setUname("mary");
        user.setAge(21);
        user.setDate(new Date());
        return user;
    }

    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request, MultipartFile upload) throws Exception{
        //location
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        //check
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();

            System.out.println("mkdir"+path);
        }

        //get file name
        String filename = upload.getOriginalFilename();
        //uuid
        String uuid = UUID.randomUUID().toString().replace("-","");
        filename = uuid+"_"+filename;
        //success
        upload.transferTo(new File(path, filename));

        return "success";
    }

    @RequestMapping("/testException")
    public String testException() throws SysException{
        try {
            int a = 10/0;
        } catch (Exception e) {
            //
            e.printStackTrace();
            //
            throw new SysException("something wrong");
        }
        return "success";
    }

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("Interceptor get you");
        return "success";
    }

}
