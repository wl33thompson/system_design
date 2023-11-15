package com.example.system_design.pressure_test.mysql;

import java.sql.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "rootroot";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            int jobId = 2;
            String query = "SELECT * FROM job where job_id = " + jobId;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("job_id");
                String job_type = resultSet.getString("job_type");
                int status = resultSet.getInt("status");

                // Process the retrieved data as needed
                System.out.println("id: " + id + ", Name: " + job_type + ", status: " + status);
            }

            Statement updateStatement = connection.createStatement();
            String updateQuery = "UPDATE job SET status = 1 WHERE job_id = " + jobId;
            int rowsAffected = updateStatement.executeUpdate(updateQuery);
            System.out.println(rowsAffected);

            insertData(connection);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    private static void insertData(Connection connection) throws SQLException {
        Statement updateStatement = connection.createStatement();
        Random random = new Random();
        int jobType = random.nextInt(10);
        long create_time = System.currentTimeMillis()/1000;
        System.out.println(create_time);

        String insertQuery = "INSERT INTO job2 (job_type, status, create_time, update_time) VALUES" +
                "(" + jobType +
                ", 0," + create_time +
                ", " + create_time +
                ")";
        int rowsAffected = updateStatement.executeUpdate(insertQuery,Statement.RETURN_GENERATED_KEYS);

        if (rowsAffected > 0) {
            // Retrieve the generated auto-increment ID
            ResultSet resultSet = updateStatement.getGeneratedKeys();

            if (resultSet.next()) {
                int generatedId = resultSet.getInt(1);
                System.out.println("Generated ID: " + generatedId);
            }
        }


        System.out.println("sucess");


    }
}

// insert --> update
