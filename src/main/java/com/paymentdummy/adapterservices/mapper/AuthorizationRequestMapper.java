package com.paymentdummy.adapterservices.mapper;

import com.paymentdummy.adapterservices.model.authorization.AuthorizationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class AuthorizationRequestMapper {

    public String map (AuthorizationRequest authRequest) {
        ///TODO
        log.info("Authorization Request : "+ authRequest);

        return "TODO";
    }

}
