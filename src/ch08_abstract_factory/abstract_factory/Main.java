package ch08_abstract_factory.abstract_factory;

import ch08_abstract_factory.abstract_factory.factory.Factory;
import ch08_abstract_factory.abstract_factory.factory.Link;
import ch08_abstract_factory.abstract_factory.factory.Page;
import ch08_abstract_factory.abstract_factory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2){
            System.exit(0);
        }
        String filename = args[0];
        String classname = args[1];

        Factory factory = Factory.getFactory(classname);

        // Blog
        Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "https://example.com/blog1");
        Link blog3 = factory.createLink("Blog 3", "https://example.com/blog1");

        Tray blogTray = factory.createTray("Blog Site");

        Link news1 = factory.createLink("News 1", "https://example.com/news1");
        Link news2 = factory.createLink("News 2", "https://example.com/news2");
        Tray news3 = factory.createTray("News 3");

        news3.add(factory.createLink("News 3 (US)", "https://example.com/news3us"));
        news3.add(factory.createLink("News 3 (KR)", "https://example.com/news3kr"));

        Tray newsSite = factory.createTray("News Site");
        newsSite.add(news1);
        newsSite.add(news2);
        newsSite.add(news3);

        Page page = factory.createPage("Blog and News", "Youngjin.com");
        page.add(blogTray);
        page.add(newsSite);

        page.output(filename);
    }
}
