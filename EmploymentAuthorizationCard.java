/**
 * ------------------------------------------------------------
 * Lab 02 - DACA + Output
 * Program Name: EmploymentAuthorizationCard.java
 * Author: Kaan
 * Date: February 2026
 * Description:
 * This program simulates a low-resolution replacement
 * Employment Authorization Card (EAC) using ASCII/Unicode art.
 * It demonstrates the use of variables and formatted output.
 * ------------------------------------------------------------
 */

public class EmploymentAuthorizationCard {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        // Variables (EAC Data)
        // ------------------------------------------------------------
        String cardType = "EMPLOYMENT AUTHORIZATION";
        String category = "C33 (DACA)";
        String name = "Alex Martinez";
        String uscisNumber = "A123-456-789";
        String cardNumber = "SRC1234567890";
        String country = "MEXICO";
        String birthDate = "05/14/2002";
        String sex = "M";
        String validFrom = "01/15/2026";
        String validTo = "01/14/2028";

        // ------------------------------------------------------------
        // Output (EAC ASCII / Unicode Art)
        // ------------------------------------------------------------
        System.out.println("┌──────────────────────────────────────────────────────┐");
        System.out.println("│  U.S. DEPARTMENT OF HOMELAND SECURITY                  │");
        System.out.println("│  UNITED STATES OF AMERICA                              │");
        System.out.println("├──────────────────────────────────────────────────────┤");
        System.out.println("│  " + cardType + "                           │");
        System.out.println("│  Category: " + category + "                             │");
        System.out.println("│                                                      │");
        System.out.println("│  Name: " + name + "                          │");
        System.out.println("│  USCIS#: " + uscisNumber + "                   │");
        System.out.println("│  Card#:  " + cardNumber + "               │");
        System.out.println("│                                                      │");
        System.out.println("│  Country of Birth: " + country + "                     │");
        System.out.println("│  Date of Birth:    " + birthDate + "                   │");
        System.out.println("│  Sex:              " + sex + "                           │");
        System.out.println("│                                                      │");
        System.out.println("│  Valid From: " + validFrom + "                          │");
        System.out.println("│  Valid To:   " + validTo + "                          │");
        System.out.println("├──────────────────────────────────────────────────────┤");
        System.out.println("│  THIS CARD IS A TEMPORARY PRINTED REPLACEMENT         │");
        System.out.println("│  AUTHORIZED BY USCIS UNTIL OFFICIAL CARD ARRIVES      │");
        System.out.println("└──────────────────────────────────────────────────────┘");
    }
}
