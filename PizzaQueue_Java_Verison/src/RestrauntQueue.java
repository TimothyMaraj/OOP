public class RestrauntQueue
{
    // the referene usage will skip the pointer def
    // needed in c++: the ref in java are also
    // mutable meaning i can reassigna
    // ref


    // its not to make this static aka all of the class has one copy of each
    // not to make public becuz then you have a bunch of unlinked lists
    // ? make another class that handles that ?
    // so that class would be like a restraunt class
    // the restaunt class would have a pizza head and tail
    // and then you can add or sub from there? couldnt I make this class
    // the deleivery class the that class?

    private Pizza head;
    private Pizza tail;


    public void enqueue(Pizza createdPizza)
    {
        if(head == null)
            head = createdPizza;
        else // have to think a little here: tail is der in the c++ code
            tail.next = createdPizza;
    }

    public Pizza dequeue() // pass by ref or value?
    {
        Pizza pizzatodeliver = null;
        if(head != null)
        {
            pizzatodeliver = head;
            head = this.next; // is this how you would do this?
            // in c++ we would need to deref to acess that next address
            // but here we init the head to the
        }
        if(head == null)
        {
            tail = null;
        }
        return pizzatodeliver;
    }

}

