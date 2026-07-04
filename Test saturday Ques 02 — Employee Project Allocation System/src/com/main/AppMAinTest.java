package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cgfs.Appliction;
import com.sbean.Employee;
import com.sbean.Project;

public class AppMAinTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(Appliction.class);
		
		Employee e = ct.getBean(Employee.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		e.setEmpId(sc.nextInt());
		System.out.println("Enter Employee Name: ");
		e.seteName(sc.nextLine());
		sc.nextLine();
		
		System.out.println("how many project : ");
		int n = sc.nextInt();
		List<Project> projectsList = new ArrayList<Project>();
		for(int i=0;i<n;i++) {
			Project p = ct.getBean(Project.class);
			
			System.out.println("Enter projectId: "+(i+1)+" id");
			p.setProjectId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter projectName: ");
			p.setProjectName(sc.nextLine());
			
			projectsList.add(p);
			
		}
		e.setProjects(projectsList);
		System.out.println("---cart Details---");
		e.display();
		sc.close();
	}
}
