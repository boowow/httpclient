package test.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo.module.User;

@RestController
public class TestController {

    @RequestMapping("test")
    public String show(){
        return "this is httpclient demo!";
    }

    @RequestMapping("test2")
    public String show2(String name,Integer age){
        return "name="+name+"----age="+age;
    }

    @RequestMapping("test3")
    public String show3(@RequestBody User user){
        return user.toString();
    }

    @RequestMapping("test4")
    public String show4(@RequestBody User user, Integer flag, String message){
        return user.toString()+"\n flag="+flag+"message="+message;
    }
}
