import java.util.*;
class Map_Interface {
    public static void main(String args[])
    {
        Map<Integer, String> map=new HashMap<Integer, String>();
        map.put(1,"Joyboy");
        map.put(2,"Imu");
        map.put(5,"Shanks");
        map.put(6,"Luffy");
        Set<Map.Entry<Integer, String>> set=map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr=set.iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>)itr.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}