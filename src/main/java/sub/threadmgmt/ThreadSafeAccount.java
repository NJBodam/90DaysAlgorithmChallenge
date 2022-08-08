package sub.threadmgmt;

public class ThreadSafeAccount {

//    You have a class named Account. It has a long field storing the current balance.
//    The account has three not-implemented methods:
//
//    deposit method adds an amount to the balance;
//    withdraw method subtracts an amount from the balance if the account has enough money.
//    The method must return true if the operation is successful, otherwise, it returns false;
//    getBalance method returns the current balance.
//    Implement the given methods. The class should work correctly with multiple threads.
//    The testing system will create threads and call methods on the same instance of Account.


    //NOTE THIS

//    I believe that in the implementation class the run() method should be written
//    using the synchronize block like this:

//    public void run(){
//        synchronized (this.account) {


    class Account {

        private long balance = 0;

        public synchronized boolean withdraw(long amount) {
            if (balance > amount) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public synchronized void deposit(long amount) {
            // do something useful
            balance += amount;
        }

        public long getBalance() {
            return balance;
        }
    }
}
