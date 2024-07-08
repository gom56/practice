public abstract class TangibleAsset {
  private String name;
  private int price;
  private String color;
  public TangibleAsset(String name, int price, String color) {
    this.name = name,
    this.price = price;
    this.color = color;
  }
  public String getName() { retum this.name; }
  public int getPrice() { retum this,price; }
  public String getColor() { retum this.color; }
}
