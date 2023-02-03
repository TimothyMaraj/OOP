

/*
* Author:     Timothy Maraj
* Class:      OOP
* Instructor: Rick
* Date:       1/27/2023
* Objective: Translate C++ Code to Java
*
*
* */


public class Main {
    public static void main(String[] args)
    {
        Main main_object = new Main();
        main_object.onestore();
        main_object.twostore();
    }
    private void onestore()
    {
        RestrauntQueue delieveryServiceQueue = new RestrauntQueue();

        delieveryServiceQueue.enqueue(new Pizza("pepperoni", "1234 Bobcat Trail")); // creates an object to enque/ a vari or another object will reference this object until dequ
        delieveryServiceQueue.enqueue(new Pizza("sausage", "2345 University Drive"));
        delieveryServiceQueue.deliver();
        delieveryServiceQueue.enqueue(new Pizza("extra cheese", "3456 Rickster Road"));
        delieveryServiceQueue.enqueue(new Pizza("everything", "4567 King Court"));
        delieveryServiceQueue.enqueue(new Pizza("coffee beans", "5678 Java Circle"));
        delieveryServiceQueue.deliver();
        delieveryServiceQueue.deliver();
        delieveryServiceQueue.deliver();
        delieveryServiceQueue.deliver();
        delieveryServiceQueue.deliver();

    }

    private void twostore()
    {

        RestrauntQueue delieveryService1 = new RestrauntQueue();
        RestrauntQueue delieveryService2 = new RestrauntQueue();


        delieveryService1.enqueue( new Pizza("111111", "111111111111111"));
        delieveryService1.enqueue( new Pizza("222222", "222222222222222"));
        delieveryService1.enqueue( new Pizza("333333", "333333333333333"));
        delieveryService1.enqueue( new Pizza("444444", "444444444444444"));
        delieveryService1.enqueue( new Pizza("555555", "555555555555555"));
        delieveryService1.enqueue( new Pizza("666666", "666666666666666"));

        delieveryService2.enqueue( new Pizza("AAAAAA", "AAAAAAAAAAAAAAA"));
        delieveryService2.enqueue( new Pizza("BBBBBB", "BBBBBBBBBBBBBBB"));
        delieveryService2.enqueue( new Pizza("CCCCCC", "CCCCCCCCCCCCCCC"));
        delieveryService2.enqueue( new Pizza("DDDDDD", "DDDDDDDDDDDDDDD"));
        delieveryService2.enqueue( new Pizza("EEEEEE", "EEEEEEEEEEEEEEE"));
        delieveryService2.enqueue( new Pizza("FFFFFF", "FFFFFFFFFFFFFFF"));

        delieveryService1.deliver();
        delieveryService1.deliver();
        delieveryService1.deliver();
        delieveryService1.deliver();
        delieveryService1.deliver();
        delieveryService1.deliver();
        delieveryService1.deliver();

        delieveryService2.deliver();
        delieveryService2.deliver();
        delieveryService2.deliver();
        delieveryService2.deliver();
        delieveryService2.deliver();
        delieveryService2.deliver();
        delieveryService1.deliver();


    }


}