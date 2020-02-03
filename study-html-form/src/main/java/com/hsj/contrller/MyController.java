package com.hsj.contrller;

import com.hsj.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *@ClassName MyController
 *@Description
 *@Author hsj
 *Date 2020/2/2 22:52
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String inPut1() {
        return "input1";
    }

    @RequestMapping(value ="/output1",method = {RequestMethod.POST})
    public String output1(ModelMap map,Person person) {
        String username= person.getUsername();
        String email=person.getEmail();
        map.addAttribute("username", username);
        map.addAttribute("email", email);
        return "output1";
    }

    @RequestMapping("/input2")
    public String input2() {
        return "input2";
    }

    @RequestMapping(value ="/output2",method = {RequestMethod.POST})
    public String output2(ModelMap map,Person person, BindingResult bindingResult) {
        Date userDate=person.getUserDate();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String userDate2=sf.format(userDate);
        map.addAttribute("userDate", userDate2);
        return "output2";
    }

}
