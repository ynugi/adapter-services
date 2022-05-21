package com.paymentdummy.adapterservices.model.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.time.YearMonth;

@Data
@ToString(exclude = {"pan", "track2", "cvv", "iccData"})
public class PaymentInstrument {

    private PaymentMethod paymentMethod;

    private String pan;
    private String track2;
    @JsonFormat(pattern = "yyMM")
    private YearMonth expiryDate;

    private ICCData iccData;
}
