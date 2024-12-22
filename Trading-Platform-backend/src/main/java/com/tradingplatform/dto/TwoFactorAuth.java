package com.tradingplatform.dto;

import com.tradingplatform.domain.VerificationType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;
}
