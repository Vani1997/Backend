package Static;

class MyClass {
    static int staticVariable;

    static {
        staticVariable = initializeStaticVariable();
    }

    static int initializeStaticVariable() {
        return calculateValue();
    }

    static int calculateValue() {
        // Perform some calculations or logic to determine the initial value
        return 100;
    }
}

