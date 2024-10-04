# Simple-Calculator Using KOTLIN

This is a basic Android application that performs simple arithmetic operations like addition, subtraction, multiplication, and division. The app is built using LinearLayout and includes two input fields where users can enter numbers, buttons for operations, and a text view to display the result.

#Features
Simple and easy-to-use interface.
Supports basic arithmetic operations: Addition (+), Subtraction (-), Multiplication (*), and Division (/).
Edge-to-edge display for a modern look.
Technologies Used
Android Studio: For developing the app.
Kotlin: For writing the logic in MainActivity.kt.
XML: For designing the user interface.
Edge-to-edge layout: Using WindowInsetsCompat and ViewCompat.
UI Overview
TextView: Displays the title "Simple Calculator."
EditText: Two input fields for users to enter numbers.
Buttons: Four buttons for different arithmetic operations.
TextView: Displays the result of the calculation.
Files Overview
1. activity_main.xml (UI Layout)
This XML file defines the user interface using a LinearLayout. It consists of two input fields for numbers, buttons for arithmetic operations, and a text view to display the result.

Key Components:
EditText fields: For user input of two numbers.
Buttons: Four buttons for arithmetic operations (+, -, *, /).
TextView: Displays the result of the calculation.
2. MainActivity.kt (Kotlin Logic)
This Kotlin file is the main activity for the app. It initializes the edge-to-edge display and includes logic for handling window insets using WindowInsetsCompat.

Key Code:
enableEdgeToEdge(): Enables edge-to-edge display for modern app design.
ViewCompat.setOnApplyWindowInsetsListener(): Sets system bars padding for a better user experience.
Steps to Run the Project
Install Android Studio: Download and install Android Studio from here.
Clone or Download the Project: You can clone this repository or download the ZIP file of the project.
Open the Project: Launch Android Studio and open the project folder.
Build and Run: Click the green play button or select "Run" from the top menu. Ensure your device or emulator is set up.
Test the Calculator: Enter two numbers and select an operation. The result will be displayed in the result TextView.
