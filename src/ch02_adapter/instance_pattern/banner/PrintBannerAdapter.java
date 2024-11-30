package adapter.instance_pattern.banner;

import adapter.instance_pattern.Print;

public class PrintBannerAdapter extends Print {

    private Banner banner;

    public PrintBannerAdapter(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
