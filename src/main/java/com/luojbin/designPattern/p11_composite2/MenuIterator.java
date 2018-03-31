package com.luojbin.designPattern.p11_composite2;



import java.util.Iterator;
import java.util.Stack;

/**
 * @author luojbin
 * @create 2018-03-30
 */
public class MenuIterator implements Iterator {
    // 堆栈, 用来记录当前到达的菜单, 开始只是空栈
    private Stack<Iterator> stack = new Stack<>();
    private String name;

    MenuIterator(Iterator listIterator, String name) {
        // 每次创建一个新的菜单迭代器时, 将当前菜单的list迭代器压入栈中
        // 这是该栈的第一个元素, 亦即栈底元素
        // 对于一个菜单, 栈底元素就是该菜单的 list迭代器
        // 后续进栈的元素, 是子菜单的 menu迭代器
        System.out.println("构造菜单迭代器. <<"+name+ ">>的迭代器进栈");
        this.stack.push(listIterator);
        this.name = name + "的菜单迭代器";
    }


    @Override
    public boolean hasNext() {
        if(stack.empty()){
            // 如果栈中已经空了, 表示当前菜单已经迭代完毕, 没有新的菜单项目
            return false;
        } else {
            // 如果栈中还有, 则取得栈顶元素, 不弹栈
            Iterator stackPeekIterator = stack.peek();

            // 取得栈顶迭代器, 即当前菜单的list迭代器, 或是子菜单的menu迭代器, 检查是否还有下一个菜单项
            if(!stackPeekIterator.hasNext()){
                // 如果该迭代器没有了下一个菜单项, 那么该迭代器使用完毕, 弹栈
                System.out.println("这里弹栈一次:"+stack.peek());
                stack.pop();

                // 递归调用本方法, 检查上一个迭代器是否使用完
                return hasNext();
            }else{
                // 如果该迭代器还有下一个菜单项, 则返回true
                return true;
            }
        }
    }

    @Override
    public Object next() {
        // 当前迭代器是否还有下一个元素
        // if(hasNext()){
            // 如果还有下一个元素, 那么先取得栈顶迭代器, 当前菜单的 list迭代器, 或是子菜单的 menu迭代器
            // System.out.println("next方法, 栈顶迭代器:"+name);
            Iterator stackPeekIterator = stack.peek();
            // 获取该迭代器的下一个元素

            MenuComponent2 component = (MenuComponent2) stackPeekIterator.next();
            if(component instanceof Menu2){
                // 如果该组件是一个菜单, 将这个菜单的菜单迭代器压入栈, 准备遍历该菜单的下级
                stack.push(component.getMenuIterator());
                System.out.println(name+"的栈"+stack);
            }
                // 返回该组件, 子菜单或菜单条目
                return component;

        // }else{
        //     return null;
        // }
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }

    public String toString(){
        return name;
    }
}
