package org.cap.apps.jdbcdemo.ui;

import com.mysql.cj.jdbc.Driver;
import org.cap.apps.jdbcdemo.entities.Employee;
import org.cap.apps.jdbcdemo.exceptions.EmployeeNotFoundException;

import java.sql.*;

public class PrepareStatementDemo {
    private String url = "jdbc:mysql://localhost:3306/empms";
    private String user = "root", password = "scooby";
    private Connection connection;

    public static void main(String args[]) throws SQLException {
        PrepareStatementDemo project = new PrepareStatementDemo();
        project.runProject();
    }

    public void runProject() throws SQLException {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            int id=2;
            Employee employee1 = fetchEmployeeById(id);
            displayEmployee(employee1);
            Employee employee2=new Employee(10,"teja",900.0,2);
            insert(employee2);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }



    public void displayEmployee(Employee employee){
        System.out.println("id="+employee.getId()+" name="+employee.getName()+" balance="+employee.getBalance()+" did="+employee.getId());

    }
    public Employee fetchEmployeeById(int id) throws SQLException {
        connection = createConnection();
        String sql = "select * from employees where id=?";
        try (
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

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


    public void insert(Employee employee) throws SQLException {
        String sql="insert into employees(id,name,balance,did) values(?,?,?,?)";
        try (
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1,employee.getId());
            statement.setString(2,employee.getName());
            statement.setDouble(3,employee.getBalance());
            statement.setInt(4,employee.getDid());
            int rowsUpdated = statement.executeUpdate();
            System.out.println("rows updated=" + rowsUpdated);

        }
    }


    public Connection createConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

}
