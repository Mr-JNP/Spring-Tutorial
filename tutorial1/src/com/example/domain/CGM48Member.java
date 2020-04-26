package com.example.domain;

public class CGM48Member implements Member{

    private String name;
    private Catchphrase catchphrase;

    public CGM48Member(String name, Catchphrase catchphrase) {
        this.name = name;
        this.catchphrase = catchphrase;
    }

    @Override
    public void sayHello() {
        System.out.println("I am "+this.name+". Hello from Chiang Mai!");
    }

    @Override
    public void sayCatchphrase() {
        System.out.println(catchphrase.getCatchphrase());
    }
}
