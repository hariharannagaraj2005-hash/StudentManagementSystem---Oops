package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       StudentManagement ss = new StudentManagement();
       Scanner sc = new Scanner(System.in);

       int choice;
       do{
           System.out.println("Enter Your Choice : ");
           choice = sc.nextInt();

           switch (choice){
               case 1 :
                   System.out.println("Enter Your ID : ");
                   int id = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter Your Name : ");
                   String name = sc.nextLine();
                   System.out.println("Enter Your Age : ");
                   int age = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter Your Department : ");
                   String dept = sc.nextLine();

                   Student s = new Student(id,name,age,dept);
                   ss.addName(s);
                   break;

               case 2:
                   ss.displayDetails();
                   break;

               case 3:
                   System.out.println("Enter The ID To Search :  ");
                   int id1 = sc.nextInt();
                   Student search = ss.searchStudent(id1);
                   if(search!=null){
                       System.out.println(search);
                   }else{
                       System.out.println("Student Not Found");
                   }
                   break;

               case 4:
                   System.out.println("Enter The ID To Delete The Student : ");
                   int id2 = sc.nextInt();
                   Student delete = ss.deleteStudent(id2);
                   if(delete!=null){
                       System.out.println(delete);
                   }
                   else{
                       System.out.println("Student Not Found");
                   }
                   break;

               case 5:
                   System.out.println("Enter The ID To Update The Student Profile : ");
                   int id3 = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter Your Name : ");
                   String names = sc.nextLine();
                   System.out.println("Enter Your Age : ");
                   int ages = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Enter Your Department : ");
                   String depts = sc.nextLine();
                  Student update =  ss.updateDetails(id3,names,ages,depts);
                  if(update!=null){
                      System.out.println(update);
                  }
                  else{
                      System.out.println("Student Not Found");
                  }
                  break;

               case 6:
                   return;


           }


       }while(choice<=6);

    }
}