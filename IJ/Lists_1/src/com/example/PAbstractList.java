package com.example;

import java.util.AbstractList;

public class PAbstractList {
    AbstractList<Integer> abstractList = new AbstractList<>() {
        @Override
        public int size() {
            return abstractList.size();
        }

        @Override
        public Integer get(int index) {
            return abstractList.get(index);
        }
    };

}
