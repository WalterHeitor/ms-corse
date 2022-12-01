package com.softWalter.hrworker.domain.usecase.worker;

import com.softWalter.hrworker.domain.model.Worker;
import com.softWalter.hrworker.domain.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UseCaseWorkerImpl implements UseCaseWorker{

    @Autowired
    private WorkerRepository workerRepository;
    @Override
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    @Override
    public Optional<Worker> findById(Long id) {
        return workerRepository.findById(id);
    }
}
