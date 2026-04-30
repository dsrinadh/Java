class Employee{
    String name;
    double salary;
    Employee(){
    }
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    void work(){
        System.out.println("Name of the person: " + name);
    }
    double calculateSalary(){
        return salary;
    }
}
class Manager extends Employee{
    double bonus;
    Manager(String name, double salary, double bonus){
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;
    }
    void work(){
        System.out.println("Name of the Manager: " + name);
    }
    double calculateSalary(){
        return salary + bonus;
    }
}
class Developer extends Employee{
    double incentive;
    Developer(String name, double salary,double incentive){
        this.name=name;
        this.salary=salary;
        this.incentive=incentive;
    }
    double calculateSalary(){
        return salary + incentive;
    }
    void work(){
        System.out.println(name + " " + "Works as developer in the company");
    }
}
class Intern extends Employee{
    double stipend;
    Intern(String name,double stipend){
        this.name=name;
        this.stipend=stipend;
    }
    void work(){
        System.out.println(name + " " + "Works as Inter in the company");
    }
    double calculateSalary(){
        return stipend;
    }
}
class Over{
    public static void main(String[] args){
        Employee e=new Employee("Srinadh",3000);
        Employee m=new Manager("Kranthi", 50000,2500);
        Employee d=new Developer("Murali", 30000,1000);
        Employee i=new Intern("Yashwanth", 25000);
        
        e.work();
        System.out.println("Salary of the Employee:" + e.calculateSalary());
        m.work();
        System.out.println("Salry of the Manager:" + m.calculateSalary());
        d.work();
        System.out.println("Salary of the Developer: " + d.calculateSalary());
        i.work();
        System.err.println("Salary of the INtern person:" + i.calculateSalary());
    }
}