# MakeChangeProject

## How To Run
To run this project, follow these steps:

1. Use an IDE or navigate to the project directory in the terminal.
2. Compile the program.
3. Execute the program.
4. Follow the prompts in the terminal for user input.

**Note:** After each iteration, users need to re-execute the program from the terminal.

## Project Description

The MakeChangeProject is a simple program designed to calculate a customer's change. The workflow is as follows:

1. Prompt the user to input the amount due for the purchase.
2. Ask the user for the amount given by the customer.
3. Utilize this information to calculate the change due.
4. Display the change to the user in the format of US Currency denominations.

Example: "The change due to the customer is: 4 x $20 bills"

## Technologies Used
- Math.round
- if statements
- Integer casting
- Method calling
- Arrays

## Lessons Learned
This project presented two main challenges:

1. **Logic Design:**
   - Implementing logic to understand US Currency denominations.
   - Using an array for handling denominations.
   - Choosing appropriate data types for calculations.

2. **Handling Pennies:**
   - Addressing an issue where pennies printed out less than expected.
   - Resolving the problem by rounding the double value up using Math.round before implicit conversion to the int data type.
