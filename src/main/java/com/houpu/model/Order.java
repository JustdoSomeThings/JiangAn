package com.houpu.model;


import lombok.Data;

/**
 * 订单
 */
@Data
public class Order {

    private Integer id;
    private Integer employeeId;
    private Integer clientId;
    private String time;
    private String is;

    private Employee employee;
    private Client client;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", clientId=" + clientId +
                ", time='" + time + '\'' +
                ", is='" + is + '\'' +
                ", employee=" + employee +
                ", client=" + client +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
