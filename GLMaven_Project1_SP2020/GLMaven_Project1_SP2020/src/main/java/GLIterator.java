import java.util.Iterator;

//GLIterator class implements an Interface - Iterator
public class GLIterator<I> implements Iterator {

    //Data member
    GenericList<I>.Node<I> newNode;

    //Parameterized constructor, takes in Node as parameter
    GLIterator(GenericList<I>.Node<I> head){

        newNode = head;
    }

    //Checks if the given Node has a next Node
    @Override
    public boolean hasNext() {

        //Check if given Node is itself null.
        if(newNode == null){
            return false;
        }

        //Check if given Node has a next.
        if(newNode.next != null){
            return true;
        }else{
            return false;
        }
    }

    //Go to the node after the given Node and return the value of the given Node
    @Override
    public I next() {

        I currentVal = newNode.data; //Store current Node data in currentVal
        newNode = newNode.next; //
        return currentVal;

    }
}
