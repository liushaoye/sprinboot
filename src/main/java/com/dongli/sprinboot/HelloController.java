package com.dongli.sprinboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******************************
 * @author : liuyang
 * <p>ProjectName:sprinboot  </p>
 * @ClassName :  HelloController
 * @date : 2018/7/7 0007
 * @time : 3:47
 * @createTime 2018-07-07 3:47
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello";
    }
}
