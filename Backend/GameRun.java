package Task;


class Mario{

	void up(){
		System.out.print("Mario Up");
	}

	void down(){
		System.out.print("Mario Down");
	}

	void left(){
		System.out.print("Mario Left");
	}

	void right(){
		System.out.print("Mario Right");
	}
}

class Pacman{

	void up(){
		System.out.print("Pacman Up");
	}

	void down(){
		System.out.print("Pacman Down");
	}

	void left(){
		System.out.print("Pacman Left");
	}

	void right(){
		System.out.print("Pacman Right");
	}

}

class Contra{

	void up(){
		System.out.print("Contra Up");
	}

	void down(){
		System.out.print("Contra Down");
	}

	void left(){
		System.out.print("Contra Left");
	}

	void right(){
		System.out.print("Contra Right");
	}
}

public class GameRun{
	
	
	
	void rungame(Mario ob){	
		ob.up();
		ob.down();
		ob.left();
		ob.right();
	}

	public static void main(String[] Args){
	
	Mario ob=new Mario();
	
	GameRun obj=new GameRun();

	obj.rungame(ob);
   
	}

}



