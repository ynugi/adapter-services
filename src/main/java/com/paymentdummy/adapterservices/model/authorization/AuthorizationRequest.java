package com.paymentdummy.adapterservices.model.authorization;

import com.paymentdummy.adapterservices.model.common.Merchant;
import com.paymentdummy.adapterservices.model.common.PaymentInstrument;
import com.paymentdummy.adapterservices.model.common.Transaction;
import lombok.Data;

@Data
public class AuthorizationRequest {
    private Merchant merchant;
    private PaymentInstrument paymentInstrument;
    private Transaction transaction;
}
