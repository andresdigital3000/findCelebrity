# findCelebrity
In a team of n people, a celebrity is known by everyone but he doesn't know anybody

There are several ways to do this exercise. On this case, im gointg to use recursion.


ASSUMPTIONS

- The information is saved in memory in form of a matrix
        A0   B1  C2  D3
    A0   0   0   1   0
    B1   0   0   1   0
    C2   0   0   0   0
    D3   0   0   1   0
   
- Each person in array of people must have a letter and position in the matrix
  Example: int [][] matrix = {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
  
- It is used JUnit for TDD
