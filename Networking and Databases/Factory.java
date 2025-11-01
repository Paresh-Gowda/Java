interface Shape
{
    void draw();
}
class Circle implements Shape
{
    public void draw()
    {
        System.out.println("Circle");
    }
}
class Rectangle implements Shape
{
    public void draw()
    {
        System.out.println("Rectangle");
    }
}
class Pattern
{
    public Shape createShape(String shapeType)
    {
        if("Circle".equalsIgnoreCase(shapeType))
        {
            return new Circle();
        }
        else if("Rectangle".equalsIgnoreCase(shapeType))
        {
            return new Rectangle();
        }
        else
        {
            return null;
        }
    } 
}
class Factory_Pattern
{
    public static void main(String args[])
    {
        Pattern p=new Pattern();
        Shape circle=p.createShape("Circle");
        circle.draw();
        Shape rectangle=p.createShape("Rectangle");
        rectangle.draw();
    }
}