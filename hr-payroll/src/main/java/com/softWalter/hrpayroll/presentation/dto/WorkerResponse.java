package com.softWalter.hrpayroll.presentation.dto;

public class WorkerResponse {

    private Long workerId;
    private String workerName;
    private Double dialyIncome;

    public WorkerResponse() {
    }

    public WorkerResponse(Long workerId, String workerName, Double dialyIncome) {
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
}
