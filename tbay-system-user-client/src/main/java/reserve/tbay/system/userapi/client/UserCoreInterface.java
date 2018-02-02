package reserve.tbay.system.userapi.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import reserve.tbay.system.userapi.client.hystriximpl.UserCoreInterfaceByHystric;

/**
 * 用户中心-转发层
 * @author 571
 * @create 2018-1-25 17:59:54
 */
@FeignClient(name = "tbay-system-user-center",fallback = UserCoreInterfaceByHystric.class)
public interface UserCoreInterface {

    /**
     * User Center Demo
     * @return
     */
    @RequestMapping(value="/user/userdemo.go")
    String demo();

}
