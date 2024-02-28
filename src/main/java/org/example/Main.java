package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    LinkedList<String> list=    new LinkedList<String>();
       list.add("Amit");
       list.add("Prince");
       list.add("last1");
       list.addLast("last2");
       list.addFirst("First");

//  Iterator<String> iterator=    list.iterator();
//  while(iterator.hasNext()){
//      System.out.println(iterator.next());
//  }

//Iterator<String> iterator1= list.descendingIterator();
//  while (iterator1.hasNext()){
//      System.out.println(iterator1.next());
//  }

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        for(String name:list){
            System.out.println(name);
        }



















//
//        List<Integer> listOfInts=new ArrayList<>();
//        listOfInts.add(2);
//        listOfInts.add(5);
//        System.out.println(listOfInts);
//
//        List<String> listOfEmployees=new ArrayList<>(List.of("Amit","prince","Sumit"));
//        System.out.println(listOfEmployees);
//
//        Integer[] array={5,6,7,8};
//        List<Integer> listOfIntegers= Arrays.asList(array);
//
//        System.out.println(listOfIntegers);



        //iteration: using Iterator
//       Iterator<String> iterator= listOfNames.iterator();
//       while (iterator.hasNext()){
//           System.out.println(iterator.next());
//       }

        //itration using normal for loop

//        for(int i=0;i<listOfNames.size();i++){
//            System.out.println(listOfNames.get(i));
//        }

        //iteration using enhanced for loop
//        for(String name:listOfNames){
//            System.out.println(name);
//        }
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/tables");
//       List<WebElement> rows= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
//        List<String> listOfLastNames=new ArrayList<>();
//
//       for(WebElement row:rows){
//           listOfLastNames.add(row.findElement(By.xpath("td")).getText());
//       }
//        System.out.println(listOfLastNames);
//       driver.quit();
//
//
    }
}