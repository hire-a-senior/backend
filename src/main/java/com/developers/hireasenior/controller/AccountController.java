package com.developers.hireasenior.controller;

import com.developers.hireasenior.dto.AccountDto;
import com.developers.hireasenior.dto.request.ListSeniorsRequest;
import com.developers.hireasenior.dto.response.ApiResponse;
import com.developers.hireasenior.service.AccountService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/account")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/list-seniors")
    public ResponseEntity<ApiResponse<List<AccountDto>>> listSeniors(@Valid @RequestBody ListSeniorsRequest request) {
        return ResponseEntity.ok(accountService.listSeniors(request));
    }
}
