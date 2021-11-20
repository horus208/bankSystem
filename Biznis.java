package com.company;

public class Biznis {
    //---------------------------------------------------------------------------
    //------------------------------accounts-------------------------------------

    // making new account
   static public void newAccount(Customer accountOwner, String accountType, double balance, double interestRate)
    {
        Account account=new Account(accountOwner,accountType,balance,interestRate);
        DataBase.accounts.add(account);
    }


    // removing account
    static public void removeAccount(long accountId)
    {
        for(Account account:DataBase.accounts )
        {
            if (account.getAccountId() == accountId)
            {
                DataBase.accounts.remove(account);
            }
        }

    }


    // get the number of accounts
    static public long getAccountsNumber()
    {
        return DataBase.accounts.size();
    }
    //--------------------------------------------------------------------------------------

    //--------------------------------------customers----------------------------------------


    // making new customer
    static public void newCustomer(String name, int age, String gender, String ssn, String nationality, String address,
                                    String social_status, String mail, String phone,String level)
    {
        Customer customer= new Customer(name,age,gender,ssn,nationality,address, social_status,mail,phone,level);
        DataBase.customers.add(customer);
    }

    // removing a customer
    static public void removeCustomer(long CustomerId)
    {
        for(Customer customer:DataBase.customers )
        {
            if (customer.getCustomerId() == CustomerId)
            {
                DataBase.customers.remove(customer);

                // remove all accounts owned by this customer
                for(long id: customer.accountsOwned)
                {
                    removeAccount(id);
                }
                break;
            }



        }

    }
// get the number of customers
    public long getCustomersNumber()
    {
        return DataBase.customers.size();
    }



//---------------------------------------------------------------------------
//------------------------------employees-------------------------------------


//hiring new employee
static public void newEmployee(String name, int age, String gender, String ssn, String nationality, String address, String social_status, String mail, String phone,
                               double salary, String departmentName)
{
   Employee employee=new Employee(name,age, gender,ssn,nationality,address,social_status,mail, phone, salary,departmentName);
    DataBase.employees.add(employee);
}

// firing employee
    static public void removeEmployee(long EmployeeId)
    {
        for(Employee employee:DataBase.employees )
        {
            if ( employee.getEmployeeId() == EmployeeId)
            {
                DataBase.accounts.remove( employee);
            }
        }
    }
}
