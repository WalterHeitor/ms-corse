package com.softWalter.hrworker.domain.repository;

import com.softWalter.hrworker.domain.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
