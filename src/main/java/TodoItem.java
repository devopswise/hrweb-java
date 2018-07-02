

public class TodoItem {

  private int id;
  private String fullName;
  
  public TodoItem(int id, String item) {
    this.id = id;
    this.fullName = item;
  }

  public String getItem() {
    return fullName;
  }

  public void setItem(String item) {
    this.fullName = item;
  }

  public int getId() {
    return id;
  }
  
}
