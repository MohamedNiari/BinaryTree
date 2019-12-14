package tree;

public class Test {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		
		System.out.println("-> Creation de l'arbre");
		tree.insert(9);
		tree.insert(7);
		tree.insert(5);
		tree.insert(8);
		tree.insert(2);			
		tree.insert(6);			
		tree.insert(13);
		tree.insert(17);		
		tree.insert(16);
		
		System.out.println("-> Valeurs de l'arbre par ordre croissant :");
		tree.traverse();	
		
		System.out.println("-> Retourne le Node avec la valeur 8 :");
		System.out.println(tree.find(8));		
		
		System.out.println("-> Retourne le Node avec la valeur 17 :");
		System.out.println(tree.find(17));
		
		System.out.println("-> Retourne NULL car pas de Node avec la valeur 4 :");
		System.out.println(tree.find(4));
	}

}
