package com.softWalter.hrworker.presetation;

import com.softWalter.hrworker.domain.model.Worker;
import com.softWalter.hrworker.domain.usecase.worker.UseCaseWorker;

;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sotWalter/v1/workers")
public class WorkerController {

    @Autowired
    private UseCaseWorker useCaseWorker;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        return ResponseEntity.ok(useCaseWorker.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        return ResponseEntity.ok(useCaseWorker.findById(id).get());
    }
}
