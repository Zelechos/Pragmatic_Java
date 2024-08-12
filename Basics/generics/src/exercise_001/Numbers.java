package exercise_001;

public class Numbers <N>{

    private N firstNumber;
    private N secondNumber;


    public Numbers(N firstNumber, N secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public N getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(N firstNumber) {
        this.firstNumber = firstNumber;
    }

    public N getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(N secondNumber) {
        this.secondNumber = secondNumber;
    }

    public <T> T operation(N firstNumber, N secondNumber, Operations operations){

        switch (operations.name()){

        }
    }
}
