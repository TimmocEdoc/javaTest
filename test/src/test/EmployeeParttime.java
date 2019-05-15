package test;

public class EmployeeParttime extends SalaryPolicy {
    public float rate;
    private float salary;

    public EmployeeParttime() {
        rate = 2.5f;
    }

    @Override
    public float getSalary() {
        return salary = rate*baseSalary;
    }
}
