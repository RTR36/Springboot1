package springboot2.demo2;

import java.util.List;

// import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		
	
		SpringApplication.run(Demo2Application.class, args);

	// ApplicationContext context= SpringApplication.run(Demo2Application.class, args);
    // userrepository userrepo=((BeanFactory) context).getBean(userrepository.class);
	// user usr1=new user();
	// usr1.setCity("pune");
	// usr1.setId(1);
	// usr1.setName("Rajendra");

	// user usr2=new user();
	// usr2.setCity("pimori");
	// usr2.setId(2);
	// usr2.setName("parth");
    // System.out.println(1);
	// user resultuser = userrepo.save(usr2); // we can perform crud operations  here in this file
	// // System.out.println(2);
	// // System.out.println(resultuser);
	// // System.out.println(3);
	// // List<user> users=userrepo.findByname("parth");
	// List<user> users=userrepo.getall();
    // System.out.println(2);
	// System.out.println(users);
	// System.out.println(4);
	// users.forEach(e->System.out.println(e));

}

}
