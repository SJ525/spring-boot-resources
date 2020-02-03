package com.hsj;

import com.hsj.pojo.Person;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *@ClassName MyTest
 *@Description
 *@Author hsj
 *Date 2020/2/3 11:50
 */

public class MyTest {
    @Test
    public void testOuput2(){
        Person person=new Person();
        person.setUserDate(new Date());
        Date userDate1=person.getUserDate();
        // 获得SimpleDateFormat类
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String userDate2=sf.format(userDate1);
        System.out.println(userDate2);
    }
}
