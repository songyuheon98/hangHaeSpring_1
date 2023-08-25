package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
     @GetMapping("/hello")
     @ResponseBody
    public String hello(){
         return "Hello World!!!!";
         // 일반적으로 @ResponseBody없이 문자열 반환하면 (view = html파일명)을 반환하는 걸로 이해한다.
         // 따라서 순수하게 문자열을 반환한다면 @ResponseBody를 적어야한다.

         // 코드를 수정하더라도 실시간으로 서버에 반영 X,  서버 재시작 필요
    }
     @GetMapping("/get")
     @ResponseBody
    public String get(){
         return "GET Method 요청";
     }

     @PostMapping("/hello")
     @ResponseBody
     public String post1(){
         return "hello POST Method";
     }

     @PostMapping("/post")
    @ResponseBody
    public String post(){
         return "POST Method 요청";
     }

     @PutMapping("/put")
    @ResponseBody
    public String put(){
         return "PUT Method 요청";
     }
    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE Method 요청";
    }


}
