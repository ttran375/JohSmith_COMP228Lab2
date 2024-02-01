# LAB \#2 – Java Methods

## Exercise 1

Write a Java application that simulates a test. The test contains **at
least five** questions about first three lectures of this course. Each
question should be a multiple-choice question with 4 options.

Design a **Test** class. Use programmer-defined methods to implement
your solution. For example:

- create a method to simulate the questions – *simulateQuestion*

- create a method to check the answer – *checkAnswer*

- create a method to display a random message for the user –
  *generateMessage*

- create a method to interact with the user - *inputAnswer*

Display the questions using methods of ***JOptionPane*** class. Use a
loop to show all the questions.

For each question:

- If the user finds the right answer, display a random congratulatory
  message (“Excellent!”,”Good!”,”Keep up the good work!”, or “Nice
  work!”).

- If the user responds incorrectly, display an appropriate message and
  the correct answer (“No. Please try again”, “Wrong. Try once more”,
  “Don't give up!”, “No. Keep trying..”).

- Use random-number generation to choose a number from 1 to 4 that will
  be used to select an appropriate response to each answer.

- Use a switch statement to issue the responses, as in the following
  code:

``` java
switch ( randomObject.nextInt( 4 ) )
{
    case 0:
    return( "Very good!" );
    // ……
}

```

At the end of the test display the number of correct and incorrect
answers, and the percentage of the correct answers.

Your main class will simply create a Test object and start the test by
calling **inputAnswer** method.

(5 marks)

## Exercise 2

Design a Lotto class with one array instance variable to hold three
random integer values (from 1 to 9). Include a constructor that randomly
populates the array for a lotto object. Also, include a method in the
class to return the array.

Use this class to simulate a simple lotto game in which the user chooses
a number between 3 and 27. *The user runs the lotto up to 5 times and
each time the sum of lotto numbers is calculated*. *If the number chosen
by the user matches the sum*, the user wins and the game ends. *If the
number does not match the sum within five rolls*, the computer wins.

Use methods of JOptionPane class to interact with the user.

(3 marks)

## Exercise 3

Write a Java class that implements a set of three overloaded static
methods. The methods should have different set of parameters and perform
similar functionalities. Call the methods within main method and display
the results.

(2 marks)

**Evaluation:**

<table>
<colgroup>
<col style="width: 50%" />
<col style="width: 49%" />
</colgroup>
<thead>
<tr class="header">
<th><strong>Functionality</strong></th>
<th></th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><blockquote>
<p>Correct implementation of classes (instance variable declarations,
constructors, getter and setter methods, etc.)</p>
</blockquote></td>
<td>40%</td>
</tr>
<tr class="even">
<td><blockquote>
<p>Correct implementation of driver classes (declaring and creating
objects, calling their methods, interacting with user, displaying
results)</p>
</blockquote></td>
<td>40%</td>
</tr>
<tr class="odd">
<td><blockquote>
<p>Comments, correct naming of variables, methods, classes, etc.</p>
</blockquote></td>
<td>5%</td>
</tr>
<tr class="even">
<td><strong>Friendly input/output</strong></td>
<td>15%</td>
</tr>
<tr class="odd">
<td><strong>Total</strong></td>
<td>100%</td>
</tr>
</tbody>
</table>
