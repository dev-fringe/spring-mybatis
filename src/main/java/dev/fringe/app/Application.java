package dev.fringe.app;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import dev.fringe.mapper.StudentMapper;

@Configuration
@ImportResource("classpath:spring-mybatis.xml")
public class Application implements InitializingBean {
	
	@Autowired StudentMapper mapper;
	
	public static void main(String[] args) throws Exception {
		new AnnotationConfigApplicationContext(Application.class).getBean(Application.class);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(mapper.selectByPrimaryKey(10001));
	}

}
