package reserve.tbay.system.userapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reserve.tbay.system.userapi.client.UserCoreInterface;

/**
 * 用户中心-前端逻辑处理
 * @author 571
 * @create 2018-1-24 16:28:15
 */
@RestController
public class UserApiController {

    private Logger logger = LoggerFactory.getLogger(UserApiController.class);

    @Autowired
    private UserCoreInterface userCoreInterface;

    @RequestMapping(value="/user/userdemo.go")
    public String demo(){
        String rsp = userCoreInterface.demo();
        return rsp;
    }
}
