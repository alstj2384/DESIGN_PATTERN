package ch02_adapter.class_pattern.new_banner;

import ch02_adapter.class_pattern.Print;

public class PrintNewBannerAdapter extends NewBanner implements Print {

    public PrintNewBannerAdapter(String s) {
        super(s);
    }

    @Override
    public void printWeak() {
        this.lowerCase();
    }

    @Override
    public void printStrong() {
        this.upperCase();
    }
}
