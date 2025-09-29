# Bank-Account-Simulation

🏦 Bank Account Simulation
📌 Introduction

The Bank Account Simulation is a Java console-based project that mimics real-world banking operations.
It applies Object-Oriented Programming (OOP) principles like encapsulation, classes, objects, and methods to manage multiple bank accounts.
The system allows users to deposit, withdraw, transfer funds, check balances, and view transaction history in an interactive menu-driven interface.

🎯 Objectives

Demonstrate Java OOP concepts through a practical banking simulation.

Maintain secure account balance with controlled access.

Record transaction history for accountability.

Provide a menu-driven system for user-friendly interaction.

Build a foundation for scalable banking applications.

🛠️ Features

✔️ Create Accounts with unique account number, holder name, and balance
✔️ Deposit money into account
✔️ Withdraw money with validation (no overdraft)
✔️ Transfer Funds between accounts
✔️ Display Account Details (holder, number, balance)
✔️ Transaction History (all deposits, withdrawals, transfers stored)
✔️ Menu-driven Console Interface for easy navigation
✔️ Exit option to terminate safely

🏗️ System Design
🔹 Class Diagram (UML Explanation)
+----------------+
|   Account      |
+----------------+
| - accountNo    |
| - accountHolder|
| - balance      |
| - history[]    |
+----------------+
| + deposit()    |
| + withdraw()   |
| + transfer()   |
| + display()    |
| + showHistory()|
+----------------+

+------------------+
| BankSimulation   |
+------------------+
| + main()         |
+------------------+


Account Class → Handles account operations (deposit, withdraw, transfer, history).

BankSimulation Class → Provides menu-driven interface for user interaction.

📂 Project Structure
BankAccountSimulation/
│── Account.java          # Defines the Account class
│── BankSimulation.java   # Menu-driven main program
│── README.md             # Documentation

▶️ How to Run

Clone the repository:

git clone https://github.com/your-username/BankAccountSimulation.git
cd BankAccountSimulation


Compile the program:

javac BankSimulation.java


Run the program:

java BankSimulation

💻 Example Execution
=== 🏦 Bank Menu ===
1. Deposit
2. Withdraw
3. Transfer
4. Display Account Info
5. Transaction History
6. Exit
👉 Enter your choice: 3
Enter Source Account (1001/1002): 1001
Enter Target Account (1001/1002): 1002
Enter Amount: 1500
✅ Withdrawn: 1500.0 | Balance: 3500.0
✅ Deposited: 1500.0 | Balance: 4500.0
🔄 Transferred 1500.0 to Nehru

🚀 Future Enhancements

🔹 Dynamic account creation (instead of hardcoded accounts)
🔹 File storage (save account info & transaction history for persistence)
🔹 Interest calculation for savings accounts
🔹 Loan module for advanced simulation
🔹 Graphical User Interface (GUI) using JavaFX or Swing

📖 Learning Outcomes

By completing this project, you will:

Strengthen understanding of OOP in Java (classes, objects, encapsulation).

Learn how to design real-world systems with modular code.

Practice ArrayList usage for maintaining transaction history.

Implement menu-driven applications using Scanner and loops.

Understand how banking operations can be modeled in software.

🙏 Acknowledgements & Thank You

Thanks for reviewing my project 💙
This project was built as part of my Java programming practice to understand how OOP concepts can be applied to real-world simulations.
