package org.cap.apps.jdbcdemo.ui;

import com.mysql.cj.jdbc.Driver;
import org.cap.apps.jdbcdemo.entities.Employee;
import org.cap.apps.jdbcdemo.exceptions.EmployeeNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 1)Register Driver
 * 2) create connection
 * 3) create statement
 * 4)execute query
 * 5) process result set
 * 6) At a later time close connection
 */
public class StatementDemo {
    private String url = "jdbc:mysql://localhost:3306/empms";
    private String user = "root", password = "scooby";
    private Connection connection;

    public static void main(String args[]) throws SQLException {
        StatementDemo project = new StatementDemo();
        project.runProject();
    }

    public void runProject() throws SQLException {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            int id=2;
            Employee employee=findEmployeeById(id);
            displayEmployee(employee);
            System.out.println("insert data");
            String insertSql = "insert into employees(id,name,balance,did) values(7,'sahitya',700,2)";
            updateData(insertSql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    public Employee findEmployeeById(int id) throws SQLException {
        connection = createConnection();
        String sql = "select * from employees where id="+id;
        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {

            if (!resultSet.next()) {
                throw new EmployeeNotFoundException("employee not found ");
            }

            String name = resultSet.getString("name");
            double balance = resultSet.getDouble("balance");
            Integer did = resultSet.getInt("did");
            Employee employee = new Employee(id, name, balance, did);
            return employee;

        }
    }


    public void displayEmployee(Employee employee){
        System.out.println("id="+employee.getId()+" name="+employee.getName()+" balance="+employee.getBalance()+" did="+employee.getId());

    }


    public void updateData(String sql) throws SQLException {
        try (
                Statement statement = connection.createStatement();
        ) {
            int rowsUpdated = statement.executeUpdate(sql);
            System.out.println("rows updated=" + rowsUpdated);

        }
    }


    public Connection createConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }


}