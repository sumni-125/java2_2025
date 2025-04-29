package day3Prac.오후실습.박예린_실습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CustomerStream {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(1, "홍길동", "vvip", 5000),
            new Customer(2, "김유신", "vip", 3000),
            new Customer(3, "이순신", "bronze", 1000),
            new Customer(4, "강감찬", "vvip", 7000),
            new Customer(5, "유관순", "vip", 3500),
            new Customer(6, "윤봉길", "bronze", 1500),
            new Customer(7, "안중근", "vvip", 6000),
            new Customer(8, "신사임당", "vip", 4000),
            new Customer(9, "세종대왕", "bronze", 800),
            new Customer(10, "장영실", "vvip", 5500)
        ));

        // 1. vvip 등급 고객
        long vvipCount = customers.stream()
        	.filter(c -> c.getGrade().equalsIgnoreCase("vvip"))
        	.count();
        System.out.println("vvip: " + vvipCount);

        System.out.println("------");

        // 2. vip 등급 고객
        customers.stream()
        	.filter(c -> c.getGrade().equalsIgnoreCase("vip"))
        	.forEach(System.out::println);

        System.out.println("------");

        // 3. 포인트가 높은 순서로 정렬
        customers.stream()
        	.sorted(Comparator.comparingInt(Customer::getPoint).reversed())
        	.forEach(System.out::println);
    }
}