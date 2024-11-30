package ch03_template;

public class CharDisplay extends AbstractDisplay{
    @Override
    protected void open() {
        System.out.println("charDisplay Open!");
    }

    @Override
    protected void close() {
        System.out.println("charDisplay Close!");
    }

    @Override
    protected void print() {
        int i = 5;
        while(i-- > 0) {
            System.out.println("char " + i);
        }
    }
}
