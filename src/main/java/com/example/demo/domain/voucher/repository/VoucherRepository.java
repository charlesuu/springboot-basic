package com.example.demo.domain.voucher.repository;

import com.example.demo.domain.voucher.Voucher;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VoucherRepository {

    void save(Voucher voucher);

    Optional<Voucher> findById(UUID id);

    List<Voucher> findAll();

    void updateAmount(UUID id, int discountAmount);

    void deleteById(UUID id);

    boolean isVoucherNotExist(UUID id);
}
