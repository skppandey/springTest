package com.example.springTest;

import java.util.*;
import java.util.stream.Collectors;


  public class App {


    public static void main(String[] args) {

      //existingOrders[{customer_id=258, order_id=6},{customer_id=259, order_id=7}]
      //customers today's order: [{customer_id=258},{customer_id=350}]
      //[{customer_id=259, order_id=7}]


      List<Map<String, String>> existingCustomers = new ArrayList<Map<String, String>>();
      List<Map<String, String>> newCustomers = new ArrayList<Map<String, String>>();

      Map<String, String> hashMap = new HashMap<String, String>()
      {{
        put("customer_id", "258");
        put("order_id", "6");

      }};

      Map<String, String> hashMap1 = new HashMap<String, String>()
      {{
        put("customer_id", "259");
        put("order_id", "7");

      }};
      existingCustomers.add(hashMap);
      existingCustomers.add(hashMap1);

      Map<String, String> hashMap2 = new HashMap<String, String>()
      {{
        put("customer_id", "258");

      }};

      newCustomers.add(hashMap2);

      System.out.println("existingCustomers " + existingCustomers);
      System.out.println("newCustomers " + newCustomers);

      final List<Map<String, String>>[] out = new List[]{new ArrayList<>()};
      newCustomers.stream().forEach(newCustomer ->{
        out[0] =  existingCustomers.stream().filter(
                existingCustomer ->
                        !existingCustomer.get("customer_id").equals(newCustomer.get("customer_id"))).collect(Collectors.toList());
      });


      /// your answer
      System.out.println(out[0] + " result");  //result
//      System.out.println(result1);

    }


}
