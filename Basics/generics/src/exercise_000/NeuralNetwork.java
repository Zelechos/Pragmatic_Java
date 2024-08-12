package exercise_000;

public class NeuralNetwork<T extends IA> {

    private final T neuralNetwork;

    public NeuralNetwork(T neuralNetwork) {
        this.neuralNetwork = neuralNetwork;
    }

    public void train() {
        String typeOfNeuralNetwork = this.neuralNetwork.getClass().getSimpleName();
        System.out.println("Training the Neural Network of type --> " + typeOfNeuralNetwork);
    }
}
