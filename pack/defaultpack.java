package pack;
import pac.file1;
public class defaultpack extends file1{
public static void main(String[] args) {
    defaultpack df=new defaultpack();
    file1 f=new file1();

}
}
class C extends defaultpack{
    void display()
    {
        System.out.println(prot);
    }
}
