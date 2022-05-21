package com.paymentdummy.adapterservices.mapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.paymentdummy.adapterservices.model.authorization.AuthorizationRequest;
import com.paymentdummy.adapterservices.model.common.Merchant;
import com.paymentdummy.adapterservices.model.common.PaymentInstrument;
import com.paymentdummy.adapterservices.model.common.PaymentMethod;
import com.paymentdummy.adapterservices.model.common.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.YearMonth;

public class AuthorizationRequestMapperTest {

    AuthorizationRequestMapper authorizationRequestMapper;

    @BeforeEach
    public void before() {
        MockitoAnnotations.initMocks(this);

        authorizationRequestMapper = new AuthorizationRequestMapper();
    }

    @Test
    public void MapAuthRequest () {
        Merchant merchant = new Merchant();
            merchant.setId("00007725105");
            merchant.setCode("4111");
            merchant.setTerminalId("00000002");

        PaymentInstrument paymentInstrument = new PaymentInstrument();
            paymentInstrument.setPaymentMethod(PaymentMethod.PAN);
            paymentInstrument.setPan("4111111111111111");
            paymentInstrument.setExpiryDate(YearMonth.of(2022, 12));

        Transaction transaction = new Transaction();
            transaction.setStan("123090");
            transaction.setAmount(BigDecimal.valueOf(15000));
            transaction.setDateTime(LocalDateTime.of(2020, 6, 15, 12, 20, 05));
            transaction.setProcessingCode("000010");

        AuthorizationRequest authorizationRequest = new AuthorizationRequest();
            authorizationRequest.setMerchant(merchant);
            authorizationRequest.setTransaction(transaction);
            authorizationRequest.setPaymentInstrument(paymentInstrument);

        String subject = authorizationRequestMapper.map(authorizationRequest);

        System.out.println(subject);
    }

}
