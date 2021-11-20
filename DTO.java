package com.company;

public class DTO
{
    //---------------------------------------------------------------------------
    //------------------------------accounts-------------------------------------

    static public void saveAccount(Account account)
    {
        DataBase.accounts.add(account);
    }
    static public void deleteAccount(long  accountId)
    {
        for(Account account:DataBase.accounts )
        {
            if (account.getAccountId() == accountId)
            {
                DataBase.accounts.remove(account);
                break;
            }

        }
    }

    static public Account findAccount(long  accountId)
    {
        for(Account account:DataBase.accounts )
        {
            if (account.getAccountId() == accountId)
            {
                return account;
            }

        }
        return null;
    }




    //--------------------------------------------------------------------------------------

    //--------------------------------------customers----------------------------------------

    static public void saveCustomer(Customer customer)
    {
        DataBase.customers.add(customer);
    }

    static public void deleteCustomer(long  customerId)
    {
        for(Customer customer:DataBase.customers )
        {
            if (customer.getCustomerId() == customerId)
            {
                DataBase.accounts.remove(customer);
                break;
            }

        }
    }

    static public Customer findCustomer(long  customerId)
    {
        for(Customer customer:DataBase.customers )
        {
            if (customer.getCustomerId() == customerId)
            {
                return customer;
            }

        }
        return null;
    }

//---------------------------------------------------------------------------
//------------------------------employees-------------------------------------
static public void saveEmployee(Employee employee)
{
    DataBase.employees.add(employee);
}


    static public void deleteEmployee(long  employeeId)
    {
        for(Employee employee:DataBase.employees )
        {
            if (employee.getEmployeeId() == employeeId)
            {
                DataBase.accounts.remove(employee);
                break;
            }

        }
    }
    static public Employee findEmployee(long   employeeId)
    {
        for( Employee  employee:DataBase. employees )
        {
            if ( employee.getEmployeeId() == employeeId)
            {
                return  employee;
            }

        }
        return null;
    }

}