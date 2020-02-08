package com.hsj.contrller;

import com.hsj.pojo.WebSite;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

/*
 *@ClassName MyController
 *@Description
 *@Author hsj
 *Date 2020/2/7 21:09
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String toTestGet(){
        return "testGet";
    }

    @RequestMapping("/testPost")
    public String toTestPost(){
        return "testPost";
    }

    @RequestMapping("/toTestAjaxGet")
    public String toTestAjaxGet(){
        return "testAjaxGet";
    }

    @RequestMapping("/toTestAjaxPost")
    public String toTestAjaxPost(){
        return "testAjaxPost";
    }

    @GetMapping("/testGet")
    @ResponseBody
    public String testGet(){
        return "数据：这是从控制器中读取的数据。";
    }

    //使用注解@RequestParams接收参数
    @PostMapping("/testPost1")
    @ResponseBody
    public String testPost1(@RequestParam(value = "name") String name,
                            @RequestParam(value = "url") String  url){
        String webName="网站名："+name;
        String webURL="URL地址:"+url;
        return webName+"\n"+webURL;
    }

    //将参数封装成javaBean对象
    @PostMapping("/testPost2")
    @ResponseBody
    public String testPost2(WebSite webSite){
        String webName="网站名："+webSite.getName();
        String webURL="URL地址:"+webSite.getUrl();
        return webName+"\n"+webURL;
    }

    //测试ajax的get类型
    @GetMapping("/testAjaxGet")
    @ResponseBody
    public WebSite testAjaxGet(WebSite webSite){
        return webSite;
    }

    //测试ajax的post类型
    @PostMapping("/testAjaxPost")
    @ResponseBody
    public WebSite testAjaxPost(WebSite webSite){
        return webSite;
    }
}
