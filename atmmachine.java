package com.ary;

import java.util.Date;
	import java.util.Scanner;
	public class AtmOpOperation {
		
		
		        private static Account[] accounts = new Account[10];
		 
		        public static void main(String[] args) {
		            accounts();
		            mainMenuOptions();      
		    }
		        //main menu option method
		        public static void mainMenuOptions() {
		            Scanner input = new Scanner(System.in);
		 
		            int enterchoice = -1;
		            int id=-1;
		            while (enterchoice != 4) {
		              mainMenu();
		              System.out.println("Enter an id: ");
		              id = input.nextInt();
		              //enter id
		              System.out.println("Enter choice:  ");
		               enterchoice = input.nextInt();
		 
		              int index = -1;
		              for (int i = 0; i < accounts.length; i++) {
		                if (accounts[i].getid() == id) {
		                  index = i;
		                  break;
		                }
		              }
		              if (enterchoice == 1) {
		                System.out.println("The balance is " + accounts[index].getbalance());       
		              } else if (enterchoice == 2) {
		                System.out.println("Enter an amount to withdraw ");
		                double amount = input.nextDouble();
		                //withdraw method
		                accounts[index].withdraw(amount);               
		              } else if (enterchoice == 3) {
		                System.out.println("Enter an amount to deposit ");
		                double amount = input.nextDouble();
		                //deposit method
		                accounts[index].deposit(amount);
		              } 
		            }
		          }
		     
		         public static void accounts() {
		            //create accounts
		            //initialize 100 dollars
		            for (int i = 0; i < accounts.length; i++) {
		                accounts[i] = new Account(i, 100);
		            }
		        }
		        //main menu method
		        public static void mainMenu(){
		            System.out.println("Main menu"+"\n1:check balance"+"\n2:withdraw"
		                    +"\n3:deposit"+"\n4:exit");
		 
		        }
		        }
		            class Account{
		                private int id = 0;
		                private double balance = 0;
		                private double withdraw = 0;
		                private double deposit = 0;
		                private double amount = 0;
		                
		                Account(){
		                }
		 
		                Account(int id, double balance){
		                    this.id = id;
		                    this.balance = balance;
		                }
		 
		                public int getid(){
		                    return this.id;
		 
		                }
		                public void setid(int newid){
		                    id = newid;
		                }
		                public double getbalance(){
		                    return this.balance;
		                }
		                public void withdraw(double amount){
		                    balance = balance - amount;
		                }
		 
		                public void deposit(double amount){
		                    balance = balance + amount;
		                }
		            }

		


