package Adapter.DelegationAdapter;

import Adapter.ClassAdapter.Print;
import Adapter.ClassAdapter.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
