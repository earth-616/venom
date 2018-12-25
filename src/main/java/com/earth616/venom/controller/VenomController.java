package com.earth616.venom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.earth616.venom.dao.incidencePOMapper;
import com.earth616.venom.dao.configurationPOMapper;
import com.earth616.venom.entity.*;
import java.util.List;
import com.alibaba.fastjson.JSON;


import javax.annotation.Resource;

@RestController
public class VenomController {

    @Resource configurationPOMapper configurationPOMapper;
    @Resource incidencePOMapper incidencePOMapper;

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(){
        return "hello , I am Venom";
    }

    @RequestMapping(value = "/search" , method = RequestMethod.GET)
    public String result(@RequestParam(defaultValue="*") String mendianid,@RequestParam(defaultValue="*") String ipaddr){
        configurationPOExample configurationPOExample = new configurationPOExample();
        configurationPOExample.createCriteria().andStoreidEqualTo(mendianid);
        List<configurationPO> res = configurationPOMapper.selectByExample(configurationPOExample);
        String result = JSON.toJSONString(res);
        return result;
    }
}
