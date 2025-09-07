package com.laserpanda1.bankV2.services;

import com.laserpanda1.bankV2.dto.request.TransactionRequest;
import com.laserpanda1.bankV2.dto.response.TransactionResponse;
import com.laserpanda1.bankV2.pojo.Transaction;
import com.laserpanda1.bankV2.repositores.BankAccountRepository;
import com.laserpanda1.bankV2.repositores.TransactionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;
    private BankAccountRepository bankAccountRepository;
    private ModelMapper modelMapper;

    public TransactionService(TransactionRepository transactionRepository,
                              BankAccountRepository bankAccountRepository,
                              ModelMapper modelMapper)
    {
        this.transactionRepository = transactionRepository;
        this.bankAccountRepository = bankAccountRepository;
        this.modelMapper = modelMapper;
    }

    public TransactionResponse createTransaction(TransactionRequest request) {

        Transaction transaction = modelMapper.map(request, Transaction.class);


    }
}
