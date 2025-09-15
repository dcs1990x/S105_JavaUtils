# Sprint 1, Task 5: Java Utils
This repository implements the solutions of the exercises on the Java Utils package.

## 📁 Project Structure
The project is implemented in Java, divided into clear responsibilities such as directory traversal, file operations, and object serialization. Each feature is encapsulated in its own method or class to promote reusability and separation of concerns.

## 💻 Technologies
- Java 21+  
- IntelliJ IDEA (Recommended)  
- No external libraries (pure Java)

### 📘 Level 1

#### Exercise 1
A class is created to list all files and folders in a given directory (received as a parameter), displaying the entries in alphabetical order.

#### Exercise 2
A recursive property was added to the previous exercise. For every directory and subdirectory:
Files and subfolders are printed in alphabetical order. Each item is labeled as either a Directory (DIR) or File (FILE). 
The last modified date is shown for each entry.
This provides a structured, clear view of the full directory tree.

#### Exercise 3
Apart from printing the directory structure to the console, the program now writes the output to a .txt file.

#### Exercise 4
Now the program reads the contents of any .txt file and prints it to the console line by line.

#### Exercise 5
The program implements the Serializable interface and allows the user to serialize and deserialize objects.

## ✅ Best Practices Followed
- Proper exception handling for file operations  
- Modularized logic: each responsibility in a dedicated method/class  
- Use of recursive functions to traverse file trees  
- Avoidance of resource leaks using try-with-resources  
- File encoding awareness (UTF-8)  
- Clear naming conventions and inline documentation  
- Serialization that respects Serializable interface requirements  

## ▶️ How to Run
- Clone the repository  
- Open the project using IntelliJ IDEA  
- Compile the code:    

`javac -d bin src/Level_1/Exercise_1/*.java src/Level_1/Exercise_1/model/*.java`   

  Depending on the exercise, the number should be modified in the path (Exercise_2, Exercise_3, etc.).   
- Execute Main.java adding the desired directory:  

`java -cp bin Level_1.Exercise_1.Main "src/Level_1/Exercise_1"`   

In the same way as for the compilation, the number should be modified in the path to be able to execute the program from the terminal (Exercise_2, Exercise_3, etc.).
- Follow the console prompts to test each feature  
- Ensure appropriate read/write permissions for file paths used.  

## 👨‍💻 Author
Developed by Daniel Caldito Serrano as part of the Java Back-end Development Bootcamp conducted by IT Academy.