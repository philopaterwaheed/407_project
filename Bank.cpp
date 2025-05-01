#include <iostream>
#include <fstream>
#include <vector>
#include <iomanip>
using namespace std;

class BankAccount {
protected:
    string accountHolder;
    int accountNumber;
    double balance;
    static int nextAccountNumber; // Auto-increment account number

public:
    BankAccount(string name, double initialBalance)
        : accountHolder(name), balance(initialBalance) {
        accountNumber = nextAccountNumber++;
    }

    virtual void deposit(double amount) {
        balance += amount;
    }

    virtual bool withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient balance!" << endl;
            return false;
        }
        balance -= amount;
        return true;
    }

    virtual void display() const {
        cout << left << setw(10) << accountNumber << setw(20) << accountHolder 
             << setw(10) << balance << endl;
    }

    int getAccountNumber() const { return accountNumber; }
    double getBalance() const { return balance; }
    string getAccountHolder() const { return accountHolder; }
    virtual ~BankAccount() {}
};

int BankAccount::nextAccountNumber = 1000;

class SavingsAccount : public BankAccount {
    double interestRate;
public:
    SavingsAccount(string name, double initialBalance, double rate)
        : BankAccount(name, initialBalance), interestRate(rate) {}

    void applyInterest() {
        balance += balance * (interestRate / 100);
    }
};

class Bank {
    vector<BankAccount*> accounts;
// public:
//         void createAccount() {
//         string name;
//         double initialBalance;
//         cout << "Enter Account Holder Name: ";
//         cin.ignore();
//         getline(cin, name);
//         cout << "Enter Initial Balance: ";
//         cin >> initialBalance;
        
//         accounts.push_back(new BankAccount(name, initialBalance));
//         cout << "Account Created Successfully!" << endl;
//     }

    // void deposit() {
    //     int accNum;
    //     double amount;
    //     cout << "Enter Account Number: ";
    //     cin >> accNum;
    //     cout << "Enter Amount to Deposit: ";
    //     cin >> amount;
    //     for (auto acc : accounts) {
    //         if (acc->getAccountNumber() == accNum) {
    //             acc->deposit(amount);
    //             cout << "Deposit Successful!" << endl;
    //             return;
    //         }
    //     }
    //     cout << "Account Not Found!" << endl;
    // }

        // void withdraw() {
        //     int accNum;
        //     double amount;
        //     cout << "Enter Account Number: ";
        //     cin >> accNum;
        //     cout << "Enter Amount to Withdraw: ";
        //     cin >> amount;
        //     for (auto acc : accounts) {
        //         if (acc->getAccountNumber() == accNum) {
        //             if (acc->withdraw(amount)) {
        //                 cout << "Withdrawal Successful!" << endl;
        //             }
        //             return;
        //         }
        //     }
        //     cout << "Account Not Found!" << endl;
        // }

    // void transferFunds() {
    //     int fromAcc, toAcc;
    //     double amount;
    //     cout << "Enter Sender's Account Number: ";
    //     cin >> fromAcc;
    //     cout << "Enter Receiver's Account Number: ";
    //     cin >> toAcc;
    //     cout << "Enter Amount to Transfer: ";
    //     cin >> amount;
        
    //     BankAccount* sender = nullptr;
    //     BankAccount* receiver = nullptr;
    //     for (auto acc : accounts) {
    //         if (acc->getAccountNumber() == fromAcc) sender = acc;
    //         if (acc->getAccountNumber() == toAcc) receiver = acc;
    //     }
        
    //     if (sender && receiver && sender->withdraw(amount)) {
    //         receiver->deposit(amount);
    //         cout << "Transfer Successful!" << endl;
    //     } else {
    //         cout << "Transfer Failed! Check details." << endl;
    //     }
    // }

    // void displayAllAccounts() const {
    //     cout << left << setw(10) << "Acc No" << setw(20) << "Holder Name" << setw(10) << "Balance" << endl;
    //     cout << string(40, '-') << endl;
    //     for (const auto acc : accounts) {
    //         acc->display();
    //     }
    // }

    void saveToFile() {
        ofstream file("bank_accounts.txt");
        for (const auto acc : accounts) {
            file << acc->getAccountNumber() << " " << acc->getAccountHolder() << " " << acc->getBalance() << endl;
        }
        file.close();
    }

    void loadFromFile() {
        ifstream file("bank_accounts.txt");
        if (!file) return;
        
        accounts.clear();
        int accNum;
        string name;
        double bal;
        while (file >> accNum) {
            file.ignore();
            getline(file, name, ' ');
            file >> bal;
            accounts.push_back(new BankAccount(name, bal));
        }
        file.close();
    }
    
    // void calculateTotalBankBalance() {
    //     double totalBalance = 0;
    //     for (auto acc : accounts) {
    //         totalBalance += acc->getBalance();
    //     }
    //     cout << "Total Bank Balance: " << totalBalance << endl;
    // }

    // void countAccounts() {
    //     cout << "Total Number of Accounts: " << accounts.size() << endl;
    // }
    
    // void testFunctions() {
    //     cout << "\nRunning Test Cases..." << endl;
    //     BankAccount acc1("John Doe", 5000);
    //     BankAccount acc2("Alice Smith", 3000);
        
    //     cout << "Initial Balances:" << endl;
    //     acc1.display();
    //     acc2.display();

    //     cout << "Depositing 2000 into John's account..." << endl;
    //     acc1.deposit(2000);
    //     acc1.display();
        
    //     cout << "Withdrawing 1000 from Alice's account..." << endl;
    //     acc2.withdraw(1000);
    //     acc2.display();

    //     cout << "Transferring 1500 from John to Alice..." << endl;
    //     acc1.withdraw(1500);
    //     acc2.deposit(1500);
    //     acc1.display();
    //     acc2.display();
    // }
    
    ~Bank() {
        for (auto acc : accounts)
            delete acc;
    }
};

// int main() {
//     Bank bank;
//     bank.loadFromFile();
//     int choice;
//     do {
//         cout << "\n*** BANK MANAGEMENT SYSTEM ***" << endl;
//         cout << "1. Create Account" << endl;
//         cout << "2. Deposit" << endl;
//         cout << "3. Withdraw" << endl;
//         cout << "4. Transfer Funds" << endl;
//         cout << "5. Display All Accounts" << endl;
//         cout << "6. Calculate Total Bank Balance" << endl;
//         cout << "7. Count Accounts" << endl;
//         cout << "8. Run Test Cases" << endl;
//         cout << "9. Exit" << endl;
//         cout << "Enter your choice: ";
//         cin >> choice;

//         switch (choice) {
//             case 1: bank.createAccount(); break;
//             case 2: bank.deposit(); break;
//             case 3: bank.withdraw(); break;
//             case 4: bank.transferFunds(); break;
//             case 5: bank.displayAllAccounts(); break;
//             case 6: bank.calculateTotalBankBalance(); break;
//             case 7: bank.countAccounts(); break;
//             case 8: bank.testFunctions(); break;
//             case 9: bank.saveToFile(); cout << "Exiting...\n"; break;
//             default: cout << "Invalid choice! Try again." << endl;
//         }
//     } while (choice != 9);
//     return 0;
// }
