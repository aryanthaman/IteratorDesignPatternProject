import java.util.ArrayList; //used in dumpList() function

//Creates a GenericList that implements CreateIterator Interface
abstract public class GenericList<I> implements CreateIterator{

    //Node Class - Inner
    class Node<T>{
        T data;
        Node<T> next;
    }

    //Data members: Node and length
    private Node<I> Head;
    private int length;

    //To print List
    void print(){

        if(length == 0){ //Empty List
            System.out.println("Empty List");
        }else{ //Non-Empty List
            Node<I> temp = getHead();
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    //Abstract method to add Node to List
    abstract void add(I data);

    //Delete Node from the List
    public I delete(){

        //Empty List
        if(length == 0){
            return null;
        }

        I deletedVal = getHead().data; //Delete Node by updating head
        setHead(getHead().next); //Update Head
        length--; //Update length
        return deletedVal;
    }

    //Dump list into an ArrayList and return the ArrayList
    public ArrayList<I> dumpList(){

        //Get Head and iterate through the list
        Node<I> tempHead = getHead();
        ArrayList<I> retList = new ArrayList<>();
        while(tempHead != null){

            //Add to ArrayList by deleting a value from the GenericList instance
            retList.add( this.delete() );
            tempHead = tempHead.next;
        }
        return retList;
    }

    //Getters:
    public int getLength() {
        return length;
    }

    public Node<I> getHead() {
        return Head;
    }

    //Setters:
    public void setLength(int length) {
        this.length = length;
    }

    public void setHead(Node<I> head) {
        Head = head;
    }



    //Overriding createIterator()
    @Override
    public GLIterator<I> createIterator(){

        //passing head to GLIterator and returning the iterator
        return new GLIterator<I>(getHead());
    }

}
