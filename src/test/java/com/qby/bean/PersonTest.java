package com.qby.bean;




import com.qby.service.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 * @author qby
 * @date 2020/8/1 23:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class PersonTest {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void test01() {
        System.out.println(person);
    }

    @Test
    public void test02() {
        System.out.println(ioc.getBean(HelloService.class));
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }

}