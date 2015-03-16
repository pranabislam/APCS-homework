public class LList{
    private Node l=null;
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    public String find(int n){
	Node temp = l;
	for(int i = 0;i < n; i ++){
	    temp = temp.getNext();
	}
	return temp.getData();	
    }
    public void insert(int index, String s){
	Node a = new Node(s);
	if(index == 0){
	    add(s);
	}
	else{
	    Node before = l;
	    for(int i = 0; i < index - 1;i ++){
		before = before.getNext();
	    }
	    Node after = l;
	    for(int i = 0; i < index; i ++){
		after = after.getNext();
	    }
	    a.setNext(after);
	    before.setNext(a);
	}
	
    }
}
