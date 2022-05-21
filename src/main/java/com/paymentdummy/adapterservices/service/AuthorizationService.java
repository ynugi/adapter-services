package com.paymentdummy.adapterservices.service;

import com.paymentdummy.adapterservices.mapper.AuthorizationRequestMapper;
import com.paymentdummy.adapterservices.mapper.AuthorizationResponseMapper;
import com.paymentdummy.adapterservices.model.authorization.AuthorizationRequest;
import com.paymentdummy.adapterservices.model.authorization.AuthorizationResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class AuthorizationService {

    @Autowired
    AuthorizationRequestMapper authorizationRequestMapper;

    @Autowired
    AuthorizationResponseMapper authorizationResponseMapper;

    public AuthorizationResponse sendAuthorizationRequest(AuthorizationRequest authRequest) {
        ///TODO
        String message = authorizationRequestMapper.map(authRequest);

        return new AuthorizationResponse();
    }
}
