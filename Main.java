package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Biznis.newCustomer("ali",25,"male","1250",
                "Egyptian","fayoum","single","ali.@gmail.com",
                "01100789924","gold");


      //  Account ali_saving = new Account(ali,"saving",1200,0.3);
        System.out.println(DataBase.customers.size());
        System.out.println(DataBase.customers);
        Biznis.removeCustomer(2);
        System.out.println(DataBase.customers.size());


    }
}
