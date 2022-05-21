package com.paymentdummy.adapterservices.model.common;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = { "extractedTlvTags", "par" })
public class ICCData {
    private String extractedTlvTags;
    private String par;
}
