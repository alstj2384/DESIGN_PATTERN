package ch08_abstract_factory.abstract_factory.factory;

public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
