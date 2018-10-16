package com.example.demo.conroller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tomcat")
public class TomcatCheckController {
    @GetMapping("/checkUrl/{time}")
    @ResponseBody
    public JSONObject check(@PathVariable("time")Long time) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("timeStemp",time);
        return jsonObject;
    }
}
