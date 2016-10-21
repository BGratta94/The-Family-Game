package the.family;


/**
 *
 * @author Brandon
 */
public class Item 
{
    private String name;
    private String description;
    private int id;
    
    public Item(int id)
    {
        if(id == 0)
        {
            name = "glock";
            description = "A standard police issue issue handgun. Semi-Automatic. Best used at medium to close range encounters.";
            id = 0;
        }
        else if(id == 1)
        {
            name = "magazine";
            description = "A 17 round magazine. Used for the Glock 22.";
            id = 1;
        }
        
    }
    
    public Item(String name, String description, int id)
    {
        this.name = name;
        this.description = description;
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getID()
    {
        return id;
    }
}
