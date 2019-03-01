package springboot.web.test.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author guochunyuan
 * @create on  2019-03-01 13:39
 */
@Controller
public class WebController {

    @RequestMapping(value = "/testonclick")
    public ModelAndView testtwo(ModelAndView mv) {
        mv.setViewName("testonclick");
        mv.addObject("name","欢迎使用Thymeleaf!");
        return mv;
    }

    @RequestMapping(value = "/component")
    public ModelAndView component(ModelAndView mv) {
        mv.setViewName("componenttest");
        mv.addObject("name","欢迎使用Thymeleaf!");
        return mv;
    }

    @RequestMapping(value = "/directive")
    public ModelAndView directive(ModelAndView mv) {
        mv.setViewName("directive");
        mv.addObject("name","欢迎使用Thymeleaf!");
        return mv;
    }

    @RequestMapping(value = "/router")
    public ModelAndView router(ModelAndView mv) {
        mv.setViewName("router");
        mv.addObject("name","欢迎使用Thymeleaf!");
        return mv;
    }
    @RequestMapping("/vueAjax")
    public ModelAndView vueAjax(ModelAndView mv){
        mv.setViewName("vueajax");
        return mv;
    }


}
