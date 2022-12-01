package com.softWalter.hrworker.domain.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_worker")
public class Worker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workerId;
    private String workerName;
    private Double dialyIncome;

    public Worker(){
    }

    public Worker(Long workerId, String workerName, Double dialyIncome){
        super();
        this.workerId = workerId;
        this.workerName = workerName;
        this.dialyIncome = dialyIncome;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Double getDialyIncome() {
        return dialyIncome;
    }

    public void setDialyIncome(Double dialyIncome) {
        this.dialyIncome = dialyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return workerId.equals(worker.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId);
    }
}
