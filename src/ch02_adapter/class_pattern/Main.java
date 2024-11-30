package ch02_adapter.class_pattern;

import ch02_adapter.class_pattern.banner.PrintBannerAdapter;
import ch02_adapter.class_pattern.new_banner.PrintNewBannerAdapter;

public class Main {
    public static void main(String[] args) {

        // PrintBanner 어댑터를 사용하여 출력
        Print p = new PrintBannerAdapter("Hello");

        p.printWeak();
        p.printStrong();

        // 어댑터를 PrintNewBanner로 변경하여 출력

        p = new PrintNewBannerAdapter("Hello");

        p.printWeak();
        p.printStrong();

        // 인터페이스에 대한 구현체를 다르게 함으로써, 같은 메서드가 다른 동작을 수행하고 있음

    }
}
