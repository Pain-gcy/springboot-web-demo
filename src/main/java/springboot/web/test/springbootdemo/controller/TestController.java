package springboot.web.test.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author guochunyuan
 * @create on  2019-03-01 16:17
 */
@RestController
public class TestController {

    @GetMapping(value = "/getstr")
    public JSONObject getStr() {
        JSONObject job = new JSONObject();
        job.put("ss", 111);
        return job;
    }

    @GetMapping(value = "/getParams")
    public JSONObject getParamStr(@RequestParam("age") Integer age, @RequestParam("name") String name) {
        JSONObject job = new JSONObject();
        job.put("age", age);
        job.put("name", name);
        return job;
    }

    @PostMapping("/post")
    public JSONObject postStr(@RequestBody JSONObject jsonObject) {
        return jsonObject;
    }
}
