package cn.linjk.ihouse.controller;

import cn.linjk.ihouse.model.ModelLogin;
import org.springframework.web.bind.annotation.*;

/**
 * Create By LinJK At 08/21/2017
 *
 * 账号管理
 */

@RestController
@RequestMapping("/account")
public class ControllerAccount {

    @RequestMapping(value = "login", method = RequestMethod.POST,
            consumes = "application/json")
    @ResponseBody
    public String login(@RequestBody ModelLogin modelLogin) {
        System.out.println("account is: " + modelLogin.getAccount());
        System.out.println("pwd is: " + modelLogin.getPwd());
        // Todo: 登录验证处理...

        return "Test Login";
    }

}
