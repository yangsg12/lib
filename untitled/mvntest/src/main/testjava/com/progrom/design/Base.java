package com.progrom.design;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-7-9
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class Base {
    protected String name() {
        return "Base";
    }
}

class More extends Base{
    protected String name() {
        return "More";
    }

    protected void printName(){
        Base sref = (Base)this;
        System.out.println("this.name() ="+this.name());
        System.out.println("sref.name() ="+sref.name());
        System.out.println("super.name() ="+super.name());
    }

    public static void main(String[] args) {
       More aMore = new More();
        aMore.printName();
    }
}
