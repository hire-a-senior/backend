package com.developers.hireasenior.controller;

import com.developers.hireasenior.dto.response.ApiResponse;
import com.developers.hireasenior.service.VerificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/verification")
@AllArgsConstructor
public class VerificationController {
    private final VerificationService verificationService;

    @GetMapping("/verify-mail")
    public ResponseEntity<ApiResponse> verifyMail(@RequestParam String email, @RequestParam String token) {
        return ResponseEntity.ok(verificationService.verifyEmail(email, token));
    }
}
