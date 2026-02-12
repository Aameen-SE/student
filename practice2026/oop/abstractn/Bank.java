package practice2026.oop.abstractn;
//🔹 Question 3 – Bank System (Real Interview Style)
//👉 Problem:
//
//Create abstract class Bank:
//
//abstract method getInterestRate()
//
//Create:
//
//SBI → return 7%
//
//HDFC → return 8%
//
//In main:
//
//Create reference of type Bank
//
//Assign object of SBI
//
//Print interest rate
//
//Assign object of HDFC
//
//Print interest rate
//
//🎯 Goal: Runtime polymorphism with abstraction



public abstract class Bank {

    abstract int getInterestRate();

}
