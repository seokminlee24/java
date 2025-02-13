package com.example.java.controller;

import com.example.java.dto.c38.Customer;
import com.example.java.dto.c38.Employee;
import com.example.java.mapper.Mapper04;
import com.example.java.mapper.Mapper08;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("main38")
@RequiredArgsConstructor
public class Controller38 {
    private final Mapper08 mapper08;

    @GetMapping("sub1")
    public void method1() {
        mapper08.update1();
    }

    @GetMapping("sub2")
    public void method2() {
        mapper08.update2("흥민", "득점왕", "토트넘",
                "런던", "3333", "영국", 2);
    }

    @GetMapping("sub3")
    public void method3() {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("카카");
        customer.setContactName("아이콘");
        customer.setAddress("리우");
        customer.setCity("상파울로");
        customer.setCountry("브라질");
        customer.setPostalCode("5555");
        mapper08.update3(customer);
    }

    // /main38/sub4?name=지성&contactName=코치&address=신촌&city=서울&country=한국&postalCode=777&id=2
    @GetMapping("sub4")
    public void method4(String name, String contactName,
                        String address, String city,
                        String country, String postalCode,
                        Integer id) {
        mapper08.update2(name, contactName, address, city, postalCode, country, id);
    }

    // /main38/sub5?name=정환&contactName=포워드&address=강남&city=인천&country=한국&postalCode=999&id=2
    @GetMapping("sub5")
    public void method5(Customer customer) {
        mapper08.update3(customer);
    }

    // /main38/sub6?id=1&lastName=강인&firstName=이&birthDate=2002-02-02&photo=사진3&notes=생제르맹
    // 요청을 보내면 1번 직원의 정보가 수정되도록
    // 6번째 메소드, mapper의 update4, dto 만들기
    @GetMapping("sub6")
    public void method6(Employee employee) {
        mapper08.update4(employee);
    }

    @GetMapping("sub7")
    public void method7(Integer id, Model model) {
        Customer customer = mapper08.select1(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
        }
    }

    @PostMapping("sub8")
    public void method8(Customer customer) {
        mapper08.update3(customer);
    }

    // 직원정보 변경하는 코드 작성
    @GetMapping("sub9")
    public void method9(Integer id, Model model) {
        Employee employee = mapper08.select02(id);
        model.addAttribute("employee", employee);
    }

    @PostMapping("sub10")
    public void method10(Employee employee) {
        mapper08.update4(employee);
    }

    @GetMapping("sub11")
    public void method11() {
        Customer customer = new Customer();
        customer.setName("한강");
        customer.setContactName("노벨상");
        customer.setPostalCode("5555");
        customer.setCountry("한국");
        customer.setCity("광주");
        customer.setAddress("서울");

        System.out.println("customer 입력전 = " + customer);
        mapper08.insert01(customer);
        System.out.println("customer 입력후 = " + customer);
    }

    @GetMapping("sub12")
    public void method12() {
        Employee employee = new Employee();
        employee.setLastName("이");
        employee.setFirstName("석민");
        employee.setBirthDate(LocalDate.parse("2000-07-06"));
        employee.setPhoto("game2.jpg");
        employee.setNotes("메모");

        System.out.println("employee 입력전 = " + employee);
        mapper08.insert02(employee);
        System.out.println("employee 입력후 = " + employee);
    }
}
