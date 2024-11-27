package template;

import java.io.InputStream;

public abstract class AbstractDisplay {
    public final void display(){
        open();
        close();
        print();
    }

    protected abstract void open();
    protected abstract void close();
    protected abstract void print();
}
