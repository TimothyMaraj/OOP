
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Pizza pizaList = new Pizza("Pep","Stary Lane");
        pizaList.printTopping();

        RestrauntQueue delieveryServiceQueue = new RestrauntQueue();


        delieveryServiceQueue.enqueue(new Pizza("pepperoni", "1234 Bobcat Trail")); // creates an object to enque/ a vari or another object will reference this object until dequ
        delieveryServiceQueue.enqueue(new Pizza("sausage", "2345 University Drive"));
        delieveryServiceQueue.dequeue();
        delieveryServiceQueue.enqueue(new Pizza("extra cheese", "3456 Rickster Road"));
        delieveryServiceQueue.enqueue(new Pizza("everything", "4567 King Court"));
        delieveryServiceQueue.enqueue(new Pizza("coffee beans", "5678 Java Circle"));
        delieveryServiceQueue.dequeue();
        delieveryServiceQueue.dequeue();
        delieveryServiceQueue.dequeue();
        delieveryServiceQueue.dequeue();
        delieveryServiceQueue.dequeue();
    }
}