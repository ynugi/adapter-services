package com.paymentdummy.adapterservices.controller;

import com.paymentdummy.adapterservices.model.authorization.AuthorizationRequest;
import com.paymentdummy.adapterservices.model.authorization.AuthorizationResponse;
import com.paymentdummy.adapterservices.service.AuthorizationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class AuthorizationController {

    private final AuthorizationService authorizationService;

    @PostMapping(path="/authorization")
    public ResponseEntity<AuthorizationResponse> authorise(@RequestBody AuthorizationRequest authRequest) {
        log.info("Authorization request received: {}", authRequest);
        return ResponseEntity.ok(authorizationService.sendAuthorizationRequest(authRequest));
    }
}
