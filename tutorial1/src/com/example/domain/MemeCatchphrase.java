package com.example.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class MemeCatchphrase implements Catchphrase{

    String[] a = {"Catchphrase 1", "Catchphrase 2", "Catchphrase 3"};
    ArrayList<String> catchphrases = new ArrayList(Arrays.asList(a));

    @Override
    public String getCatchphrase() {
        Random random = new Random();
        int index = random.nextInt(3);
        return catchphrases.get(index);
    }
}
