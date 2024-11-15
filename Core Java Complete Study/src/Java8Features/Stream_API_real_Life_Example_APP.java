package Java8Features;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class Stream_API_real_Life_Example_APP {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 45, 70000),
            new Employee("Charlie", 25, 60000),
            new Employee("David", 35, 80000),
            new Employee("Eve", 28, 45000),
            new Employee("Frank", 40, 85000)
        );

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Stream API Methods ---");
            System.out.println("1. Display all employees");
            System.out.println("2. Filter employees with salary > 60000");
            System.out.println("3. Map employee names");
            System.out.println("4. Distinct employees by name");
            System.out.println("5. Sort employees by age");
            System.out.println("6. Peek to view employee details");
            System.out.println("7. Limit to first 3 employees");
            System.out.println("8. Skip first 3 employees");
            System.out.println("9. Collect employee names");
            System.out.println("10. Reduce to calculate total salary");
            System.out.println("11. Find employee with minimum salary");
            System.out.println("12. Find employee with maximum salary");
            System.out.println("13. Count employees");
            System.out.println("14. Check if any employee has salary > 70000");
            System.out.println("15. Check if all employees are older than 25");
            System.out.println("16. Check if no employee is younger than 25");
            System.out.println("17. Find first employee");
            System.out.println("18. Find any employee");
            System.out.println("19. Convert stream to array");
            System.out.println("20. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAll Employees:");
                    employees.stream().forEach(new Consumer<Employee>() {
                        @Override
                        public void accept(Employee emp) {
                            System.out.println(emp);
                        }
                    });
                    break;

                case 2:
                    System.out.println("\nEmployees with salary > 60000:");
                    employees.stream()
                            .filter(new Predicate<Employee>() {
                                @Override
                                public boolean test(Employee emp) {
                                    return emp.getSalary() > 60000;
                                }
                            })
                            .forEach(new Consumer<Employee>() {
                                @Override
                                public void accept(Employee emp) {
                                    System.out.println(emp);
                                }
                            });
                    break;

                case 3:
                    System.out.println("\nNames of Employees:");
                    employees.stream()
                            .map(new Function<Employee, String>() {
                                @Override
                                public String apply(Employee emp) {
                                    return emp.getName();
                                }
                            })
                            .forEach(new Consumer<String>() {
                                @Override
                                public void accept(String name) {
                                    System.out.println(name);
                                }
                            });
                    break;

                case 4:
                    System.out.println("\nEmployees (distinct by name):");
                    employees.stream()
                            .distinct()
                            .forEach(new Consumer<Employee>() {
                                @Override
                                public void accept(Employee emp) {
                                    System.out.println(emp);
                                }
                            });
                    break;

                case 5:
                    System.out.println("\nEmployees sorted by age:");
                    employees.stream()
                            .sorted(new Comparator<Employee>() {
                                @Override
                                public int compare(Employee e1, Employee e2) {
                                    return Integer.compare(e1.getAge(), e2.getAge());
                                }
                            })
                            .forEach(new Consumer<Employee>() {
                                @Override
                                public void accept(Employee emp) {
                                    System.out.println(emp);
                                }
                            });
                    break;

                case 6:
                    System.out.println("\nPeek example (viewing employee details):");
                    employees.stream()
                            .peek(new Consumer<Employee>() {
                                @Override
                                public void accept(Employee emp) {
                                    System.out.println("Processing: " + emp);
                                }
                            })
                            .collect(Collectors.toList());
                    break;

                case 7:
                    System.out.println("\nFirst 3 Employees:");
                    employees.stream()
                            .limit(3)
                            .forEach(new Consumer<Employee>() {
                                @Override
                                public void accept(Employee emp) {
                                    System.out.println(emp);
                                }
                            });
                    break;

                case 8:
                    System.out.println("\nSkip the first 3 Employees:");
                    employees.stream()
                            .skip(3)
                            .forEach(new Consumer<Employee>() {
                                @Override
                                public void accept(Employee emp) {
                                    System.out.println(emp);
                                }
                            });
                    break;

                case 9:
                    System.out.println("\nEmployee Names List:");
                    List<String> employeeNames = employees.stream()
                            .map(new Function<Employee, String>() {
                                @Override
                                public String apply(Employee emp) {
                                    return emp.getName();
                                }
                            })
                            .collect(Collectors.toList());
                    System.out.println(employeeNames);
                    break;

                case 10:
                    System.out.println("\nTotal Salary:");
                    double totalSalary = employees.stream()
                            .map(new Function<Employee, Double>() {
                                @Override
                                public Double apply(Employee emp) {
                                    return emp.getSalary();
                                }
                            })
                            .reduce(0.0, new BinaryOperator<Double>() {
                                @Override
                                public Double apply(Double a, Double b) {
                                    return a + b;
                                }
                            });
                    System.out.println(totalSalary);
                    break;

                case 11:
                    System.out.println("\nEmployee with minimum salary:");
                    Employee minSalaryEmployee = employees.stream()
                            .min(new Comparator<Employee>() {
                                @Override
                                public int compare(Employee e1, Employee e2) {
                                    return Double.compare(e1.getSalary(), e2.getSalary());
                                }
                            })
                            .orElse(null);
                    System.out.println(minSalaryEmployee);
                    break;

                case 12:
                    System.out.println("\nEmployee with maximum salary:");
                    Employee maxSalaryEmployee = employees.stream()
                            .max(new Comparator<Employee>() {
                                @Override
                                public int compare(Employee e1, Employee e2) {
                                    return Double.compare(e1.getSalary(), e2.getSalary());
                                }
                            })
                            .orElse(null);
                    System.out.println(maxSalaryEmployee);
                    break;

                case 13:
                    System.out.println("\nTotal number of employees:");
                    long employeeCount = employees.stream().count();
                    System.out.println(employeeCount);
                    break;

                case 14:
                    System.out.println("\nAny employee with salary > 70000:");
                    boolean anyMatch = employees.stream()
                            .anyMatch(new Predicate<Employee>() {
                                @Override
                                public boolean test(Employee emp) {
                                    return emp.getSalary() > 70000;
                                }
                            });
                    System.out.println(anyMatch);
                    break;

                case 15:
                    System.out.println("\nAll employees are older than 25:");
                    boolean allMatch = employees.stream()
                            .allMatch(new Predicate<Employee>() {
                                @Override
                                public boolean test(Employee emp) {
                                    return emp.getAge() > 25;
                                }
                            });
                    System.out.println(allMatch);
                    break;

                case 16:
                    System.out.println("\nNo employee is younger than 25:");
                    boolean noneMatch = employees.stream()
                            .noneMatch(new Predicate<Employee>() {
                                @Override
                                public boolean test(Employee emp) {
                                    return emp.getAge() < 25;
                                }
                            });
                    System.out.println(noneMatch);
                    break;

                case 17:
                    System.out.println("\nFirst Employee:");
                    Optional<Employee> firstEmployee = employees.stream().findFirst();
                    System.out.println(firstEmployee.orElse(null));
                    break;

                case 18:
                    System.out.println("\nAny Employee:");
                    Optional<Employee> anyEmployee = employees.stream().findAny();
                    System.out.println(anyEmployee.orElse(null));
                    break;

                case 19:
                    System.out.println("\nEmployee Array:");
                    Employee[] employeeArray = employees.stream().toArray(Employee[]::new);
                    System.out.println(Arrays.toString(employeeArray));
                    break;

                case 20:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 20);
        
        scanner.close();
    }
}
