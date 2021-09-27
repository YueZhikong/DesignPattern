package com.yang.pattern.factory.a;

public class SimpleRouJiaMoFactory {

    public RouJiaMo createRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = null;
        switch (type) {
            case "Suan":
                rouJiaMo = new SuanRouJiaMo();
                break;
            case "Tian":
                rouJiaMo = new TianRouJiaMo();
                break;
            case "La":
                rouJiaMo = new LaRouJiaMo();
                break;
        }
        return rouJiaMo;
    }
}
