package com.qsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qsp.model.Employee;

public class EmployeeController {

	static Connection con;
	static {
		try {
			// 1st
			Class.forName("org.postgresql.Driver");
			// 2nd
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void addEmployee(Employee employee) {
		try {
			// 3rd
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setLong(3, employee.getPhone());
			ps.setDouble(4, employee.getSal());
			// 4th
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void updateEmployeeSal(int id, double newSal) {
		try {
			// 3rd
			PreparedStatement ps = con.prepareStatement("update employee set sal=? where id=?");
			ps.setInt(2, id);
			ps.setDouble(1, newSal);
			// 4th
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean deleteEmployee(int id) {
		try {
			if (getEmployeeById(id).getId() != 0) {
				// 3rd
				PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
				ps.setInt(1, id);
				// 4th
				ps.execute();
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static Employee getEmployeeById(int id) {
		Employee employee = new Employee();
		try {
			// 3rd
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			// 4th
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setPhone(rs.getLong("phone"));
				employee.setSal(rs.getDouble("sal"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	public static List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			// 3rd
			PreparedStatement ps = con.prepareStatement("select * from employee");
			// 4th
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setPhone(rs.getLong("phone"));
				employee.setSal(rs.getDouble("sal"));
				list.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
