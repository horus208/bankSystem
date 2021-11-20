package com.company;
import java.util.ArrayList;


public class Customer extends Person {
    // the instances that belong to being a customer
   // static private long customersNumber =0;
    static private long  id =1;
    private long customerId=0;
    private String level="";
    // arraylist contains the IDs of the accounts the user owns
    ArrayList<Long> accountsOwned=new ArrayList();



    // constructor for the class
    public Customer(String name, int age, String gender, String ssn, String nationality, String address,
                    String social_status, String mail, String phone,String level)
    {
        // set instance variables
        super(name, age, gender, ssn, nationality, address, social_status, mail, phone);
        this.level=level;
        this.customerId= id;


        // to count the number of customers created
      //  customersNumber++;
        // to renew the id constant
        id++;
    }
    /*
    static public long getCustomersNumber()
    {
        return customersNumber;
    }

     */
     public long getCustomerId()
    {
        return customerId ;
    }
    // a method to add a new accountID to the list of accountsOwned
    public void addAccount(long accountId)
    {
        accountsOwned.add(accountId);
    }
    public long getAccountsNumber()
    {
        return accountsOwned.size();
    }
    public long getAccountByIndex(long accountIndex)
    {
        return accountsOwned.indexOf(accountIndex);
    }

}
