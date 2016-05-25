import java.util.ArrayList;


public class Domain extends DefaultTreeNode {
	protected ArrayList<SimpleTreeNode> secondlvl = new ArrayList<SimpleTreeNode>();
	protected ArrayList<SimpleTreeNode> thirdlvl = new ArrayList<SimpleTreeNode>();
	protected ArrayList<SimpleTreeNode> fourthlvl = new ArrayList<SimpleTreeNode>();;
	
	public Domain (String Name, int id){
	super (Name, id, 1);
	this.secondlvl = this.getAllChilds();
	this.thirdlvl = this.getAll3LVL();
	this.fourthlvl = this.getAll4LVL();
	}
public ArrayList<SimpleTreeNode> getAll2LVL(){
     return this.secondlvl;
}
public ArrayList<SimpleTreeNode> getAll3LVL(){
	ArrayList<SimpleTreeNode> grandsons = new ArrayList<SimpleTreeNode>();
	for (SimpleTreeNode i : this.secondlvl){
             grandsons.addAll(i.getAllChilds());
	}
	return grandsons;
}

public ArrayList<SimpleTreeNode> getAll4LVL(){
	ArrayList<SimpleTreeNode> grandgrandsons = null;
	for (SimpleTreeNode i : this.thirdlvl){
        grandgrandsons.addAll(i.getAllChilds());
}
	return grandgrandsons;
}
}
