import java.util.*;
class Set_Interface {
    public static void main(String args[])
    {
        HashSet<String> set=new HashSet<String>();
        set.add("Robin");
        set.add("Ussop");
        set.add("Franky");
        set.add("Chopper");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
