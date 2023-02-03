public class Pizza
{
    public String topping;
    public String address;
    public Pizza next;

    public Pizza()
    {
        this.topping = "";
        this.address = "";
        this.next = null;
    }
    public Pizza(String topping,String address)
    {
        this.topping = topping;
        this.address = address;
        this.next = null;
    }
}
