
//Class to create a Generic Stack, inherits froms GenericList class
public class GenericStack<I> extends GenericList<I>{

    //Parameterized Constructor for stack
    //      Uses add() function
    GenericStack(I data){

        setHead(null); //initialize head of list
        setLength(0); //initialize length of list
        this.add(data); //add node to stack
    }

    //Function to add node into Stack
    //      Overrides add from super class
    @Override
    void add(I data){

        //create new Node and initialize
        Node<I> temp = new Node<I>();
        temp.data = data;
        temp.next = getHead();

        //New Node becomes the new Head
        setHead(temp);

        //Update length
        setLength(getLength()+1);

    }

    //push element to stack
    void push(I data){
        //add element to stack
        this.add(data);
    }

    //pop element to stack
    public I pop(){
        //delete element and return value
        return this.delete();
    }

}
