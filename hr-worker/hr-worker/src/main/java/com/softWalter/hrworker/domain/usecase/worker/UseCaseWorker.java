package com.softWalter.hrworker.domain.usecase.worker;

import com.softWalter.hrworker.domain.model.Worker;

import java.util.List;
import java.util.Optional;

public interface UseCaseWorker {
    List<Worker> findAll();

    Optional<Worker> findById(Long id);
}
