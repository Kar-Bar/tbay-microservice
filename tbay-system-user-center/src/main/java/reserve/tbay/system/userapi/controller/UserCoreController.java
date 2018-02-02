package reserve.tbay.system.userapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户中心-核心逻辑
 * @author 571
 * @create 2018-1-25 17:37:28
 */
@RestController
public class UserCoreController {

    @RequestMapping("/user/userdemo.go")
    public String userDemo() throws Exception {
        String str = "调用用户中心，返回处理参数";
//        throw new Exception();
        return str;
    }
}
