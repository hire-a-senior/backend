package com.developers.hireasenior.service;

import com.developers.hireasenior.dto.AccountDto;
import com.developers.hireasenior.dto.TechnologyDto;
import com.developers.hireasenior.dto.response.ApiResponse;
import com.developers.hireasenior.mapper.AccountMapper;
import com.developers.hireasenior.mapper.TechnologyMapper;
import com.developers.hireasenior.model.Account;
import com.developers.hireasenior.model.Technology;
import com.developers.hireasenior.repository.AccountRepository;
import com.developers.hireasenior.repository.TechnologyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AccountServiceTest {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private TechnologyRepository technologyRepository;

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private TechnologyMapper technologyMapper;

    @Mock
    private AccountMapper accountMapper;

    private Technology java;
    private Account alice;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        java = new Technology();
        java.setId("1");
        java.setName("Java");
        java.setCode("java");
        java.setDescription("Java programming language");

        alice = new Account();
        alice.setFirstName("Alice");
        alice.setEmail("alice@example.com");
    }

}
