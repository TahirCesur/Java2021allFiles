package HalukHocaGithub._11_Constrıctor;

public class MultilevelB extends MultilevelA {
	
	public void canCook() {
		System.out.println("parent they have a special recipe");
	}
	
	//printF which is static and
	 // call or reuse that method into class B

	public static void main(String[]args) {
		
		printF();
	}
}
