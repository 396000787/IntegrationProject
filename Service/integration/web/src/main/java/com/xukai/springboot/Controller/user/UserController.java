package com.xukai.springboot.Controller.user;

import com.xukai.springboot.entity.requestEntity.LoginParam;
import com.xukai.springboot.entity.response.ResponseBase;
import com.xukai.springboot.entity.user.User;
import com.xukai.springboot.service.user.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(basePath="/user",description="用户信息Controller")
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
   private UserService userService;

    /**
     * 登录验证
     * @param loginParam
     * @return
     */
    @ApiOperation(value="登录验证",notes="登录验证")
    @ApiImplicitParams({
            @ApiImplicitParam(name="loginParam",value="登录信息",required = true,dataType = "LoginParam")
    })
    @PostMapping("logincheck")
    public ResponseBase<User> loginCheck(@RequestBody LoginParam loginParam)
    {
        ResponseBase<User> result=new   ResponseBase<User>();


        User user=userService.LoginCheck(loginParam.getLoginName(),loginParam.getPassword());
        if(user==null)
        {
            result.setErrMessage("用户名或密码错误");
            return result;
        }
        result.setData(user);

        return result;
    }

}
