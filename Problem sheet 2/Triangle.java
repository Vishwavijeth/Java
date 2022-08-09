class Triangle
{
    int x;
    int y;
    int z;
    double length;
    double width;
    double area;
    String colour;
   
    Triangle()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
   
    Triangle(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
   
    void set_length(int l)
    {
        length = l;
    }
   
    void set_width(int w)
    {
        width = w;
    }
   
    void set_colour(String s)
    {
        colour = s;
    }
   
    void find_area()
    {
        area = (length * width)/2;
        System.out.print("\nArea of Triangle : " +area);
    }
   
    Boolean isTriangle()
    {
        if(this.x + this.y > this.z)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    Boolean isIsosceles()
    {
        if(this.x == this.y || this.y == this.z || this.z == this.x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    Boolean isScalene()
    {
        if(this.x != this.y && this.y != this.z && this.z != this.x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    Boolean isEquilateral()
    {
        if(this.x == this.y && this.z == this.y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    public static void main(String[] args)
    {
        Triangle t = new Triangle(3,3,5);
        Triangle t1 = new Triangle(4,4,9);
       
        t.set_length(6);
        t.set_width(5);
        t.set_colour("Red");
       
        t1.set_length(6);
        t1.set_width(5);
        t1.set_colour("Red");
        t1.find_area();
       
       
        t.find_area();
        if(t.isTriangle())
        {
            System.out.print("\nIts a triangle");
        }
       
        if(t.isIsosceles())
        {
            System.out.print("\nIts a Isosceles triangle");
        }
    }
}
