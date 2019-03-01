package springboot.web.test.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author guochunyuan
 * @create on  2019-03-01 9:04
 */
@Controller
public class ThymeleafController {

    @RequestMapping(value = "/test")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("test");
        mv.addObject("name","欢迎使用Thymeleaf!");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sss",11);
        mv.addObject("job",jsonObject);
        return mv;
    }

    @RequestMapping(value = "/testtwo")
    public ModelAndView testtwo(ModelAndView mv) {
        mv.setViewName("testtwo");
        mv.addObject("name","欢迎使用Thymeleaf!");
        return mv;
    }

}
