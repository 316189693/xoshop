package com.xo.shop;

import com.sun.deploy.net.HttpResponse;
import com.xo.shop.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.activation.MimeType;

/**
 * Created By willz
 * Date : 2020/3/30
 * Time: 17:10
 */
@Api(value="dashboard")
@Controller
public class Demo {
 @GetMapping("/dashboard")

    public String test(){
     return "test01";
 }

    @GetMapping(value = "/dashboard01", produces = "application/json")
    @ApiOperation(value = "desc of test01", notes = "")
    @ResponseBody
    public User test01(@ApiParam(value = "desc of param" , required=true ) @RequestParam String name){
        User user = new User();
        user.setEmail("123@123.com");
        user.setFirst_name("dddd");
        user.setLast_name("ddddffff");
        return user;
    }
}
