package test.ashishjaintechg;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class GreetingServiceAspect {

	@Before(value = "execution(* test.ashishjaintechg.SpringBootAopTestApplication.getMessage(..)) and args(name)")  
	public void beforeAdvice(JoinPoint joinPoint, String name) {  
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    String header = request.getHeader("user-agent");
	System.out.println("Before method:" + joinPoint.getSignature()); 
	System.out.println("name:" + name +" header user-agent : "+header);  

	}  
	
}
