package kim.spe.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author charlie
 * @date 2020/4/14 - 17:44
 * @description
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * handle
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //get exp obj
        SysException sysException = null;
        if (e instanceof SysException){
            sysException = (SysException)e;

        }else {
            sysException = new SysException("system dumping...");
        }
        //create mv
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",sysException.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
