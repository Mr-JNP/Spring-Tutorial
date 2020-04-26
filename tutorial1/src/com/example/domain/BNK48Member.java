package com.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("BNK48")
public class BNK48Member implements Member {

    private Catchphrase catchphrase;
    private String name;

    @Override
    public void sayHello() {
        System.out.println("I am "+this.name+". Hello from Bangkok!");
    }

    @Override
    public void sayCatchphrase() {
        System.out.println(catchphrase.getCatchphrase());
    }

    @Autowired
    public void setName(@Value("${member1.name}") String name){
        this.name = name;
    }

    @Autowired
    public void setCatchphrase(@Qualifier("coolCatchphrase") Catchphrase catchphrase){
        this.catchphrase = catchphrase;
    }
}
