package me.whiteship.chapter01.item05.springioc.my;

import me.whiteship.chapter01.item05.factorymethod.my.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        System.out.println("contains " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
