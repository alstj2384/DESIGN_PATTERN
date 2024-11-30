package ch02_adapter.instance_pattern;


import ch02_adapter.instance_pattern.banner.PrintBannerAdapter;

public class Main {
    public static void main(String[] args) {

        // PrintBanner 어댑터를 사용하여 출력
        Print p = new PrintBannerAdapter("Hello");

        p.printWeak();
        p.printStrong();
    }
}
