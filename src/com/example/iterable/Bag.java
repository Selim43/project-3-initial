package com.example.iterable;

import java.util.*;


public class Bag<T> implements Container<T> {

    public ArrayList<T> Fruit;


    public Bag() {
        this.Fruit = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.Fruit.isEmpty();
    }

    @Override
    public int size() {
        return this.Fruit.size();
    }

    @Override
    public void add(T item) {
        this.Fruit.add(0, item);

    }


    @Override
    public Iterator<T> iterator() {
        return Fruit.iterator();
    }

}

