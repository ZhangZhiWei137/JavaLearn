package Spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
 
@Configuration
@ComponentScan("cn.itcats.thread")
@EnableAsync
public class Config {
	
}
