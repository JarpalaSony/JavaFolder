package pac;

public class file1 {
    protected int package1=30;
    int b=34;
    private int Private=45;
    protected int prot=67;
    void display()
    {
        System.out.println("the private variable:"+Private);
    }
}
class the{
    public static void main(String[] args) {
        file1 f=new file1();
        System.out.println(f.prot);
 
    }
}
