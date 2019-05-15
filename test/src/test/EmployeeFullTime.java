package test;

public class EmployeeFullTime extends SalaryPolicy {
    public float rate;
    private float salary;

    public EmployeeFullTime() {
        rate = 4;
    }

    @Override
    public float getSalary() {
        return salary = rate*baseSalary;
    }
}
