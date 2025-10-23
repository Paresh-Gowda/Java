import java.util.*;
class Array_List {
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Luffy");
        list.add("Zoro");
        list.add("Sanji");
        list.add("Nami");
        Iterator<?> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}