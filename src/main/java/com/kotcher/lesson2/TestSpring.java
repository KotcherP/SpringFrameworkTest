package com.kotcher.lesson2;

import com.kotcher.lesson2.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //класс помещает все beans ,которые описаны в конфигурационном файле,в контекст спринга.
        //важно,чтобы файл был xml и в папке resourse (помеченная,как ресурсная)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //testBean - id бина (бин = объект класса)
        TestBean testBean = context.getBean("testBean",TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
