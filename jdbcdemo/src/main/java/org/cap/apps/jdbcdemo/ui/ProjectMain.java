package org.cap.apps.jdbcdemo.ui;

import com.mysql.cj.jdbc.Driver;
import org.cap.apps.jdbcdemo.entities.Employee;

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
 * 6) At a later time close conenction
 */
public class ProjectMain {
    private String url = "jdbc:mysql://localhost:3306/empms";
    private String user = "bharat", password = "scooby";
    private Connection connection;

    public static void main(String args[]) throws SQLException {
        ProjectMain project = new ProjectMain();
        project.runProject();
    }

    public void runProject() throws SQLException {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            String fetchSql = "select * from employees";
            List<Employee>list=fetchData(fetchSql);
            displayEmployees(list);
            System.out.println("insert data");
            String insertSql = "insert into employees(id,name,balance,did) values(7,'sahitya',700,2)";
            updateData(insertSql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    public List<Employee> fetchData(String fetchSql) throws SQLException {
        connection = createConnection();
        List<Employee>list=new ArrayList<>();
        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(fetchSql);
        ) {

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                Integer did = resultSet.getInt("did");
                Employee employee=new Employee(id,name,balance,did);
                list.add(employee);
            }

            return list;

        }
    }

    public void displayEmployees(Collection<Employee>employees){
        for (Employee employee:employees){
            System.out.println("id="+employee.getId()+" name="+employee.getName()+" balance="+employee.getBalance()+" did="+employee.getId());
        }
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