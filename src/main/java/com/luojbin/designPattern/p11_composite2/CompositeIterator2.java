package com.luojbin.designPattern.p11_composite2;



import java.util.Iterator;
import java.util.Stack;

/**
 * @author luojbin
 * @create 2018-03-30
 */
public class CompositeIterator2 implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator2(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
               stack.pop();
               return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent2 component = (MenuComponent2) iterator.next();
            if(component instanceof Menu2){
                stack.push(component.createIterator());
            }
            return component;
        }else{
            return null;
        }
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
