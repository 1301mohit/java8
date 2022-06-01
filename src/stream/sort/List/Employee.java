package stream.sort.List;

public class Employee {
    private int eid;
    private String ename;
    private long salary;

    public Employee(int eid, String ename, long salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
