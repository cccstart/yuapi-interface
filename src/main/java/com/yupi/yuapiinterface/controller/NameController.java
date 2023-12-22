package com.yupi.yuapiinterface.controller;

import com.yupi.yuapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ccc
 * @create 2023-12-07 14:26
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name,HttpServletRequest request){
        System.out.println(request.getHeader("yupi"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request){
//        //从请求头中获取参数
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        //如果accessKey不等于"yupi"   实际情况需要去数据库查
//        if (!accessKey.equals("yupi")){
//            //抛出异常
//            throw new RuntimeException("无权限");
//        }
//        //校验随机数，模拟直接判断是否大于10000
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//        //时间不能超过5分钟
////        if (timestamp) {
////        }
//        //实际情况需要从数据库中查secretKey
//        String serverSign = SignUtils.getSign(body, "abcdefgh");
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }
        //如果权限校验通过，返回
        return "POST 用户名字是" + user.getUsername();
    }

}
