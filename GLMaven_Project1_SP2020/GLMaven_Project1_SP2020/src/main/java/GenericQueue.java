
//Class to create a Generic Queue, inherits froms GenericList class
public class GenericQueue<I> extends GenericList<I>{

    //Parameterized Constructor for Queue
    //      Uses add() function
    GenericQueue(I data){
        setHead(null); //initialize head of list
        setLength(0); //initialize length of list to 0
        this.add(data); //adding node to queue
    }

    //Function to add node into Queue
    //      Overrides add from super class
    @Override
    void add(I data){

        //create new Node (temp) and initialize it
        Node<I> temp = new Node<I>();
        temp.data = data;
        temp.next = null;

        //check if list is empty
        if(getHead() == null){ //empty list
            setHead(temp);
        }else{                  // non-empty list

            //find last node in the queue
            Node<I> Last = getHead();
            while( Last.next != null ){
                Last = Last.next;
            }

            //node after te last node becomes the new Node (temp)
            Last.next = temp;
        }

        //update length
        setLength(getLength()+1);
    }

    //Pushing Node to queue
    void enqueue(I data)
    {
        //adding node to Queue
        this.add(data);
    }

    //Popping Node from front of the Queue
    public I dequeue(){

        //Deleting front Node in the queue.
        return this.delete();
    }

}
