package com.example.springTest.ThreadLearn;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public final class Employee {
  private final Worker worker;
  private final String name;

  public Employee(Worker worker, String name) {
    Worker worker1 = new Worker(worker.getNum());
    this.worker = worker1;
    this.name = name;
  }
  public Worker getWorker() {
    return worker;
  }

  public String getName() {
    return name;
  }

  public static void main(String args[]){
    Worker d = new Worker(1);
    Employee emp = new Employee(d,"Shubham");
    d.SetNum(2);
    System.out.println(emp.getWorker().getNum());

    List<Integer> entries = Arrays.asList(5,2,2,7,6,1,1) ;
    HashSet<Integer> set = new HashSet<>();
    List<Integer> duplicate = entries.stream().filter(entry -> !set.add(entry)).collect(Collectors.toList());
    System.out.println(duplicate);

    List<Integer> duplicate1 =  entries.stream().map(entry-> entry*2).collect(Collectors.toList());

    Predicate<Integer> pr = a -> (a > 18);
    System.out.println(pr.test(50));

    Function<Integer,Integer> fn = a -> (a*a);
    System.out.println(fn.apply(4));

    Supplier<Double> randomValue = () -> Math.random();
    System.out.println(randomValue.get());

    Consumer<String> print = (val) -> System.out.println("Value is : " + val);
    print.accept("Hello");

    Comparable<Integer> comp = a -> a > 2 ? 1 : -1;
    System.out.println(comp.compareTo(3));

    Comparator<Integer> comparator = (a1,a2) -> a1 > a2 ? 1 : -1;
    System.out.println(comparator.compare(5,6));

    Integer a1 = 128;
    Integer a2 = 128;
    System.out.println((a1==a2));
    System.out.println((a1.equals(a2)));


    Integer value1 = null;
    Integer value2 = new Integer(10);
    Optional<Integer> opt1 = Optional.of(value2);
    Optional<Integer> opt2 = Optional.ofNullable(value1);

    List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
    String result = letters
            .stream()
            .reduce(
                    "", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
    System.out.println(result);

  }
}
class Worker {
  private int num;

  Worker(int num) {
    this.num = num;
  }
  public void SetNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }

}
