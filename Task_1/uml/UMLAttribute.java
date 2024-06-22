package ija.homework1.uml;

//Class UMLAttribute
public class UMLAttribute extends Element
{
    UMLClassifier type;

    //Constructor
    public UMLAttribute(java.lang.String name, UMLClassifier type)
    {
        super(name);
        this.type = type;
    }

    //Methods
    public UMLClassifier getType()
    {
        return this.type;
    }

    public java.lang.String toString()
    {
        return String.format("%s:%s", this.name, this.type);
    }
}
