package com.kotcher.lesson11;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//старый способ прописывания зависимостей бинов (xml + код java)

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext_11.xml"
        );

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);

        context.close();

    }
}
