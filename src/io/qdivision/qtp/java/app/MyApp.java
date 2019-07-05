package io.qdivision.qtp.java.app;

import java.math.BigDecimal;
import java.util.List;
import java.util.Arrays;

import io.qdivision.qtp.java.model.Employee;
import io.qdivision.qtp.java.model.PerformanceLevel;
import io.qdivision.qtp.java.model.Address;
import io.qdivision.qtp.java.employee.service.EmployeeService;

public class MyApp {



    public static void main(String[] args) {

        EmployeeService employeeService=new EmployeeService();


        List<PerformanceLevel> performanceLevels1=Arrays.asList(new PerformanceLevel(2017,1),new PerformanceLevel(2018,2),new PerformanceLevel(2019,1));
        List<PerformanceLevel> performanceLevels2=Arrays.asList(new PerformanceLevel(2017,2),new PerformanceLevel(2018,3),new PerformanceLevel(2019,4));
        List<PerformanceLevel> performanceLevels3=Arrays.asList(new PerformanceLevel(2017,3),new PerformanceLevel(2018,2),new PerformanceLevel(2019,1));
        List<PerformanceLevel> performanceLevels4=Arrays.asList(new PerformanceLevel(2017,1),new PerformanceLevel(2018,1),new PerformanceLevel(2019,1));
        List<PerformanceLevel> performanceLevels5=Arrays.asList(new PerformanceLevel(2017,2),new PerformanceLevel(2018,2),new PerformanceLevel(2019,2));
        List<PerformanceLevel> performanceLevels6=Arrays.asList(new PerformanceLevel(2017,3),new PerformanceLevel(2018,4),new PerformanceLevel(2019,3));



        List<Address> addresses1=Arrays.asList( new Address("Residential" ,"1234 Abcd Drive","Apt A" ,"City1","TX",73301 ),new Address("Work" ,"10 Abcd Road","Suite -600" ,"City1","TX",73301 ));
        List<Address> addresses2=Arrays.asList( new Address("Residential" ,"5467 Efgh Drive","Apt B" ,"City1","MO",73301 ),new Address("Work" ,"10 Abcd Road","Suite -600" ,"City1","TX",73301 ));
        List<Address> addresses3=Arrays.asList( new Address("Residential" ,"8910 Ijkl Drive","Apt C" ,"City1","CA",73301 ),new Address("Work" ,"10 Abcd Road","Suite -600" ,"City1","TX",73301 ));
        List<Address> addresses4=Arrays.asList( new Address("Residential" ,"6666 oiuo Drive","Apt Z" ,"City1","MO",63129 ),new Address("Work" ,"10 Abcd Road","Suite -600" ,"City1","TX",73301 ));
        List<Address> addresses5=Arrays.asList( new Address("Residential" ,"9999 qwer Drive","Apt B" ,"City1","CA" ,90210 ),new Address("Work" ,"10 Abcd Road","Suite -600" ,"City1","TX",73301 ));
        List<Address> addresses6=Arrays.asList( new Address("Residential" ,"8888 lkhj Drive","Apt B" ,"City1","TX" ,73301 ),new Address("Work" ,"10 Abcd Road","Suite -600" ,"City1","TX",73301 ));


        List<Employee> employeeList=Arrays.asList(
                 new Employee("Mark",32,new BigDecimal("70000"),performanceLevels1,addresses1, "IT")
                ,new Employee("James",35,new BigDecimal("65000"),performanceLevels2,addresses2, "IT")
                ,new Employee("Peter",39,new BigDecimal("75000"),performanceLevels3,addresses3, "IT")
                ,new Employee("Sally",27,new BigDecimal("80000000000"),performanceLevels4,addresses4, "Sales")
                ,new Employee("Suzy",27,new BigDecimal("79999999999"),performanceLevels5,addresses5, "Sales")
                ,new Employee("Sasha",27,new BigDecimal("10"),performanceLevels6,addresses6, "Sales")
        );


        for(Employee employee:employeeList) {

            employeeService.printSalaryDetails(employee);

        }

        employeeService.printDepartmentExpense(employeeList);


    }

        }


        //TODO calculate total salary expense for each department
        //TODO calculate who made the most over 3 years