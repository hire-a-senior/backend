package com.developers.hireasenior.service;

import com.developers.hireasenior.dto.AccountDto;
import com.developers.hireasenior.dto.TechnologyDto;
import com.developers.hireasenior.dto.request.ListSeniorsRequest;
import com.developers.hireasenior.dto.response.ApiResponse;
import com.developers.hireasenior.mapper.AccountMapper;
import com.developers.hireasenior.model.Account;
import com.developers.hireasenior.model.Technology;
import com.developers.hireasenior.repository.AccountRepository;
import com.developers.hireasenior.repository.TechnologyRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountService {

   private final AccountMapper accountMapper;

   private static final Logger logger = LoggerFactory.getLogger(AccountRepository.class);
   private final AccountRepository accountRepository;
   private final TechnologyRepository technologyRepository;


    public ApiResponse<List<AccountDto>> listSeniors(ListSeniorsRequest listSeniorsRequest){
        try{
            Set<Technology> technologies = technologyRepository.findAllByCodeIn(listSeniorsRequest.getTechnologies());

            List<Account> accounts = accountRepository.findAllByTechnologiesIn(technologies);

            if (accounts.isEmpty() || accounts == null){
                logger.debug("Not found any developers.");
                return new ApiResponse<>(true, null, "Not found any developers with selected technologies.", false);
            }

            logger.debug("Successfully found developers by technologies.");
            return new ApiResponse<>(true, accountMapper.accountListToDtoList(accounts), "Accounts successfully found.", false);
        }
        catch (Exception e){
            logger.error("Error occur when trying find account.");
            return new ApiResponse<>(false, null, "Error occur when trying find account.", false);
        }
    }
}
