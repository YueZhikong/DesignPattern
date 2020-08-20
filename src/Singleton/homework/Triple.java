package Singleton.homework;

import java.util.ArrayList;

public class Triple {
    private static Triple[] triples = new Triple[]{new Triple(),new Triple(),new Triple()};
    private Triple(){}

    public static Triple getInstance(int id) {
        return triples[id];
    }

    public static void main(String[] args) {
        Triple one = Triple.getInstance(0);
        Triple two = Triple.getInstance(1);
        System.out.println(one == two);
    }
}
