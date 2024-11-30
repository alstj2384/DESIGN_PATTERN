package ch02_adapter.class_pattern.banner;

import ch02_adapter.class_pattern.Print;

public class PrintBannerAdapter extends Banner implements Print {

    public PrintBannerAdapter(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
