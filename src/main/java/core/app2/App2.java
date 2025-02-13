package core.app2;

import core.app2.Controller.Controller1;
import core.app2.Controller.Controller2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App2 {
    public static void main(String[] args) {
        // Spring Bean 들을 생성
        // 현재 App 의 패키지와 그 하위 패키지를 모두 탐색해서
        // @Component 와 그 하위 패키지를 모두 탐색해서
        // @Component 가 붙은 클래스로 객체(Spring Bean)을 생성함

        // Dependency Injection (역는다(Autowired). 의존성 주입)
        ApplicationContext context = SpringApplication.run(App2.class, args);
        //context.getBean(Controller1.class);
        Controller1 b1 = context.getBean(Controller1.class);
        System.out.println(System.identityHashCode(b1));

        Controller1 b2 = context.getBean(Controller1.class);
        System.out.println(System.identityHashCode(b2));

        Controller2 b3 = context.getBean(Controller2.class);
        System.out.println("b3 = " + b3);
    }
}

