🎮 Tic Tac Toe Game – Java Console Project

A simple 2-Player Tic Tac Toe game built using Core Java. This project runs in the console (terminal) and allows two users to play alternately with full input validation, win detection, and draw handling.

🚀 Features

✅ 3×3 Tic Tac Toe Board

✅ Two-player support (X vs O)

✅ Turn switching (X starts first)

✅ Win detection (rows, columns, diagonals)

✅ Draw detection

✅ Invalid input handling

✅ Prevents overwriting a slot

✅ Clean board display after every move

🛠️ Technologies Used

Java

OOP Concepts

Arrays

Loops

Exception Handling

Scanner for Input

📂 Project Structure
TicTacToe.java

▶️ How to Run the Project

Make sure Java is installed:

java -version


Compile the program:

javac TicTacToe.java


Run the program:

java TicTacToe

🎯 How to Play

The game starts with Player X

Enter a number between 1 to 9 to place your mark

Players take turns until:

✅ One player wins

🤝 The game ends in a draw

🖥️ Sample Output
Welcome to Tic-Tac-Toe

| 1 | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |
|---|---|---|
| 7 | 8 | 9 |

X's turn. Enter slot number:

🧠 Game Logic

The board is stored using a String array

All 8 possible winning combinations are checked using a loop and switch-case

A draw is detected when no numeric slots remain

Turns are switched using a ternary operator
