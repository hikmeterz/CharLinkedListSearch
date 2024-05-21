
# Char Linked List Search

## Project Description
This repository contains a Java program that implements a singly linked list to store characters from a given string. It searches for a second string within the linked list and outputs the characters before and after the found string, formatted according to specific rules.

## Files
- `Node.java`: Defines the node structure used in the linked list.
- `LinkedList.java`: Implements the linked list structure and its operations such as adding elements and searching.
- `Main.java`: Main class to test the linked list operations by taking user input and producing the required output.

## Algorithm Explanation

### Node Class
The `Node` class defines the basic unit of the linked list. Each node contains:
- A character (`char harf`): The data stored in the node.
- A reference to the next node (`Node next`): Points to the next node in the list.

### LinkedList Class
The `LinkedList` class manages the nodes and provides methods to manipulate the list:
- `addLast(char harf)`: Adds a new node with the specified character to the end of the list.
  - If the list is empty (`head` is `null`), the new node becomes the head.
  - Otherwise, it traverses the list to find the last node and sets its `next` reference to the new node.
- `bul(String input)`: Searches for a given string in the list.
  - Traverses the list from the head node.
  - Constructs strings from the characters in the nodes and compares them with the input.
  - If the input string is found, it outputs the characters before and after the string, formatted with '-' or '$' characters.
  - If the input string is not found, it outputs "String bulunamadi."

### Main Class
The `Main` class contains the main method to run the application:
- Creates an instance of `LinkedList`.
- Uses a `Scanner` to take user input.
- Splits the input string based on the delimiter `|`.
- Adds characters from the first part of the input to the linked list.
- Uses the second part of the input as the search term.
- Tests the search functionality and outputs the results according to the specified rules.

### Example Workflow
1. The user inputs a string: `Veriyapilari | yapi`.
2. The program splits the string based on the delimiter `|`.
3. The first part (`Veriyapilari`) is added to the linked list.
4. The second part (`yapi`) is used as the search term.
5. The program searches for `yapi` in the linked list and outputs the characters before and after the found string, formatted with '-' or '$' characters.
