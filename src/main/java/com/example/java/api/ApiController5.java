package com.example.java.api;

import com.example.java.dto.a5.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/main5")
public class ApiController5 {

    @GetMapping("sub8")
    @ResponseBody
    public Book sub8() {
        Book book = new Book();
        book.setPrice(50000);
        book.setAuthor("한강");
        book.setContent("소설");
        book.setTitle("제목");

        return book;
    }

    @GetMapping("sub7")
    @ResponseBody
    public Map<String, Object> sub7() {
        return Map.of("product", Map.of("name", "컴퓨터",
                        "price", "1000",
                        "quantity", "1"),
                "company", Map.of("location", List.of("서울", "부산")));
    }

    @GetMapping("sub6")
    @ResponseBody
    public Map<String, Object> sub6() {
        return Map.of("name", "son",
                "items", List.of("치킨", "돈까스", "떡볶이"),
                "team", Map.of("name", "토트넘", "location", "런던"));
    }

    @GetMapping("sub5")
    @ResponseBody
    public Map<String, Object> sub5() {
        return Map.of("title", "책제목", "content", "책 내용",
                "price", 15000, "available", true);
    }

    @GetMapping("sub4")
    @ResponseBody
    public Map<String, Object> sub4() {
        return Map.of("name", "kim", "age", 44);
    }

    @GetMapping("sub3")
    @ResponseBody
    public String method3() {
        System.out.println("ApiController5.method3");
        return "seoul";
    }

    @GetMapping("sub1")
    @ResponseBody
    public String method1() {
        System.out.println("ApiController5.method1");
        return "sub1";
    }
}