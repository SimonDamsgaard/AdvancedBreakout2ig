package Model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Platform extends Rectangle {
    private final double ogPlatformWidth = OptionsModel.getSceneWidth() / 4;
    private final double ogPlatformHeight = OptionsModel.getSceneHeight() / 30;
    private final double ogX = OptionsModel.getSceneWidth() / 2 - ogPlatformWidth / 2;
    private final double ogY = OptionsModel.getSceneHeight() * 0.8;
    private static final double platformWidth = OptionsModel.getSceneWidth() / 4;
    private static final double platformHeight = OptionsModel.getSceneHeight() / 30;
    private static final double x = OptionsModel.getSceneWidth() / 2 - platformWidth / 2;
    private static final double y = OptionsModel.getSceneHeight() * 0.8;

    private double velocity = 4;
    private boolean isMovingLeft;
    private boolean isMovingRight;

    public Platform() {
        super(x, y, platformWidth, platformHeight);
        setFill(Color.DARKGRAY); 
    }

    public void updatePosition() {
        if (isMovingLeft()) {
            setX(getX() - velocity);
        }
        if (isMovingRight()) {
            setX(getX() + velocity);
        }
        if (getX() < 0) {
            setX(0);
        } else if (getX() + getWidth() > OptionsModel.getSceneWidth()) {
            setX(OptionsModel.getSceneWidth() - getWidth());
        }
    }

    // Getters Setter & Adders
    public void addPlatformWidth(double platformWidth) { setWidth(getWidth()+platformWidth); }
    public double getVelocity() { return this.velocity; }
    public void setVelocity(double velocity) { this.velocity = velocity; }
    public void addVelocity(double velocity) { this.velocity += velocity; }
    public boolean isMovingLeft() { return isMovingLeft; }
    public void setMovingLeft(boolean bool) { this.isMovingLeft = bool; }
    public boolean isMovingRight() { return isMovingRight; }
    public void setMovingRight(boolean bool) { this.isMovingRight = bool; }
    public double getOgplatformwidth() { return ogPlatformWidth; }
    public double getOgplatformheight() { return ogPlatformHeight; }
    public double getOgx() { return ogX; }
    public double getOgy() { return ogY; }

    //Resets Platforms position and Velocity when changing level
    public void reset() {
        setWidth(Math.min(getWidth(), OptionsModel.getSceneWidth()/2));
        setX(OptionsModel.getSceneWidth() / 2 - getWidth() / 2);
        setY(OptionsModel.getSceneHeight() * 0.8);
    }
}
