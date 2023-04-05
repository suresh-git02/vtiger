package extra;

import java.util.HashMap;
import java.util.Map;

public class map {
public static void main(String[] args) {
   HashMap<Integer,String>  map= new HashMap<Integer, String>();
  map.put(101,"suresh");
  map.put(102,"rakesh");
  map.put(103,"srikanta");
  map.put(104,"rasa");
  map.put(105,"suvandu");             //for add date in hashmap
  map.put(106,"sania");
  map.put(106,"dillip");
  map.put(108,"abhijit");
System.out.println(map);

//putall


System.out.println(map.containsKey(104));
System.out.println(map.containsKey(106));    //check wheather that porticular key is present or not

System.out.println(map.containsValue("suresh"));
System.out.println(map.containsValue("alekh"));    //check wheather that porticular value is present or not

  map.remove(106);
  System.out.println(map);
  System.out.println(map.containsKey(106));
  
  
  System.out.println(map.get(105));
  System.out.println(map.get(106));     //to get the value of perticular key
  System.out.println(map.get(109));
  
  System.out.println(map.values());
  System.out.println(map.keySet());
  System.out.println(map.entrySet());
  
  for(int i:map.keySet())
  {
	  System.out.println(i);
  }
  for(String s:map.values())
  {
	  System.out.println(s);
  }
for(int ag:map.keySet())
{
	System.out.println(ag+"  "+map.get(ag));
	
}
 for( Map.Entry ag2:map.entrySet())
 {
	 System.out.println(ag2.getKey()+"  "+ag2.getValue());
 }
  
}




}

