package ija.homework1.uml;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//Class UMLOperation
public class UMLOperation extends UMLAttribute{
    List<UMLAttribute> type;

    //Constructor
    public UMLOperation(java.lang.String name, UMLClassifier type)
    {
        super(name, type);
        this.type = new ArrayList<UMLAttribute>();
    }



    //Methods
    public static UMLOperation create(java.lang.String name, UMLClassifier type, UMLAttribute... args)
    {
        UMLOperation object = new UMLOperation(name, type);

        for (UMLAttribute arg : args)
            object.addArgument(arg);

        return object;
    }

    public boolean addArgument(UMLAttribute arg)
    {
        if (this.type.contains(arg) == false)
        {
            if (this.type.add(arg) == true)
                return true;
        }
        return false;
    }

    public java.util.List<UMLAttribute> getArguments()
    {
        return Collections.unmodifiableList(this.type);
    }
}
