package persistence;

import bankingManagement.Account;
import bankingManagement.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersistenceDAOImpl implements PersistenceDAO{
      long generatedCustomer_id=101;
      long generatedAccount_id=501;
      private HashMap<Long,Customer> customerHashMap=new HashMap<>();
      ArrayList<Long> customer_ids=new ArrayList<>();

    @Override
    public ArrayList<Long> addCustomers(ArrayList<Customer> customers) throws PersistenceException {
       for (Customer customer:customers)
       {
           customer.setCustomer_id(generatedCustomer_id++);
           customer_ids.add(customer.getCustomer_id());
           customerHashMap.put(customer.getCustomer_id(),customer);
       }
       return  customer_ids;
    }

    @Override
    public ArrayList<Customer> selectCustomers(ArrayList<Long> customer_ids) throws PersistenceException {
        return null;
    }

    @Override
    public ArrayList<Customer> selectAllCustomers() throws PersistenceException {
        return null;
    }

    @Override
    public void addAccount(long customer_id, double balance) throws PersistenceException {

    }

    @Override
    public ArrayList<Long> addAccounts(HashMap<Long, Account> account) throws PersistenceException {
        for (Map.Entry<Long,Account> entry:account.entrySet())
        {
            Account account1=new Account();
            account1.setCustomer_id(entry.getKey());
            account1.setAccount_id(generatedAccount_id++);
        }
    }

    @Override
    public ArrayList<Account> selectAccounts(ArrayList<Long> customer_ids) throws PersistenceException {
        return null;
    }

    @Override
    public Account selectAccount(long customer_id) throws PersistenceException {
        return null;
    }

    @Override
    public ArrayList<Account> selectAllAccounts() throws PersistenceException {
        return null;
    }

    @Override
    public void updateAccount() {

    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void updateCustomer() {

    }

    @Override
    public void deleteCustomer() {

    }
}
