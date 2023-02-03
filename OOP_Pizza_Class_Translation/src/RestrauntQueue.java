public class RestrauntQueue
{
    public Pizza head = null;
    public Pizza tail = null;

    public void enqueue(Pizza createdPizza)
    {
        if(head == null)
            head = createdPizza;
        else // have to think a little here: tail is der in the c++ code
            tail.next = createdPizza;
        tail = createdPizza;
    }

    public Pizza dequeue() // pass by ref or value?
    {
        Pizza pizzatodeliver = null;
        if(head != null)
        {
            pizzatodeliver = head;
            head = head.next; // is this how you would do this?
            // in c++ we would need to deref to acess that next address
            // but here we initailise the head to the
        }
        if(head == null)
        {
            tail = null;
        }
        return pizzatodeliver;
    }

    public void deliver()
    {
        Pizza thisPizza = dequeue();
        if(thisPizza == null)
        {
            System.out.println("No deliveries pending \n");
            return;
        }
        System.out.println("Deliver a pizza with " + thisPizza.topping + " to " + thisPizza.address + "\n");
    }
}
