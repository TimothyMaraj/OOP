public class Pizza {
    private String topping;
    private String address;
    public Pizza next; // ? how does this point thing work

    // the referene usage will skip the pointer def
    // needed in c++: the ref in java are also
    // mutable meaning i can reassigna
    // ref
    public Pizza(String topping, String address)
    {
        this.topping = topping;
        this.address = address;
        this.next = null;
    }

    public void printTopping()
    {
        System.out.println(this.topping);
    }

}

// now do i make this functions in the same class file or do
// i use this in main?
// this boils down to is the class implementing this functions or are these func
// implementing the class and interacting with objects?
