package com.hsj.controller;

import com.hsj.pojo.WebSite;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *@ClassName PostController
 *@Description
 *@Author hsj
 *Date 2020/2/10 19:56
 */
@Controller
public class PostController {
    //跳转到test15-4.html视图
    @GetMapping("/toTest15-4")
    public String toTestOne(){
        return "test15-4";
    }

    //跳转到test15-5.html视图
    @GetMapping("/toTest15-5")
    public String toTestTwo(){
        return "test15-5";
    }

    //对页面发送json数据
    @PostMapping("/postOne")
    @ResponseBody
    public WebSite methodOne(){
        WebSite webSite=new WebSite();
        webSite.setWebName("菜鸟教程");
        webSite.setUrl("ww.Runoob.com");
        return webSite;
    }

    //接收post请求类型的前端参数
    @PostMapping("/postTwo")
    @ResponseBody
    public WebSite methodTwo(@RequestBody WebSite webSite){
        return webSite;
    }
}
