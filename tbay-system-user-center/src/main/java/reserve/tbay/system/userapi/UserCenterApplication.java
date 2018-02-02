package reserve.tbay.system.userapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User Center Application
 * @author 571
 * @create 2018-1-25 17:35:25
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class UserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterApplication.class, args);
	}
}
