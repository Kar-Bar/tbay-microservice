package reserve.tbay.system.userapi.client.hystriximpl;

import org.springframework.stereotype.Component;
import reserve.tbay.system.userapi.client.UserCoreInterface;

/**
 * 用户中心-断路由
 * @author 571
 * @create 10:14
 */
@Component
public class UserCoreInterfaceByHystric implements UserCoreInterface {

    @Override
    public String demo() {
        String str = "异常，用户中心，断路由启动";
        System.out.println("异常，用户中心，断路由启动");
        return str;
    }

}
