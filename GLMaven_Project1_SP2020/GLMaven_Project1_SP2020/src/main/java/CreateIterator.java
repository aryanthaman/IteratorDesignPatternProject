import java.util.Iterator;

public interface CreateIterator<I> {

    abstract public GLIterator<I> createIterator();
}
