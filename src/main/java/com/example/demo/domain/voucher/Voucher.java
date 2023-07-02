package com.example.demo.domain.voucher;

import com.example.demo.dto.VoucherDto;
import java.util.UUID;

public interface Voucher {

    double discount(double beforeAmount);

    VoucherDto convertToVoucherDto();

    UUID getId();
}
