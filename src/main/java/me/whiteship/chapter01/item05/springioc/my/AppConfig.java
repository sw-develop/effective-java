package me.whiteship.chapter01.item05.springioc.my;

import me.whiteship.chapter01.item05.factorymethod.my.Dictionary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 설정 파일
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

//    @Bean
//    public SpellChecker spellChecker(Dictionary dictionary) {
//        return new SpellChecker(dictionary);
//    }
//
//    @Bean
//    public Dictionary dictionary() {
//        return new MyDictionary();
//    }
}
