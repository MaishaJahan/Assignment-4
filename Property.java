/**
 * 
 * @author maisha
 *
 */
public class Property{
  private String city;
  private String owner;
  private String propertyName;
  private double rentAmount;
  private Plot plot;

  public Property() {
    this.city = "";
    this.owner = "";
    this.propertyName = "";
    this.rentAmount = 0;
    this.plot = new Plot();
  }

  public Property(Property p) {
    this.city = p.city;
    this.owner = p.owner;
    this.propertyName = p.propertyName;
    this.rentAmount = p.rentAmount;
    this.plot = new Plot(p.plot);
  }

  public Property(String propertyName, String city, double rentAmount, String owner) {
    this.city = city;
    this.owner = owner;
    this.propertyName = propertyName;
    this.rentAmount = rentAmount;
    this.plot = new Plot();
  }

  public Property(String propertyName, String city, double rentAmount, String owner, int x, int y,
      int width, int depth) {
    this.city = city;
    this.owner = owner;
    this.propertyName = propertyName;
    this.rentAmount = rentAmount;
    this.plot = new Plot(x, y, width, depth);
  }

  public String getCity() {
    return city;
  }
  
  public String getOwner() {
    return owner;
  }
  
  public double getRentAmount() {
    return rentAmount;
  }
  
  public Plot getPlot() {
    return plot;
  }  
  
  public String getPropertyName() {
    return propertyName;
  }
  
  public void setCity(String city) {
    this.city = city;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setRentAmount(double rentAmount) {
    this.rentAmount = rentAmount;
  }
  
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }
  
  @Override
  public String toString() {
    return "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to " + owner
        + "\nRent Amount: " + rentAmount;
  }

}