package com.example.codeqldemo.controller;

import com.example.codeqldemo.model.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.Scanner;

@RestController
public class TestController {


    @GetMapping("/getCountry")
    public ResponseEntity<Countries> getCountryById(@RequestParam Integer id) throws SQLException {

			Scanner sc=new Scanner(System.in);
			sc.next();


			Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
			String sql = "SELECT * FROM countries WHERE id = '" + id + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				String population = rs.getString("population");
				System.out.println("name: " + name + ", population: " + population);
			}

			rs.close();
			stmt.close();
			conn.close();
        return new ResponseEntity<Countries>(HttpStatus.OK);



    }
}
