package com.hsj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hsj.pojo.WebSite;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/*
 *@ClassName MyController
 *@Description  控制器
 *@Author hsj
 *Date 2020/2/10 16:36
 */
@Controller
public class GetController {
    //跳转到test15-1.html视图
    @GetMapping("/toTest15-1")
    public String toTestOne(){
        return "test15-1";
    }

    //跳转到test15-2.html视图
    @GetMapping("/toTest15-2")
    public String toTestTwo(){
        return "test15-2";
    }

    //跳转到test15-3.html视图
    @GetMapping("/toTest15-3")
    public String toTestThree(){
        return "test15-3";
    }

    //对页面发送json数据
    @GetMapping("/getJsonOne")
    @ResponseBody
    public WebSite methodOne(){
        WebSite webSite=new WebSite();
        webSite.setWebName("google");
        webSite.setUrl("ww.google.com");
        return webSite;
    }

    //使用JsonObject制造json数据源
    @GetMapping("/getJsonTwo")
    @ResponseBody
    public JSON methodTwo(){
        JSONObject object=new JSONObject();
        object.put("name", "网站");
        object.put("num", 3);
        JSONObject object1=new JSONObject();
        List<String> list1= Arrays.asList("google-1","taobao-1","baidu-1");
        List<String> list2= Arrays.asList("google-2","taobao-2","baidu-2");
        List<String> list3= Arrays.asList("google-3","taobao-3","baidu-3");
        object1.put("name1",list1);
        object1.put("name2",list2);
        object1.put("name3",list3);
        object.put("sites", object1);
        return object;
    }

    //接收get请求类型的前端参数
    @GetMapping("/getJsonThree")
    @ResponseBody
    public WebSite methodThree(WebSite webSite){
        return webSite;
    }
}
