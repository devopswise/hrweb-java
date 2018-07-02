import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestTodo {

  @Test
  public void testOperations() throws SQLException, ClassNotFoundException {

    List<String> list = new ArrayList<String>();
    List<TodoItem> todoList = new ArrayList<TodoItem>();

    String dbUser = System.getenv("HRWEB_DB_USER");
    String dbPass = System.getenv("HRWEB_DB_PASS");
    String dbHost = System.getenv("HRWEB_DB_HOST");
    String dbName = System.getenv("HRWEB_DB_NAME");
    String dbPort = System.getenv("HRWEB_DB_PORT");    
	    
    TodoList app = new TodoList(dbUser, dbPass, "mysql", dbHost, Integer.parseInt(dbPort), dbName);

    list.add("Redesign toolbar");
    list.add("Implement all pages of site");
    list.add("Buy small travel toothpaste and contact lens solution");
    list.add("Feed the dog");
    app.addItems(list);

    todoList = app.getAllItems();
    assertEquals(4, todoList.size());

    app.deleteItem("Feed the dog");
    todoList = app.getAllItems();
    assertEquals(3, todoList.size());

    todoList = app.getAllItems();
    for (TodoItem item : todoList) {
      System.out.println(item.getId() + "\t" + item.getItem());
    }

  }

}
