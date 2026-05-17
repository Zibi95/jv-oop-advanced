package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(100);
        int numOfFigures = 6;

        for (int i = 0; i < numOfFigures; i++) {
            int half = numOfFigures / 2;
            Figure figure = i < half
                    ?
                    figureSupplier.getRandomFigure()
                    :
                    figureSupplier.getDefaultFigure();

            figure.draw();
        }
    }
}
