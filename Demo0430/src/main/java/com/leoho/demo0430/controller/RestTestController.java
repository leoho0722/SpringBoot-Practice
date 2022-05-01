package com.leoho.demo0430.controller;

import com.leoho.demo0430.model.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // GET、PUT、POST、DELETE
public class RestTestController {
    @GetMapping("/getTest")
    public ResponseEntity<?> getTest() {
        return ResponseEntity.ok(123456789);
    }

    @PostMapping("/postTest")
    public ResponseEntity<?> postTest(@RequestBody Users user) {
        return ResponseEntity.ok(1234546);
    }

}
