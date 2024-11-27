package template;

public class StringDisplay extends AbstractDisplay{
    @Override
    protected void open(){
        System.out.println("stringDisplay Open!");
    }

    @Override
    protected void close() {
        System.out.println("stringDisplay Close!");
    }

    @Override
    protected void print() {
        int i = 5;
        while(i-- > 0){
            System.out.println("String " + i);
        }
    }
}
