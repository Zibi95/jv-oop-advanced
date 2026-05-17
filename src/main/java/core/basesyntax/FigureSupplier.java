package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private int maxSize;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomizer = new Random();

    FigureSupplier(int maxSize) {
        this.maxSize = maxSize;
    }

    public Figure getRandomFigure() {
        Figures[] avaibleFigures = Figures.values();
        Figures randomFigure = avaibleFigures[randomizer.nextInt(avaibleFigures.length)];
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigure) {
            case CIRCLE: {
                return new Circle(randomColor, randomizer.nextInt(maxSize));
            }
            case RECTANGLE: {
                return new Rectangle(randomColor,
                        randomizer.nextInt(maxSize),
                        randomizer.nextInt(maxSize)
                );
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(randomColor,
                        randomizer.nextInt(maxSize),
                        randomizer.nextInt(maxSize)
                );
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(randomColor,
                        randomizer.nextInt(maxSize),
                        randomizer.nextInt(maxSize),
                        randomizer.nextInt(maxSize)
                );
            }
            default: {
                return new Square(randomColor, randomizer.nextInt(maxSize));
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
