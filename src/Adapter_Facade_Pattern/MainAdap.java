package Adapter_Facade_Pattern;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 어댑터-> 클래스의 인터페이스를 클라이언트가 원하는 형태의 또 다른 인터페이스로 변환해주는 역할 a.k.a wrapper
 * Object wrapping
 * 서로 호환되지 않는 두개의 인터페이스를 연결
 * 서로 다른 인터페이스 두개를 동일하게 변환
 * 객체 지향 어댑터 -> 일상 생활의 어댑터와 같은 역할, 어떤 인터페이스를 클라이언트에서 요구하는 형태의 인터페이스에 적응시켜줌.
 * 문제: 사용객채의 API(APPLICATION PROGRAMMING INTERFACE)가 다름
 * 해결방안: 함수를 변환하는 객체를 중간에 넣는다.
 * 결과: 변경 최소화
 * 퍼사드 -> 서브시스템에 있는 여러개의 인터페이스를 통합하는 한개의 인터페이스를 제공. -->서브시스템의 사용을 편하게 하기 위해 고급수준의 인터페이스를 정의하는 것.
 * 퍼사드는 인터페이스 정의-> 필요한 메소드들의 클래스를 전부 멤버변수로
 * 클라이언트는 퍼사드를 호출해야댐!!!! NOT 개별 class
 * 문제: 서브시스템이 너무 많고 사용하기 복잡함
 * 해결방안: 단순한 인터페이스를 제공하는 객체를 중간에 넣음
 * 결과:최소 지식 원칙에 입각해 의존성 최소화
 */

public class MainAdap {
    public static void main(String[] args){
        MallardDuck duck  = new MallardDuck();
        WildTurkey turkey= new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says");
        turkey.gobble();
        turkey.fly();
        System.out.println("\n The Duck says");
        duck.fly();
        duck.quack();
        System.out.println("\n The Adapter says");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
        Vector v = new Vector();
        for(int i=0; i<10; i++){
            v.add(i);
        }
        /**
         * check
         */
        /*
        Iterator it = v.iterator();
        Iterator1.printIterator(it);
        Enumeration e = v.elements();
        Enumeration1.printEnumeration(e);

         */
        /*
        Enumeration e = v.elements();
        EnumerationIterator it= new EnumerationIterator(e);
        Iterator1.printIterator(it);
        ArraysAdapter a = new ArraysAdapter();
        System.out.printf("cities.length= %d\n",a.cities.length);
        System.out.printf("cityList size= %d\n",a.cityList.size());
        a.cityList.set(0,"Suwon");
        System.out.println("\nPrint out cities");
        for(String s: a.cities){
            System.out.println(s);
        }
        System.out.println("\nPrint out cityList");
        for(String s: a.cityList){
            System.out.println(s);
        }

         */
    }
    class Enumeration1 {
        public void printEnumeration(Enumeration e){
            while(e.hasMoreElements()){
                System.out.println(""+e.nextElement());

            }
        }
    }
    class Iterator1{
        public void printIterator(Iterator it){
            while(it.hasNext()){
                System.out.println(""+it.next());
            }
        }
    }
    static class ArraysAdapter{
        String[] cities={"Seoul","Inchen","Anyang"};
        List<String>cityList= Arrays.asList(cities);

    }

}

