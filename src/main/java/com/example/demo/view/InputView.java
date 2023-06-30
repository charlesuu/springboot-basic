package com.example.demo.view;

import com.example.demo.util.CommandType;
import com.example.demo.util.VoucherType;
import com.example.demo.view.validate.VoucherAmountValidator;
import java.util.Scanner;

public class InputView {

    Scanner sc = new Scanner(System.in);
    VoucherAmountValidator voucherAmountValidator = new VoucherAmountValidator();

    public CommandType readCommandOption() {
        return CommandType.find(sc.nextLine());
    }

    public VoucherType readVoucherOption() {
        return VoucherType.find(sc.nextLine());
    }

    public Integer readVoucherAmount(VoucherType voucherType) {
        String input = sc.nextLine();
        switch (voucherType) {
            case FIXED_AMOUNT_VOUCHER -> voucherAmountValidator.validateFixedAmount(input);
            case PERCENT_DISCOUNT_VOUCHER -> voucherAmountValidator.validatePercentAmount(input);
        }
        return Integer.parseInt(input);
    }
}
