package ch07_builder.solution.P7_1.builder;

public interface Builder {
    public void makeTitle(String title);
    public void makeString(String str);
    public void makeItems(String[] items);
    public void close();
}
