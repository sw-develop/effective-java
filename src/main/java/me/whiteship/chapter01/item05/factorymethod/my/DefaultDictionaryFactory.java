package me.whiteship.chapter01.item05.factorymethod.my;

public class DefaultDictionaryFactory implements DictionaryFactory {

    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
