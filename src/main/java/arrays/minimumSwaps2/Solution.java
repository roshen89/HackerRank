package arrays.minimumSwaps2;

import static com.sun.javafx.fxml.expression.Expression.divide;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.print.DocFlavor.BYTE_ARRAY;

/**
 * @author ROSH - 1/26/2020
 */
//public class Solution {
//
//  private static final char SEP = 0x20;
//  private static final int SEP1 = 1;
//
//
//  public static void main(String[] args) {
//    int a =1;
//    int b =a++;
//    int c=++b;
//
//    System.out.println(a+","+b+","+c);
//
//    int d =1<<2;
//
//    System.out.println(d);
//
//    System.out.println(max(4,5));
//
//    System.out.println(SEP+SEP1+"=A");
//
//  }
//  static int max(int a , int b){
//    return (a>b)?a:b;
//  }
//
//
//  public class Car{
//    public Car(int i){
//      z=i;
//    }
//
//    public abstract int maxNumberPassengers();
//
//    private int z;
//  }
//
//  public class Sedan extends Car{
//    public Sedan(int f){
//      super(f);
//    }
//
//    public int maxNUmb(){return z*1;}
//  }

//
//  public static void main(String[] args) {
//   List<String> textList = new ArrayList<>();
//    textList.add("bad");
//    textList.add("baa");
//    textList.add("bad");
//    textList.add("ba");
//
//    if(textList!=null){
////      for(Iterator iterator = textList.iterator(); iterator.hasNext();){
////        if("bad".equals(iterator.next())) iterator.remove();
////      }
//
//    }
//    System.out.println(textList);
//  }


class FindValue{

//  public static void main(String[] args) {
//    for(byte b= Byte.MIN_VALUE;b<Byte.MAX_VALUE;b++){
//      if(b==0x90){
//        System.out.println(b);
//        System.out.println("we");
//      }
//    }
//  }
//public static void main(String[] args) {
//  Map<Integer,String> ha = new HashMap<>(5);
//  ha.put(1, "app");
//  ha.put(2, null);
//  ha.put(new Integer(3), "op");
//  ha.put(3, "as");
//  ha.put(4, "fdfd");
//
//  for(String v: ha.values()){
//    if("as".equals(v)){
//      ha.put(5,"ban");
//    }
//  }
//  System.out.println(ha.get(5));
//}

  public static void main(String[] args) {
//    final List<Integer> list = new ArrayList<>();
//    Collections.addAll(list,1,5,2,3,7,3,8,9);
//    final Integer pos = Integer.valueOf(3);
//
//    list.remove(pos);
//
////    System.out.println(list);
//
//    Pattern p = Pattern.compile("^[0-9]+$");
//    Matcher m = p.matcher("9\na");
//    if (m.find()){
//      System.out.println(true);
//    }




  }

  class SomeClass{
    void dvide(int n, int den) throws Exception {

      if(den==0){
        throw new Exception("sds");
      }
      System.out.println(""+(n/den));
    }
    void fun(){
      divide(4,2);
    }
  }





//
//  class Node{
//    public int v;
//    public Node next;
//  }
//
//  class LinkedList{
//    private Node f;
//    public void AddN(Node node){
//      if(f==null){
//        f=node;
//      }else if(f!=null){
//        node.next=f
//      }
//    }
//  }

}