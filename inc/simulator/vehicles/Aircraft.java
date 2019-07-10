public class Aircraft 
{
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    protected long idCounter = 0;

protected Aircraft(String name, Coordinates coordinates) 
{
    this.name = name;
    this.coordinates = coordinates2;
    this.id = this.nextId();
}

private long nextId()
{
        return ++(Aircraft.idCounter);
}
}