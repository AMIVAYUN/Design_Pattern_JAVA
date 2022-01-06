package TemplateMethodPattern.Assignment;

import TemplateMethodPattern.Assignment.AgeSorter;
import TemplateMethodPattern.Assignment.NameSorter;
import TemplateMethodPattern.Assignment.Person;

import java.util.Arrays;

/**
 * AgeSorter.java와 NameSorter.java에 있는 bubbleSort() 함수의 코드(버블 정렬 알고리즘)를 추상화시키고,
 * 그 중 이름과 나이를 비교하는 부분을 자식 클래스들로 위임하는 형태로 코드를 작성할 것
 */

public class MainTest {
	public static void main(String[] args) {
		Person[] people = {
			new Person(3000, "Dooly"),
			new Person(30, "Ddochi"),
			new Person(25, "Michol"),
			new Person(20000, "Douner"),
			new Person(3, "HeeDong")
		};
		System.out.println("\noriginal people");
		for (Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("\nsort by Name");
		NameSorter sorter = new NameSorter();
		sorter.bubbleSort(people);
		for (Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("\nsort by Age");
		AgeSorter sorter2 = new AgeSorter();
		sorter2.bubbleSort(people);
		for (Person p : people) {
			System.out.println(p);
		}
	}

}
