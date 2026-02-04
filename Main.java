
// PARTNER NAME: Kaan Kocaman
// CS111 SECTION #: SP26 CS 111 1258
// DATE: 2/4/26
// PROGRAM DESCRIPTION: Prints a low-resolution Employment Authorization Card (EAC)
// using ASCII/Unicode art and variables to simulate data pulled from a database.

public class Main
{
	public static void main(String[] args)
	{
		// DECLARATION + INITIALIZATION SECTION
		String surname = "GARCIA";
		String givenName = "MARIA";
		String uscisNumber = "123-456-789";
		String category = "C33";
		String cardNumber = "EAC987654321";
		String countryOfBirth = "MEXICO";
		String terms = "AUTHORIZED TO WORK";
		String dateOfBirth = "01 JAN 2002";
		char sex = 'F';
		String validFrom = "02/01/26";
		String expires = "02/01/28";

		// INPUT SECTION
		// N/A

		// CALCULATION SECTION
		// N/A

		// OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         UNITED STATES OF AMERICA                                      ║");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD        ║");
		System.out.println("║                       Surname                                         ║");
		System.out.println("║                       " + surname + "                                      ║");
		System.out.println("║  .----.    .----.     Given Name                                      ║");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + "                                     ║");
		System.out.println("║        |  |           USCIS#         Category   Card#                 ║");
		System.out.println("║       _/  \\_          " + uscisNumber + "    " + category + "        " + cardNumber + "      ║");
		System.out.println("║      (_    _)         Country of Birth                                ║");
		System.out.println("║   ,    `--`    ,      " + countryOfBirth + "                                   ║");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions                            ║");
		System.out.println("║    \\          /       " + terms + "                           ║");
		System.out.println("║     '.--..--.'        Date of Birth   Sex                              ║");
		System.out.println("║       `\"\"\"\"\"`         " + dateOfBirth + "     " + sex + "                                ║");
		System.out.println("║                       Valid From:     " + validFrom + "                       ║");
		System.out.println("║                       Card Expires:   " + expires + "                       ║");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.                    ║");
		System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
	}
}

// ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
