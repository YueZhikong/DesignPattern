package com.yang.pattern.factory.b;

import com.yang.pattern.factory.a.RouJiaMo;

public class Test {
    public static void main(String[] args) {

        RoujiaMoStore roujiaMoStore = new XianRouJiaMoStore();
        RouJiaMo suanRoujiaMo = roujiaMoStore.sellRouJiaMo("Suan");
        System.out.println(suanRoujiaMo.name);

    }
}
