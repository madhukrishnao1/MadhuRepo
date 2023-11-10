package in.madhu.model;

public class Player {
  String name;
  int id;
  
public Player() {
	super();
	// TODO Auto-generated constructor stub
}

public Player(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Player [name=" + name + ", id=" + id + "]";
}
  
}
