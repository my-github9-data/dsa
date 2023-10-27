package com.sunbeam;

public class TestMain {
	
	public static void bubbleSort(Employees emp[], int n) {
		int cnt=0;
		
		for(int i=1; i<n; i++) {
			for(int j=0;j<n-i;j++) {
				cnt++;
				if(emp[j].getSalary() > emp[j+1].getSalary()) {
					Employees temp=emp[j];
					emp[j]= emp[j+1];
					emp[j+1]=temp;
				}
			}
		}
		System.out.println("No of Comparisons: "+cnt);
	}

	public static void main(String[] args) {
		Employees[] emp= new Employees[6];
		emp[0]= new Employees(1,"Sarvesh",100000.00);
		emp[1]= new Employees(2,"Pratik",90000.00);
		emp[2]= new Employees(3,"Vinayak",80000.00);
		emp[3]= new Employees(4,"Somnath",70000.00);
		emp[4]= new Employees(5,"Piyush",60000.00);
		emp[5]= new Employees(6,"Raj",50000.00);
		
		//bubble Sort
			for (Employees e : emp) {
				System.out.println("Array before sort : " + e);
			}
			
			bubbleSort(emp, emp.length);
			
			for (Employees e : emp) {
				System.out.println("Array before sort : " + e);
			}	
		
	}

}
