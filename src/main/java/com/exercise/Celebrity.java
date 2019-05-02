package com.exercise;

public class Celebrity {

    static int [][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        Celebrity.matrix = matrix;
    }


    public  boolean isCelebrity(String person, String [] people, int posArray) {
        int tam = posArray;
        if ((tam < people.length) && (doKnow(person, people[tam])))  {
            return false;
        } else if (tam == people.length - 1) {
            return true;
        } else {
            return isCelebrity(person, people, posArray + 1);
        }
    }

    public  boolean doKnow(String originPerson, String destinyPerson){
        if (originPerson.equals(destinyPerson)) {
            return false;
        }
        int fil = Character.getNumericValue(originPerson.charAt(1));
        int col = Character.getNumericValue(destinyPerson.charAt(1));

        return (matrix[fil][col] == 0) ? false : true;
    }
}
