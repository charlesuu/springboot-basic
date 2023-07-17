package com.example.demo.enums;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoucherDiscountTypeTest {

    @ParameterizedTest
    @ValueSource(strings = {"accVoucher", "divideVoucher"})
    @DisplayName("바우처 타입에 없는 타입이 입력되면 예외를 발생시킨다.")
    void voucherTypeTest(String input) {
        assertThatThrownBy(() -> VoucherDiscountType.from(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력하신 " + input + "는 유효한 바우처 종류가 아닙니다.\n fix 또는 percent를 입력하세요.\n");
    }
}