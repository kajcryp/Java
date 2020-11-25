package com.company;

public class srcMathLibrary {
    // Private variables/functions.
    private int favenum;

    // Constructor
    public srcMathLibrary() {
        SetFaveNum(7);
    }

    // Overloaded constructor, so we can set the fave number up when we create an object.
    public srcMathLibrary(int fave) {
        SetFaveNum(fave);
    }

    // Public variables/functions.
    public int Add(int a, int b) {
        return a + b;
    }

    public void PrintFaveNum() {
        System.out.println(GetFaveNum());
    }

    public int GetFaveNum() {
        return this.favenum;
    }

    public void SetFaveNum(int fave) {
        this.favenum = fave;
    }
}
