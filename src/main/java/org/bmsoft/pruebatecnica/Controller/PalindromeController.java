package org.bmsoft.pruebatecnica.Controller;

import org.bmsoft.pruebatecnica.Entity.PalindromeRequest;
import org.bmsoft.pruebatecnica.Entity.PalindromeResponse;
import org.bmsoft.pruebatecnica.Service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/palindrome")
public class PalindromeController {

    @Autowired
    private PalindromeService palindromeService;

    @PostMapping
    public ResponseEntity<PalindromeResponse> checkPalindrome(@RequestBody PalindromeRequest request) {
        PalindromeResponse response = palindromeService.processPalindrome(request);
        return ResponseEntity.ok(response);
    }
}