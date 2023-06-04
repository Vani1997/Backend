package instancevariable;

class Child extends Parent {
    public int childVariable;

    public Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super(0); // Default value for parentVariable
        this.childVariable = childVariable;
    }
}

