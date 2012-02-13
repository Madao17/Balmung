package test;

import java.util.LinkedList;

import entityGame.*;

public class Test extends EntityGame{

	public Test() {
		super("Test", 800, 600);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
		
		Box b = new Box("Box", 0, 100, 28, 31, "src/img/box.jpg");
		
		
		
		LinkedList<Entity> testScene = new LinkedList<Entity>();
		testScene.add(b);
		
		scenes.add(testScene);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		//t.init();
		t.start();
	}
}
